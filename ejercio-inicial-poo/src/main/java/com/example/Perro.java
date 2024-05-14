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
        return this.nombre;
    }

    public String ladrar() {
       return this.nombre + " dice: " + "Guau guau, está contento";
    }

    public String jugar() {
        return this.nombre + " Está Jugando con una pelota";
    }


    public void hacerActividades() {
        System.out.println(ladrar());
        pausa();
        System.out.println(jugar());
        pausa();
    }

    public String obtenerTodosLosDatos() {
        return "Nombre: "+this.nombre+" - Edad: "+this.edad+" - Raza: "+ this.raza+ " - Genero: "+ this.genero + "; - Le gusta pasear?: "+this.leGustaPasear ;
    }


    private void pausa() {
        try {
            System.out.print(". . . ");
            Thread.sleep(4000);
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
