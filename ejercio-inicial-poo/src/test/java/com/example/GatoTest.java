package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GatoTest {
    private Gato gato;

    @BeforeEach
    public void setUp() {
        gato = new Gato("Michi", "Siamés", 2, "hembra", true);
    }

    @AfterEach
    public void tearDown() {
        gato = null;
    }

    @BeforeAll
    public static void setUpAll() {
        System.out.println("Iniciando pruebas de Gato...");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("Finalizando pruebas de Gato...");
    }

    @Test
    void testGetNombre() {
        assertEquals("Michi", gato.getNombre());
    }

    @Test
    void testMaullar() {
        assertEquals("Michi dice: Miau", gato.maullar());
    }

    @Test
    void testRonronear() {
        assertEquals("Michi está ronroneando: Prrrrrr", gato.ronronear());
    }


    @Test
    void testObtenerTodosLosDatos() {
        assertEquals("Nombre: Michi - Edad: 2 - Raza: Siamés - Genero: hembra; - Miedo al agua?: true", gato.obtenerTodosLosDatos());
    }
}
