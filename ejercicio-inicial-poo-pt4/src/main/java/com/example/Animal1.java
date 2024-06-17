package com.example;

public class Animal1 {
    protected  String nombre;
    protected  String raza;
    protected  int edad;
    protected  String genero;
    
    
    public Animal1(String nombre, String raza, int edad, String genero) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
    }

    public Animal1() {
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
        System.out.println( this.nombre +"Soy un animal y hago ruido");
    }

    public void dormir() {
        System.out.println( this.nombre +"Soy un animal y estoy durmiendo");
    }

    @Override
    public String toString() {
        return "Animal [edad=" + edad + ", genero=" + genero + ", nombre=" + nombre + ", raza=" + raza + "]";
    }



    
    
}
