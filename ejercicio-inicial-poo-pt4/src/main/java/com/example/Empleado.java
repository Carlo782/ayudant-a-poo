package com.example;

public class Empleado {

    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String rut;
    private String cargo;

    public Empleado(int idEmpleado, String nombre, String apellido, String rut, String cargo) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.cargo = cargo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " - Apellido: " + this.apellido + " - Rut: " + this.rut + " - Cargo: "
                + this.cargo + " - ID: " + this.idEmpleado;
    }
}
