
package com.enrique;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa a continuación en orden las temperaturas de la semana, cuando las hayas ingresado te devolverá el programa la media semanal");
            double[] temperaturasSemana = new double[7];
            double temperaturaTotal = 0;
            for (int i = 0; i < 7; i++) {
                System.out.println("temperatura del dia " + (i+1));
                temperaturasSemana[i] = Double.parseDouble(sc.nextLine());
                temperaturaTotal = temperaturaTotal + temperaturasSemana[i];
            }


            double temperaturaMedia = temperaturaTotal / temperaturasSemana.length;
            System.out.println("la media de la semana es: "+temperaturaMedia);


        }
}
