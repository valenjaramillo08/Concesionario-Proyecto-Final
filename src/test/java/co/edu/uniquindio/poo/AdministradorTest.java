package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AdministradorTest {
    
    private Administrador administrador;
    private Empleado empleado1, empleado2;
    
    @BeforeEach
    public void setUp() {
        administrador = new Administrador("Juan", "123", "¿Cuál es tu color favorito?", "Azul", 5000000, "Administrador");
        empleado1 = new Empleado("null", "null", "null", "null", 0, 0, false, null);
        empleado2 = new Empleado("Empleado2", "789", "¿Cuál es tu comida favorita?", "Pizza", 4000000,1,true, "Empleado");
        administrador.agregarEmpleado(empleado1);
        administrador.agregarEmpleado(empleado2);
    }
    
    @Test
    public void testGetTipoUsuario() {
        assertEquals("Administrador", administrador.getTipoUsuario());
    }
    
    @Test
    public void testGetEmpleados() {
        Collection<Empleado> empleados = administrador.getEmpleados();
        assertEquals(2, empleados.size());
        assertTrue(empleados.contains(empleado1));
        assertTrue(empleados.contains(empleado2));
    }
    
    @Test
    public void testVerificarEmpleado() {
        assertTrue(administrador.verificarEmpleado(1));
    }
    
    @Test
    public void testAgregarEmpleado() {
        Empleado empleado3 = new Empleado("Empleado3", "123", "¿Cuál es tu ciudad favorita?", "Bogotá", 4500000,3,true, "Empleado");
        administrador.agregarEmpleado(empleado3);
        Collection<Empleado> empleados = administrador.getEmpleados();
        assertEquals(3, empleados.size());
        assertTrue(empleados.contains(empleado3));
    }
    
    @Test
    public void testAutenticar() {
        Empleado empleadoAutenticado = administrador.autenticar("null", "null");
        assertEquals(empleado1, empleadoAutenticado);
    }
    
    @Test
    public void testReportePorEmpleado() {
        LocalDate fechaInicial = LocalDate.of(2023, 1, 1);
        LocalDate fechaFinal = LocalDate.of(2023, 12, 31);
        
        Transaccion transaccion1 = new Transaccion(1, LocalDate.of(2023, 3, 15),null, null);
        Transaccion transaccion2 = new Transaccion(2, LocalDate.of(2023, 6, 20), null, null);
        Transaccion transaccion3 = new Transaccion(3, LocalDate.of(2024, 1, 1), null, null);
        
        empleado1.getTransacciones().add(transaccion1);
        empleado1.getTransacciones().add(transaccion2);
        empleado2.getTransacciones().add(transaccion3);
        
        Collection<Transaccion> transacciones = administrador.reportePorEmpleado(fechaInicial, fechaFinal, empleado1);
        assertEquals(2, transacciones.size());
        assertTrue(transacciones.contains(transaccion1));
        assertTrue(transacciones.contains(transaccion2));
        
        transacciones = administrador.reportePorEmpleado(fechaInicial, fechaFinal, empleado2);
        assertEquals(0, transacciones.size());
    }
    
    @Test
    public void testBloqueoCuenta() {
        assertTrue(administrador.bloqueoCuenta(1));
        Collection<Empleado> empleados = administrador.getEmpleados();
        Empleado empleadoBloqueado = empleados.stream()
                .filter(e -> e.getIdEmpleado() == 1)
                .findFirst()
                .orElse(null);
        assertFalse(empleadoBloqueado.isActivo());
        
        assertFalse(administrador.bloqueoCuenta(3));
    }
    
    @Test
    public void testVerificarCredenciales() {
        assertTrue(administrador.verificarCredenciales("Juan", "123"));
        assertFalse(administrador.verificarCredenciales("Juan", "456"));
        assertFalse(administrador.verificarCredenciales("Pedro", "123"));
    }
    
    @Test
    public void testCambiarClave() {
        assertTrue(administrador.cambiarClave("123", "nuevoPassword"));
        assertFalse(administrador.cambiarClave("456", "otroPassword"));
        assertEquals("nuevoPassword", administrador.getClave());
    }
    
    @Test
    public void testRecuperarClave() {
        assertEquals("123", administrador.recuperarClave("Azul"));
        assertNull(administrador.recuperarClave("Rojo"));
    }
    
    @Test
    public void testObtenerPreguntaSeguridad() {
        assertEquals("¿Cuál es tu color favorito?", administrador.obtenerPreguntaSeguridad());
    }
}
