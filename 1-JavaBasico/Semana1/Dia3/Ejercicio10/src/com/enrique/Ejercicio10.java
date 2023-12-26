package com.enrique;


/*Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono
(tener en cuenta todos sus atributos, constructores y métodos getters y setters).

        a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.

        b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.

        c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio
        y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.

        d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.*/


import com.enrique.entities.Persona;

public class Ejercicio10 {
    public static void main(String[] args) {

        Persona[] personas = new Persona[5];
        Persona enrique = new Persona(1,"Enrique", 25, "calleinventada22",666222333);
        Persona david = new Persona(2,"David", 27, "calleinventada86",666333444);
        Persona pepe = new Persona(3,"Pepe", 45, "calleinventada102",666444555);
        Persona juan = new Persona(4,"Juan", 53, "calleinventada33",666555666);
        Persona jejeje = new Persona(5,"jejeje", 666, "calleinventada666",666666666);

        personas[0] = enrique;
        personas[1] = david;
        personas[2] = pepe;
        personas[3] = juan;
        personas[4] = jejeje;


        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getEdad());



        }

        pepe.setNombre("Jose");
        jejeje.setNombre("jajaja");

        System.out.println(personas[2].getNombre());
        System.out.println(personas[4].getNombre());

        for (Persona persona : personas) {
            if (persona.getEdad() > 30) {
                System.out.println(persona.getNombre() + " " + persona.getEdad());
            }


        }


    }


}