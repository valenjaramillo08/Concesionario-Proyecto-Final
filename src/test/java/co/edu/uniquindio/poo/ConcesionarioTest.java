package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConcesionarioTest {

    private Concesionario concesionario;
    private Administrador administrador;

    @BeforeEach
    void setUp() {
        administrador = new Administrador("Jose", "123ss", "Nombre de tu mascota", "pancho", 2.0000, "Administrador");
        concesionario = new Concesionario("Auto Mundo", administrador);
    }

    @Test
    void testGetNombre() {
        assertEquals("Auto Mundo", concesionario.getNombre());
    }

    @Test
    void testSetNombre() {
        concesionario.setNombre("Carros Únicos");
        assertEquals("Carros Únicos", concesionario.getNombre());
    }


    @Test
    void testAutenticarFallido() {
        Administrador autenticado = concesionario.autenticar("Admin", "wrongpassword");
        assertNull(autenticado);
    }

    @Test
    void testGetAdministrador() {
        assertEquals(administrador, concesionario.getAdministrador());
    }

    @Test
    void testSetAdministrador() {
        Administrador nuevoAdmin = new Administrador("NuevoAdmin", "newpass", "¿Mascota?", "Perro", 2.500,"Administrador");
        concesionario.setAdministrador(nuevoAdmin);
        assertEquals(nuevoAdmin, concesionario.getAdministrador());
    }
}
