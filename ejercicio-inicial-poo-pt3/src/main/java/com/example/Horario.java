package com.example;

public class Horario {

    private String horarioDeAtenacion;
    private String diaDeAtencion;

    public Horario(String horarioDeAtenacion, String diaDeAtencion) {
        this.horarioDeAtenacion = horarioDeAtenacion;
        this.diaDeAtencion = diaDeAtencion;
    }

    public String getHorarioDeAtenacion() {
        return horarioDeAtenacion;
    }

    public void setHorarioDeAtenacion(String horarioDeAtenacion) {
        this.horarioDeAtenacion = horarioDeAtenacion;
    }

    public String getDiaDeAtencion() {
        return diaDeAtencion;
    }

    public void setDiaDeAtencion(String diaDeAtencion) {
        this.diaDeAtencion = diaDeAtencion;
    }

    @Override
    public String toString() {
        return "Horario de Atencion: " + horarioDeAtenacion + ", Dia de Atencion: " + diaDeAtencion + ".";
    }
}
