package com.enrique.ejercicio1.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva {

    String nombre;
    String destino;
    LocalDate fechaDeViaje;
    int numeroDeAsientos;

    public Reserva() {
    }

    public Reserva(String nombre, String destino, LocalDate fechaDeViaje, int numeroDeAsientos) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaDeViaje = fechaDeViaje;
        this.numeroDeAsientos = numeroDeAsientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaDeViaje() {
        return fechaDeViaje;
    }

    public void setFechaDeViaje(LocalDate fechaDeViaje) {
        this.fechaDeViaje = fechaDeViaje;
    }

    public int getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    public void setNumeroDeAsientos(int numeroDeAsientos) {
        this.numeroDeAsientos = numeroDeAsientos;
    }

    @Override
    public String toString() {
        return "Reserva{" + "nombre=" + nombre + ", destino=" + destino + ", fechaDeViaje=" + fechaDeViaje + ", numeroDeAsientos=" + numeroDeAsientos + '}';
    }

}
