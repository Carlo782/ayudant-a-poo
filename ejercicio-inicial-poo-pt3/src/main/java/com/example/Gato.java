package com.example;

public class Gato {
    private String nombre;
    private String raza;
    private int edad;
    private String genero;
    private boolean miedoAlAgua;

    public Gato(String nombre, String raza, int edad, String genero, boolean miedoAlAgua) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.miedoAlAgua = miedoAlAgua;
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

    public boolean isMiedoAlAgua() {
        return miedoAlAgua;
    }

    public void setMiedoAlAgua(boolean miedoAlAgua) {
        this.miedoAlAgua = miedoAlAgua;
    }

    public void maullar() {
        System.out.println(this.nombre + " dice: " + "Miau");
    }

    public void ronronear() {
        System.out.println(this.nombre + " está ronroneando: " + "Prrrrrr");
    }

    public void mirarConDesprecio() {
        System.out.println(this.nombre + " está mirando con desprecio");

    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " - Edad: " + this.edad + " - Raza: " + this.raza + " - Genero: "
                + this.genero + "; - Miedo al agua?: " + this.miedoAlAgua;
    }

}
