package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PerroTest {

    private Perro perro;

    @BeforeEach
    public void setUp() {
        perro = new Perro("Dogo", "Golden Retriever", 3, "macho", true);
    }

    @AfterEach
    public void tearDown() {
        perro = null;
    }

    @BeforeAll
    public static void setUpAll() {
        System.out.println("Iniciando pruebas de Perro...");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("Finalizando pruebas de Perro...");

    }

    @Test
    void testGetNombre() {
        assertEquals("Dogo", perro.getNombre());
    }

    @Test
    void testJugar() {
        assertEquals("Dogo Está Jugando con una pelota", perro.jugar());
    }

    @Test
    void testLadrar() {
        assertEquals("Dogo dice: Guau guau, está contento", perro.ladrar());
    }

    @Test
    void testObtenerTodosLosDatos() {
        assertEquals("Nombre: Dogo - Edad: 3 - Raza: Golden Retriever - Genero: macho; - Le gusta pasear?: true", perro.obtenerTodosLosDatos());
    }
}
