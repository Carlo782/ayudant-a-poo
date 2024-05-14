package com.example;

public class Calculadora {
    private String nombre;

    public Calculadora(String nombre) {
        this.nombre = nombre;
    }

    public int sum(int a, int b) {

        System.out.println("Suma de " + a + " + " + b + " = " + (a + b));
        return (a + b);
    }

    public int res(int a, int b) {

        System.out.println("Resta de " + a + " - " + b + " = " + (a - b));
        return (a - b);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
