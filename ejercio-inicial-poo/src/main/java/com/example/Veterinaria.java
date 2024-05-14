package com.example;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private String telefono;
    private Perro perro;
    private Gato gato;

    public Veterinaria(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
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


    public Perro getPerro() {
        return perro;
    }


    public void setPerro(Perro perro) {
        this.perro = perro;
    }


    public Gato getGato() {
        return gato;
    }


    public void setGato(Gato gato) {
        this.gato = gato;
    }


    public void registrarPacientePerruno(Perro perro) {
        if (this.perro != null) {
            System.out.println("Ya hay un paciente registrado, por favor dar de alta al paciente actual");
        } else {
            this.perro = perro;
            System.out.println("El perro " + perro.getNombre() + " ha sido registrado exitosamente");
        }
    }

    public void registrarPacienteGatuno(Gato gato) {
        if (this.gato != null) {
            System.out.println("Ya hay un paciente registrado, por favor dar de alta al paciente actual");
        } else {
            this.gato = gato;
            System.out.println("El gato " + gato.getNombre() + " ha sido registrado exitosamente");
        }
    }

    public void darDeAltaPacientePerruno() {
        if (this.perro == null) {
            System.out.println("No hay pacientes registrados");
        }else{
            this.perro = null;
            System.out.println("El perro ha sido dado de alta exitosamente");
        }
    }

    public void darDeAltaPacienteGatuno() {
        if (this.gato == null) {
            System.out.println("No hay pacientes registrados");
        }else{
            this.gato = null;
            System.out.println("El gato ha sido dado de alta exitosamente");
        }
    }

    public void mostrarPacientes() {
        if (this.perro != null) {
            System.out.println("Paciente perruno: " + this.perro.obtenerTodosLosDatos());
        }
        if (this.gato != null) {
            System.out.println("Paciente gatuno: " + this.gato.obtenerTodosLosDatos());
        }
    }

    public void tiempoDeRelajo() {
        System.out.println("Tiempo de relajo para los pacientes\n");
        if (this.perro != null) {
            this.perro.hacerActividades();
        }
        if (this.gato != null) {
            this.gato.hacerActividades();
        }
    }

}
