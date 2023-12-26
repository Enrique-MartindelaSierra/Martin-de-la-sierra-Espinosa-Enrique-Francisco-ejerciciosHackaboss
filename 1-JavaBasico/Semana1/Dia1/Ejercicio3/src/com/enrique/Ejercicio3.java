
package com.enrique;

public class Ejercicio3 {

    public static void main(String[] args){     

    /*
    Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla.. 
    Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido dos).

    Pista: Debes declarar variables para la base y la altura del triángulo, asignarles valores y luego calcular el área utilizando la fórmula.
    */

        double base = 3;
        double altura = 4;
        double area;

        area = (base * altura)/2;
        System.out.println("El area del triangulo de base: " + base + " y altura: " + altura + " es igual a: " + area);
    }

}
