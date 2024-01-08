package com.enrique.ejercicio5;

public class Trabajador extends Thread {

    private String nombre;

    public Trabajador(String nombre) {
        this.nombre = nombre;

    }

    @Override
    public void run() {
        System.out.println(nombre + " emsamblando productos");

        for (int i = 0; i < 100; i++) {
            System.out.println(nombre + ": segundos en trabajo: " + i);
        }

        controlDeCalidad();

        embalando();
    }

    private synchronized void controlDeCalidad() {

        System.out.println(nombre + " controlando la calidad productos");

        for (int i = 0; i < 10; i++) {
            System.out.println(nombre + ": segundos en control de calidad: " + i);
        }

    }

    private synchronized void embalando() {

        System.out.println(nombre + " embalando productos");

        for (int i = 0; i < 10; i++) {
            System.out.println(nombre + ": segundos embalando: " + i);
        }

    }
}
