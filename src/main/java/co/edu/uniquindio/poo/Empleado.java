package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Empleado extends Usuario implements ITransaccionable {
    private static int ultimoCodigo = 0;
    public int idEmpleado;
    public Collection<Vehiculo> vehiculos;
    public Collection<Cliente> clientes;
    public Collection<Transaccion> transacciones;
    public boolean activo;

    public Empleado(String nombre, String clave, String preguntaSeguridad, String respuestaSeguridad, double salario,
            int idEmpleado, boolean activo, String tipoUsuario) {
        super(nombre, clave, preguntaSeguridad, respuestaSeguridad, salario, tipoUsuario);
        this.idEmpleado = idEmpleado;
        vehiculos = new LinkedList<>();
        clientes = new LinkedList<>();
        transacciones = new LinkedList<>();
        this.activo = activo;
    }


    ///////////////////////////////////////////Getters and Setters///////////////////////////////////////
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getTipoUsuario() {
        return "Empleado";
    }

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Collection<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Collection<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", clave=" + clave + ", idEmpleado=" + idEmpleado + ", vehiculos="
                + vehiculos + ", clientes=" + clientes + ", transacciones=" + transacciones + ", activo=" + activo
                + "]";
    }

    ////////////////////////////////////////////////////// METODOS
    ////////////////////////////////////////////////////// /////////////////////////////////////////////////////////////////////////////////

    public boolean actualizarCliente(String cedula, Cliente actualizado) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente().equals(cedula)) {
                cliente.setIdCliente(actualizado.getIdCliente());
                cliente.setNombre(actualizado.getNombre());
                cliente.setTelefono(actualizado.getTelefono());
                cliente.setDireccion(actualizado.getDireccion());
                centinela = true;
                break;
            }
        }
        return centinela;
    }
    /**
     * Metodo para verificar la existencia de un vehiculo
     * 
     * @param placa
     * @return
     */
    public boolean verificarVehiculo(String placa) {
        boolean bandera = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                bandera = true;
            }
        }
        return bandera;
    }

    /**
     * Metodo para agregar a un vehiculo
     * 
     * @param vehiculo
     */
    public void agregarVehiculo(Vehiculo vehiculo) throws VehiculoYaExisteException {
        if (verificarVehiculo(vehiculo.getPlaca())) {
            throw new VehiculoYaExisteException("El vehículo con placa " + vehiculo.getPlaca() + " ya existe.");
        }
        vehiculos.add(vehiculo);
    }

    /**
     * Metodo para verificar la existencia de un cliente
     * 
     * @param idCliente
     * @return
     */
    public boolean verificarCliente(String idCliente) {
        boolean bandera = false;
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente().equals(idCliente)) {
                bandera = true;
            }
        }
        return bandera;
    }

    /***
     * Metodo para agregar a un cliente
     * 
     * @param cliente
     */
    public boolean agregarCliente(Cliente cliente) throws ClienteYaExisteException {
        if (verificarCliente(cliente.getIdCliente())) {
            throw new ClienteYaExisteException("El cliente con ID " + cliente.getIdCliente() + " ya existe.");
        }
        clientes.add(cliente);
        return true;
    }

    /**
     * Metodo que genera un codigo para la transaccion
     * 
     * @return
     */
    private static int generadorCodigo() {
        ultimoCodigo++;
        return ultimoCodigo;
    }

    /**
    * Metodo que realiza la venta del vehiculo
    *- vehiculo: el vehículo que se va a vender
    * fechaTransaccion: la fecha en que se realiza la transacción
    * cliente: el cliente que compra el vehículo
    * Excepciones lanzadas:
    * VehiculoNoEncontradoException: si el vehículo no se encuentra en el inventario
    * TransaccionInvalidaException: si la transacción no es válida
    */
    public boolean realizarVenta(Vehiculo vehiculo, LocalDate fechaTransaccion, Cliente cliente)
            throws VehiculoNoEncontradoException, TransaccionInvalidaException {
        if (!verificarVehiculo(vehiculo.getPlaca())) {
            throw new VehiculoNoEncontradoException(
                    "El vehículo con placa " + vehiculo.getPlaca() + " no se encuentra en el inventario.");
        }
        Transaccion transaccionventa = new Venta(generadorCodigo(), fechaTransaccion, vehiculo, cliente);
        transacciones.add(transaccionventa);
        vehiculos.remove(vehiculo);
        return true;
    }

    /*// Método que realiza la compra de un vehículo
    *Parámetros:
    * vehiculo: el vehículo que se va a comprar
    * fechaTransaccion: la fecha en que se realiza la transacción
    *cliente: el cliente que vende el vehículo
    *Excepciones lanzadas:
    * VehiculoYaExisteException: si el vehículo ya existe en el inventario
    *TransaccionInvalidaException: si la transacción no es válida (por ejemplo, si el vehículo no tiene tecno-mecánica vigente)
     */
    @Override
    public boolean realizarCompra(Vehiculo vehiculo, LocalDate fechaTransaccion, Cliente cliente)
            throws VehiculoYaExisteException, TransaccionInvalidaException {
        if (verificarVehiculo(vehiculo.getPlaca())) {
            throw new VehiculoYaExisteException(
                    "El vehículo con placa " + vehiculo.getPlaca() + " ya existe en el inventario.");
        }
        if (!vehiculo.isTecnomecanica()) {
            throw new TransaccionInvalidaException("No se puede comprar un vehículo sin tecno-mecánica vigente.");
        }
        Transaccion transaccioncompra = new Compra(generadorCodigo(), fechaTransaccion, vehiculo, cliente);
        transacciones.add(transaccioncompra);
        vehiculos.add(vehiculo);
        return true;
    }

    /**
    *Método que realiza el alquiler de un vehículo
    *Parámetros:
    * vehiculo: el vehículo que se va a alquilar
    *fechaTransaccion: la fecha en que se inicia el alquiler
    *fechaFinal: la fecha en que termina el alquiler
    *cliente: el cliente que alquila el vehículo
    *Excepciones lanzadas:
    *VehiculoNoEncontradoException: si el vehículo no se encuentra en el inventario
    *TransaccionInvalidaException: si la transacción no es válida (por ejemplo, si la fecha final es anterior a la fecha de inicio)
     */
    @Override
    public boolean realizarAlquiler(Vehiculo vehiculo, LocalDate fechaTransaccion, LocalDate fechaFinal,
            Cliente cliente) throws VehiculoNoEncontradoException, TransaccionInvalidaException {
        if (!verificarVehiculo(vehiculo.getPlaca())) {
            throw new VehiculoNoEncontradoException(
                    "El vehículo con placa " + vehiculo.getPlaca() + " no se encuentra en el inventario.");
        }
        if (fechaFinal.isBefore(fechaTransaccion)) {
            throw new TransaccionInvalidaException(
                    "La fecha final del alquiler no puede ser anterior a la fecha de inicio.");
        }
        Transaccion transaccionalquiler = new Alquiler(generadorCodigo(), fechaTransaccion, vehiculo, cliente,
                fechaFinal);
        transacciones.add(transaccionalquiler);
        return true;
    }

    /**
     * Método que verifica las credenciales de un usuario
    *Parámetros:
    *nombreUsuario: el nombre de usuario ingresado
    *contrasena: la contraseña ingresada
    *Retorna:
    *true si las credenciales son correctas (coinciden con las almacenadas en el objeto actual)
    *false si las credenciales son incorrectas
     */
    public boolean verificarCredenciales(String nombreUsuario, String contrasena) {
        return this.nombre.equals(nombreUsuario) && this.clave.equals(contrasena);
    }

    /**
     * Cambia la clave del usuario.
     * 
     * @param claveActual La clave actual del usuario.
     * @param nuevaClave  La nueva clave que se desea establecer.
     * @return true si el cambio fue exitoso, false si la clave actual es
     *         incorrecta.
     */
    public boolean cambiarClave(String claveActual, String nuevaClave) {
        if (this.clave.equals(claveActual)) {
            this.clave = nuevaClave;
            return true;
        }
        return false;
    }

    /**
     * Verifica la respuesta de seguridad y devuelve la clave si es correcta.
     * 
     * @param respuesta La respuesta proporcionada por el usuario.
     * @return La clave si la respuesta es correcta, null en caso contrario.
     */
    public String recuperarClave(String respuesta) {
        if (this.respuestaSeguridad.equals(respuesta)) {
            return this.clave;
        }
        return null;
    }

    /**
     * Metodo que elimina a un cliente
     * @param cedula
     * @return
     */
    public boolean eliminarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente().equals(cedula)) {
                clientes.remove(cliente);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

}