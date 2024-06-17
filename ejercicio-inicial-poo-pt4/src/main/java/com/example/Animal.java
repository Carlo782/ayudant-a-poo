package com.example;

public class Animal {
    private String nombre;
    private String raza;
    private int edad;
    private String genero;

    public Animal(String nombre, String raza, int edad, String genero) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
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

    public void emitirSonido() {
        System.out.println("Soy un animal y hago ruido");
    }

    public void comer() {
        System.out.println( this.nombre +" Dice: Soy un animal y estoy comiendo");
    }

    public void dormir() {
        System.out.println("Soy un animal y estoy durmiendo");
    }

    @Override
    public String toString() {
        return "Animal [edad=" + this.edad + ", genero=" + this.genero + ", nombre=" + this.nombre + ", raza=" + this.raza + "]";
    }    


}
