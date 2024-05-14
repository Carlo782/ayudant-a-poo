package com.example;

public class Gato {

    private String nombre;
    private String raza;
    private int edad;
    private String genero;
    private boolean miedoAlAgua;

    public Gato(String nombre, String raza, int edad, String genero , boolean miedoAlAgua) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.miedoAlAgua = miedoAlAgua;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String maullar() {
        return this.nombre+" dice: "+"Miau";
    }

    public String ronronear() {
        return this.nombre +" está ronroneando: "+"Prrrrrr";
    }

    public void mirarConDesprecio() {
       System.out.println(this.nombre + " Te mira con desprecio...");
       pausa();
       System.out.println("Te sientes juzgado por tus acciones..." );
       pausa();
       System.out.println(this.nombre + " Se va a dormir indignada dandote la espalda....");
       pausa();

    }

    public void hacerActividades() {
        System.out.println(maullar());
        pausa();
        System.out.println(ronronear());
        pausa();
        System.out.println("Ves a "+this.nombre+" feliz y jugueteando, intentas hacerle cariño en la panza....");
        pausa();
        mirarConDesprecio();
    }

    public String obtenerTodosLosDatos() {
        return "Nombre: "+this.nombre+" - Edad: "+this.edad+" - Raza: "+ this.raza+ " - Genero: "+ this.genero + "; - Miedo al agua?: "+this.miedoAlAgua ;
    }



    private void pausa() {
        try {
            System.out.print(". . . ");
            Thread.sleep(5000);
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
