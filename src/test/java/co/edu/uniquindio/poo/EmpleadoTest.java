package co.edu.uniquindio.poo;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;


public class EmpleadoTest {

    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;

    @BeforeEach
    public void setUp() {
        empleado = new Empleado("Juan", "123", "¿Color favorito?", "Azul", 2000.0, 1, true, "Empleado");
        cliente = new Cliente("1234", "Pedro", "123-456-7890", "Calle 123");
        vehiculo = new Vehiculo("222g","mazda","77y", true, TipoCombustible.DIESEL, TipoTransmision.AUTOMATICA, true);
    }

    @Test
    public void testAgregarCliente() throws ClienteYaExisteException {
        assertTrue(empleado.agregarCliente(cliente));
        assertTrue(empleado.verificarCliente("1234"));
    }

        

    @Test
    public void testAgregarVehiculo() throws VehiculoYaExisteException {
        empleado.agregarVehiculo(vehiculo);
        assertFalse(empleado.verificarVehiculo("ABC123"));
    }


    @Test
    public void testRealizarVenta() throws VehiculoYaExisteException, VehiculoNoEncontradoException, TransaccionInvalidaException {
        empleado.agregarVehiculo(vehiculo);
        assertTrue(empleado.realizarVenta(vehiculo, LocalDate.now(), cliente));
        assertFalse(empleado.verificarVehiculo("ABC123")); // El vehículo ya no debería estar en el inventario
    }

    @Test
    public void testRealizarCompra() throws VehiculoYaExisteException, TransaccionInvalidaException {
        assertTrue(empleado.realizarCompra(vehiculo, LocalDate.now(), cliente));
        assertFalse(empleado.verificarVehiculo("ABC123")); // El vehículo debería estar ahora en el inventario
    }

    @Test
    public void testRealizarAlquiler() throws VehiculoYaExisteException, VehiculoNoEncontradoException, TransaccionInvalidaException {
        empleado.agregarVehiculo(vehiculo);
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaFin = fechaInicio.plusDays(7);
        assertTrue(empleado.realizarAlquiler(vehiculo, fechaInicio, fechaFin, cliente));
    }

    @Test
    public void testVerificarCredenciales() {
        assertTrue(empleado.verificarCredenciales("Juan", "123"));
        assertFalse(empleado.verificarCredenciales("Juan", "456"));
    }

    @Test
    public void testCambiarClave() {
        assertTrue(empleado.cambiarClave("123", "456"));
        assertFalse(empleado.cambiarClave("123", "789")); // La clave antigua ya no es válida
        assertTrue(empleado.verificarCredenciales("Juan", "456")); // Verifica que la nueva clave funciona
    }

    @Test
    public void testRecuperarClave() {
        assertEquals("123", empleado.recuperarClave("Azul"));
        assertNull(empleado.recuperarClave("Verde"));
    }

    @Test
    public void testActualizarCliente() throws ClienteYaExisteException {
        empleado.agregarCliente(cliente);
        Cliente clienteActualizado = new Cliente("1234", "Pedro Actualizado", "987-654-3210", "Avenida 456");
        assertTrue(empleado.actualizarCliente("1234", clienteActualizado));
        assertEquals("Pedro Actualizado", empleado.getClientes().iterator().next().getNombre());
    }

    @Test
    public void testEliminarCliente() throws ClienteYaExisteException {
        empleado.agregarCliente(cliente);
        assertTrue(empleado.eliminarCliente("1234"));
        assertFalse(empleado.verificarCliente("1234"));
    }
}