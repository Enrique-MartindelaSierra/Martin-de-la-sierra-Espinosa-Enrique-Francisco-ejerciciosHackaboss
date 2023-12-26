
package com.enrique;

import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String[] args){  
    /*
    Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos: 
    suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.

    Sugerencia: Compara los resultados que obtengas con otros compañeros.
    Pide a tus compañeros que te digan números al azar y haz las pruebas necesarias para comprobar el funcionamiento de tu programa.

    Extra: ¿Qué sucede si como segundo número de una división se ingresa 0?
    Con lo que sabes o aprendiste hasta ahora… ¿De qué manera tratarías de evitar ésta situación?        
    */

        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa realiza operaciones con los numeros provistos:");
        System.out.println("Introduzca un numero como numerador");
        double number1 = sc.nextInt();
        System.out.println("Introduzca otro numero como operador");
        double number2 = sc.nextInt();
        if(number2 == 0){
            System.out.println("El el operador no puede ser 0");
            System.out.println("Introduzca otro numero");
            number2 = sc.nextInt();
            }
 
        System.out.println("la suma de " + number1 + " + " + number2 + " es igual a: " + (number1+number2));
        System.out.println("la resta de " + number1 + " - " + number2 + " es igual a: " + (number1-number2));
        System.out.println("la multiplicación de " + number1 + " * " + number2 + " es igual a: " + (number1*number2));
        System.out.println("la división de " + number1 + " / " + number2 + " es igual a: " + (number1/number2));
        sc.close();

        }
}
