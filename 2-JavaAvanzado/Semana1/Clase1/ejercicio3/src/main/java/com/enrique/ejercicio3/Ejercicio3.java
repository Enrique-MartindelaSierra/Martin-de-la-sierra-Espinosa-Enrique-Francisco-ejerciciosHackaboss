package com.enrique.ejercicio3;

import com.enrique.ejercicio3.exceptions.OutOfRangeException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] palabras = new String[4];
        int option = 0;
        boolean done = false;
        while (!done) {
            System.out.println("programa para trabajar con un vector de Strings de 4 posiciones");
            System.out.println("1 rellenar posiciones");
            System.out.println("2 encontrar por indice");
            System.out.println("3 imprimir array");
            System.out.println("4 Salir");
            option = Integer.parseInt(sc.nextLine());
            try {

                switch (option) {
                    case 1 ->
                        add(palabras);
                    case 2 -> {
                        System.out.println("inserte el indice de la posicion del array");
                        int indice = Integer.parseInt(sc.nextLine());
                        System.out.println("la palabra en la posicion " + indice + " es :" + findByIndex(palabras, indice));
                    }
                    case 3 ->
                        print(palabras);
                    case 4 -> {
                        System.out.println("Gracias por usar el programa");
                        done = true;
                    }
                    default ->
                        System.out.println("valor fuera de las opciones posibles");

                }
            } catch (OutOfRangeException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("----------------------------------------------");

        }
    }

    public static void add(String[] arrayString) {

        for (int i = 0; i < arrayString.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arrayString[i] = sc.nextLine();
        }
    }

    public static String findByIndex(String[] arrayString, int index) throws OutOfRangeException {

        if (index >= 0 && index < arrayString.length) {
            return arrayString[index];
        } else {
            throw new OutOfRangeException("índice fuera del rango del vector");
        }

    }

    public static void print(String[] arrayString) {
        for (String string : arrayString) {
            System.out.println(string);
        }
    }

}
