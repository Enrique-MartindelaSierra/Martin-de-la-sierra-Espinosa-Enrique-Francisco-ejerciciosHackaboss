
package com.enrique;

public class Ejercicio2 {


    public static void main(String[] args){    
    /*
    a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double, boolean y String.
     Asigna un valor a cada variable y muestra su contenido en la consola. 
    */
        int number = 2;
        double decimal = 5.2;
        boolean state = true;
        String word = "palabra";
        
        System.out.println("El valor del int number es: " + number);
        System.out.println("El valor del double decimal es: " + decimal);
        System.out.println("El valor del boolean state es: " + state);
        System.out.println("El valor del string word es: " + word);

    /*
    b) Ahora, asigna valores que no correspondan al tipo de dato. 
    Por ejemplo, un int en un String o un String en un double… ¿Qué sucede con el programa? 
    ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no? 
    Justificar el por qué de cada caso. Debatir con otros compañeros. 
    */

//        number = 5555555555; //(son más digitos de los que permite el espacio de memoria que se atribuye a una variable int, podria usarse un long)
//        decimal = "error"; //(no puedes asignar texto a variables numericas)
//        state = 1; //(los booleanos solo admiten los valores true o false)(me sonaba que 0 y 1 valian como true o false)
//        word = true; //(los valores true o false no se pueden asignar a otro tipo de dato)
    
        /* las lineas comentadas anteriormente causan error en el programa
         debido a que tratan de asignar valores que no pueden asignarse 
         a los tipos de datos primarios a los que pertenecen las variables
        */
    }
}
