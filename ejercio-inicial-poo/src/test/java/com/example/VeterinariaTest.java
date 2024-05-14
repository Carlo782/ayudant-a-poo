package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class VeterinariaTest {
    private Veterinaria veterinaria;
    private Perro perro;
    private Gato gato;

    @BeforeEach
    public void setUp() {
        veterinaria = new Veterinaria("Veterinaria Patitas", "123 Calle Principal", "123456789");
        perro = new Perro("Dogo", "Golden Retriever", 3, "Macho", true);
        gato = new Gato("Michi", "Siamés", 2, "Hembra", true);
    }

    @AfterEach
    public void tearDown() {
        veterinaria = null;
        perro = null;
        gato = null;
    }

    @Test
    public void testRegistrarPacientePerruno() {
        veterinaria.registrarPacientePerruno(perro);
        assertEquals(perro, veterinaria.getPerro());
    }

    @Test
    public void testRegistrarPacienteGatuno() {
        veterinaria.registrarPacienteGatuno(gato);
        assertEquals(gato, veterinaria.getGato());
    }

    @Test
    public void testDarDeAltaPacientePerruno() {
        veterinaria.setPerro(perro);
        veterinaria.darDeAltaPacientePerruno();
        assertNull(veterinaria.getPerro());
    }

    @Test
    public void testDarDeAltaPacienteGatuno() {
        veterinaria.setGato(gato);;
        veterinaria.darDeAltaPacienteGatuno();
        assertNull(veterinaria.getGato());
    }

}
