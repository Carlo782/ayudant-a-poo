package com.example;

public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String genero;
    private boolean leGustaPasear;

    public Perro(String nombre, String raza, int edad, String genero, boolean leGustaPasear) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.leGustaPasear = leGustaPasear;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isLeGustaPasear() {
        return leGustaPasear;
    }

    public void setLeGustaPasear(boolean leGustaPasear) {
        this.leGustaPasear = leGustaPasear;
    }

    public void ladrar() {
        System.out.println(this.nombre + " dice: " + "Guau guau, está contento");
    }

    public void jugar() {
        System.out.println(this.nombre + " Está Jugando con una pelota");
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " - Edad: " + this.edad + " - Raza: " + this.raza + " - Genero: "
                + this.genero + "; - Le gusta pasear?: " + this.leGustaPasear;
    }

}
