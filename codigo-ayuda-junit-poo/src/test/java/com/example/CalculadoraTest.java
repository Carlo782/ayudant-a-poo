package com.example;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    //Se crea un objeto de la clase Calculadora para que pueda ser usado en los test
    public static Calculadora cal;

    //Sección que se ejecuta antes que todos los test, se inicializa la variable cal
    @BeforeAll
    static void setUp() {
        System.out.println("Se ejecuta antes de todos los test\n");
        cal = new Calculadora("Calculadora");
    }

    //Sección que se ejecuta antes de cada test, se reinicia la variable cal para que no se contaminen las pruebas
    //Si cambia alguna propiedad, por ejemplo, el nombre, se reinicia a "Calculadora"
    @BeforeEach
    void setUpEach() {
        System.out.println("Se ejecuta antes de cada test");
        cal= new Calculadora("Calculadora");
    }

    //Test que verifica que el nombre de la calculadora sea "Calculadora"
    @Test
    void testGetNombre() {
        Assertions.assertEquals("Calculadora", cal.getNombre());
        System.out.println("Nombre "+cal.getNombre());
    }

    //Test que verifica la función setNombre de la calculadora, se cambia el nombre de la calculadora a "Calculadora 2"
    //y se verifica que el nombre sea "Calculadora 2"
    @Test
    void testSetNombre() {
        cal.setNombre("Calculadora 2");
        Assertions.assertEquals("Calculadora 2", cal.getNombre());
        System.out.println("Nombre "+cal.getNombre());
    }

    //Test que verifica si la función res de la calculadora es correcta, llamando la función res con los valores 5 y 3
    //y comparando el resultado con el valor esperado 2
    @Test
    void testRes() {
        Assertions.assertEquals(2, cal.res(5, 3));
    }

    //Test que verifica si la función sum de la calculadora es correcta, llamando la función sum con los valores 5 y 3
    //y comparando el resultado con el valor esperado 8
    @Test
    void testSum() {
        Assertions.assertEquals(8, cal.sum(5, 3));
    }

    //Test que de ejemplo de assertNotEquals, se espera que el resultado sea 2, pero el resultado es 8
    @Test
    void testSumFail() { Assertions.assertNotEquals(2, cal.sum(5, 3));
    }

    //Funcion que se ejecuta después de cada test, se reinicia la variable cal
    @AfterEach
    void tearDownEach() {
        System.out.println("Se ejecuta después de cada test \n");
        cal = null;
    }

    //Funcion que se ejecuta después de todos los test, se reinicia la variable cal
    @AfterAll
    static void tearDown() {
        System.out.println("Se ejecuta después de todos los test");
        cal = null;
    }

}
