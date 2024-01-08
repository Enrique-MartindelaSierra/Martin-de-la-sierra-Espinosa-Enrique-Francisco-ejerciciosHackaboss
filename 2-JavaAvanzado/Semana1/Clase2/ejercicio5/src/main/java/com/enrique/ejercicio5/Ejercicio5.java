package com.enrique.ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {

    public static void main(String[] args) {
        Trabajador enrique = new Trabajador("Enrique");
        Trabajador david = new Trabajador("David");

        enrique.start();
        david.start();

        try {
            enrique.join();
            david.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
