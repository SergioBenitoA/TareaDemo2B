package com.example.demo2;

import java.time.LocalTime;

public class Tarea {
    int id;
    String titulo;
    String descripcion;
    String dia;
    LocalTime hora;

    public Tarea() {
    }

    public Tarea(int id, String titulo, String descripcion, String dia, LocalTime hora) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.dia = dia;
        this.hora = hora;
    }

    public Tarea(String titulo, String descripcion, String dia, LocalTime hora) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.dia = dia;
        this.hora = hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
