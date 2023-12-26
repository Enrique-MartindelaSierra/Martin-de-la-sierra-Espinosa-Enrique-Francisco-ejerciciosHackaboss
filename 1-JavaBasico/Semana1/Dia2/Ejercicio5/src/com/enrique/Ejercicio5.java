
package com.enrique;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca su edad para acceder al recital");
            int edad = Integer.parseInt(sc.nextLine());
            if (edad >= 18) {
                System.out.println("Disfrute del evento");
            }else {
                System.out.println("Lo sentimos, No pueden ingresar al evento menores de 18 años");
            }



            sc.close();
        }
}
