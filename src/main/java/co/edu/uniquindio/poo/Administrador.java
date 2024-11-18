package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Administrador extends Usuario {
    public Collection<Empleado> empleados;

    public Administrador(String nombre, String clave, String preguntaSeguridad, String respuestaSeguridad,
            double salario, String tipoUsuario) {
        super(nombre, clave, preguntaSeguridad, respuestaSeguridad, salario, tipoUsuario);
        empleados = new LinkedList<>();
    }

    //////////////////////////////////////////////////Getters and Setters/////////////////////////////

    public String getTipoUsuario() {
        return "Administrador";
    }

    @Override
    public String toString() {
        return "Administrador [nombre=" + nombre + ", clave=" + clave + ", empleados=" + empleados + "]";
    }

    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////// metodos
    /**
     * Metodo para verificar la existencia de un empleado
     * 
     * @param idEmpleado
     * @return
     */
    public boolean verificarEmpleado(int idEmpleado) {
        boolean bandera = false;
        for (Empleado empleado : empleados) {
            if (empleado.getIdEmpleado() == idEmpleado) {
                bandera = true;
            }
        }
        return bandera;
    }

    /**
     * Metodo para agregar a un empleado
     * 
     * @param empleado
     */
    public void agregarEmpleado(Empleado empleado) {
        if (!verificarEmpleado(empleado.getIdEmpleado())) {
            empleados.add(empleado);
        }
    }
    public Empleado autenticar(String nombreUsuario, String contrasena) {

        for (Empleado empleado : empleados) {
            if (empleado.verificarCredenciales(nombreUsuario, contrasena)) {
                return empleado;
            }
        }
        return null; // Si no se encuentra el usuario
    }

    /**
     * metodo que genera un reporte por empleado de una fecha especifica
     * 
     * @param mesReporte
     * @param empleado
     * @return
     */
    public Collection<Transaccion> reportePorEmpleado(LocalDate fechaReporteInicial, LocalDate fechaReporteFinal,
            Empleado miEmpleado) {
        int id = miEmpleado.getIdEmpleado();
        Collection<Transaccion> transacciones = new LinkedList<>();
        for (Empleado empleado : empleados) {
            if (empleado.getIdEmpleado() == id) {
                for (Transaccion transaccion : empleado.getTransacciones()) {
                    if (transaccion.getfechaTransaccion().isAfter(fechaReporteInicial)
                            && transaccion.getfechaTransaccion().isBefore(fechaReporteFinal)) {
                        transacciones.add(transaccion);
                    }

                }

            }
        }

        return transacciones;
    }

    /**
     * metodo para actualizar un empleado
     * 
     * @param empleado
     * @return
     */
    public boolean editarEmpleado(Empleado empleado) {
        boolean bandera = false;
        if (verificarEmpleado(empleado.getIdEmpleado())) {
            for (Empleado empleado2 : empleados) {
                if (empleado2.getIdEmpleado() == empleado.getIdEmpleado()) {
                    empleado2.setClave(empleado.getClave());
                    empleado2.setNombre(empleado.getNombre());
                    empleado2.setPreguntaSeguridad(empleado.getPreguntaSeguridad());
                    empleado2.setRespuestaSeguridad(empleado.getRespuestaSeguridad());
                    empleado2.setSalario(empleado.getSalario());
                    empleado2.setVehiculos(empleado2.getVehiculos());
                    empleado2.setTransacciones(empleado2.getTransacciones());
                    empleado2.setClientes(empleado2.getClientes());
                    bandera = true;
                }

            }
        }
        return bandera;

    }

    /**
     * Metodo para bloquear a un empleado
     * 
     * @param idEmpleado
     * @return
     */
    public boolean bloqueoCuenta(int idEmpleado) {
        for (Empleado empleado : empleados) {
            if (empleado.getIdEmpleado() == idEmpleado) {
                empleado.setActivo(false);
                return true;
            }
        }

        return false;
    }

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
     * Obtiene la pregunta de seguridad del usuario.
     * 
     * @return La pregunta de seguridad.
     */
    public String obtenerPreguntaSeguridad() {
        return this.preguntaSeguridad;
    }
}
