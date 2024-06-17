package com.example;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Animal> listaAnimales;
    private List<Empleado> listaEmpleados;
    private Horario horario;

    public Veterinaria(String nombre, String direccion, String telefono, String horarioDeAtencion, String diasDeAtenacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaAnimales = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
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

    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(List<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
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

    public void setHorario(String horaDeAtencion, String diasDeAtencion) {
        this.horario = new Horario(horaDeAtencion, diasDeAtencion);
    }


    // Fin getter y setter


    public void registrarAnimal(Animal animal) {
        listaAnimales.add(animal);
    }

    public void darDeBajaAnimal(int index) {
        listaAnimales.remove(index);
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public void darDeBajaEmpleado(int index) {
        listaEmpleados.remove(index);
    }

    public void mostrarAnimales() {
        for (Animal animal : listaAnimales) {
            System.out.println(animal);
        }
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado);
        }
    }

    public void mostrarHorario() {
        System.out.println(horario);
    }

    public void mostrarGatos() {
        for (Animal animal : listaAnimales) {
            if (animal instanceof Gato) {
                System.out.println(animal);
            }
        }
    }

}
