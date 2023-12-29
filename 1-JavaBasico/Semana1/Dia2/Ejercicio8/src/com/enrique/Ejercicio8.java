package com.enrique;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        boolean[][] asientos = new boolean[5][5];

        Scanner sc = new Scanner(System.in);
        int numFila;
        int numAsiento;
        do {

            System.out.println("Estos son los asiestos disponibles");

            for (int i = 0; i < 5; i++) {
                System.out.println("");
                for (int j = 0; j < 5; j++) {
                    if (asientos[i][j] == true) {
                        System.out.print(" |X| ");
                    } else {
                        System.out.print(" |o| ");
                    }
                }
            }
            System.out.println("");
            System.out.println("Acontinuación, haga una reserva o salga del programa con 0");

            System.out.println("Elige una fila del 1 al 5");
            numFila = (Integer.parseInt(sc.nextLine()) - 1);
            System.out.println("Elige un asiento del 1 al 5");
            numAsiento = (Integer.parseInt(sc.nextLine()) - 1);

            for (int i = 0; i < 5; i++) {
                System.out.println("");
                for (int j = 0; j < 5; j++) {
                    if (numFila == i && numAsiento == j) {
                        if (asientos[i][j] == true) {
                            System.out.print("El asiento está ocupado, Elige otro distinto:");
                        } else {
                            asientos[i][j] = true;
                        }

                    }

                }
            }
            System.out.println("");
        } while (numFila != -1 );

    }
}
