package com.example;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Perro> listaPerros = new ArrayList<>();
    private List<Gato> listaGatos = new ArrayList<>();
    private List<Empleado> listaEmpleados = new ArrayList<>();
    private Horario horario;

    public Veterinaria(String nombre, String direccion, String telefono, String horarioDeAtencion, String diasDeAtenacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = new Horario(horarioDeAtencion, diasDeAtenacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Perro> getListaPerros() {
        return listaPerros;
    }

    public void setListaPerros(List<Perro> listaPerros) {
        this.listaPerros = listaPerros;
    }

    public List<Gato> getListaGatos() {
        return listaGatos;
    }

    public void setListaGatos(List<Gato> listaGatos) {
        this.listaGatos = listaGatos;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public void registrarPacientePerruno(Perro perro) {
        listaPerros.add(perro);
    }

    public void registrarPacienteGatuno(Gato gato) {
        listaGatos.add(gato);
    }

    public void darDeAltaPacientePerruno(int index) {
        listaPerros.remove(index);

    }

    public void darDeAltaPacienteGatuno(int index) {
        listaGatos.remove(index);
    }

    public void mostrarPacientes() {
        for (Perro perro : listaPerros) {
            System.out.println(perro);
        }
        for (Gato gato : listaGatos) {
            System.out.println(gato);
        }
    }

}
