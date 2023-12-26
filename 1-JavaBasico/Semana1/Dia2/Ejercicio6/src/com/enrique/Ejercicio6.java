
package com.enrique;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);


            int opcion =0;
            do {
                System.out.println("Seleccione una opción");
                System.out.println("1 ingresar un precio");
                System.out.println("2 ingresar varios precios");
                System.out.println("3 salir");


                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1 -> {
                        System.out.println("ingrese el precio del producto");
                        double precio = Double.parseDouble(sc.nextLine());
                        System.out.println("El total es: " + precio + "€");
                    }
                    case 2 -> {
                        System.out.println("cuantos productos desea ingresar?");
                        int cantidad = Integer.parseInt(sc.nextLine());
                        double[] precios = new double[cantidad];
                        double total = 0;
                        for (int i = 0; i < precios.length; i++) {
                            System.out.println("ingrese precio del producto " + (i + 1));
                            precios[i] = Double.parseDouble(sc.nextLine());
                            total += precios[i];
                        }
                        System.out.println("El total es: " + total + "€");

                    }
                    case 3 -> System.out.println("Gracias por usar nuestro programa");
                    default -> System.out.println("Error");
                }
            }while (opcion != 3);
            sc.close();
        }
}
