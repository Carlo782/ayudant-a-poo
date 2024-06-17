package com.example;

public class Gato extends Animal{
    private boolean miedoAlAgua;
    private Veterinaria veterinaria;

    public Gato(String nombre, String raza, int edad, String genero, boolean miedoAlAgua) {
        super(nombre, raza, edad, genero);
        this.miedoAlAgua = miedoAlAgua;
    }

    public Veterinaria getVeterinaria() {
        return veterinaria;
    }

    public void setVeterinaria(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public boolean isMiedoAlAgua() {
        return miedoAlAgua;
    }

    public void setMiedoAlAgua(boolean miedoAlAgua) {
        this.miedoAlAgua = miedoAlAgua;
    }

    public void maullar() {
        System.out.println(super.getNombre() + " dice: " + "Miau");
    }

    public void ronronear() {
        System.out.println(super.getNombre() + " está ronroneando: " + "Prrrrrr");
    }

    public void mirarConDesprecio() {
        System.out.println(super.getNombre() + " está mirando con desprecio");

    }

    @Override
    public String toString() {
        return super.toString() + "- Miedo al agua?: " + this.miedoAlAgua;
    }

}
