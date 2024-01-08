package com.enrique.ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {

    public static void main(String[] args) {
        BufferedReader sharedReader = new BufferedReader(new InputStreamReader(System.in));

        Agente enrique = new Agente("Enrique", sharedReader);
        Agente david = new Agente("David", sharedReader);

        enrique.start();
        david.start();

        try {
            enrique.join();
            david.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            sharedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
