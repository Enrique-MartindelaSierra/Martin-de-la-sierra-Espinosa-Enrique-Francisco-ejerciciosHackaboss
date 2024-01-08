package com.enrique.ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;

public class Agente extends Thread {

    private String nombre;
    private BufferedReader sharedReader;

    public Agente(String nombre, BufferedReader sharedReader) {
        this.nombre = nombre;
        this.sharedReader = sharedReader;
    }

    @Override
    public void run() {
        System.out.println("Llamada telefonica en curso a manos de " + nombre);

        for (int i = 0; i < 100; i++) {
            System.out.println(nombre + ": segundos en llamada: " + i);
        }

        preguntarDni();
    }

    public void preguntarDni() {
        synchronized (sharedReader) {
            try {
                System.out.println(nombre + ": Dime tu DNI");
                String dni = sharedReader.readLine();
                System.out.println(nombre + ": recibo este DNI: " + dni);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
