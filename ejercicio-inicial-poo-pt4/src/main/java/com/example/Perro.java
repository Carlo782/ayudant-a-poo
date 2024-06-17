package com.example;

public class Perro extends Animal1{

    private boolean leGustaPasear;

    public Perro(String nombre, String raza, int edad, String genero, boolean leGustaPasear) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.leGustaPasear = leGustaPasear;
    }

    public boolean isLeGustaPasear() {
        return leGustaPasear;
    }

    public void setLeGustaPasear(boolean leGustaPasear) {
        this.leGustaPasear = leGustaPasear;
    }

    public void ladrar() {
        System.out.println(nombre + " dice: " + "Guau guau, está contento");
    }

    public void jugar() {
        System.out.println(super.getNombre() + " Está Jugando con una pelota");
    }

    @Override
    public String toString() {
        return super.toString() + this.leGustaPasear;
    }

}
