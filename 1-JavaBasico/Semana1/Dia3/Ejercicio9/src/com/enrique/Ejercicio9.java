
package com.enrique;

import com.enrique.entities.Electrodomestico;


public class Ejercicio9 {

    public static void main(String[] args) {

       Electrodomestico nevera = new Electrodomestico(1,"Roca","no frost","AA","blanco");
       Electrodomestico horno = new Electrodomestico(2,"Vita","best","A","negro");
       Electrodomestico tele = new Electrodomestico(3,"lg","ips","AAA","plata");
       Electrodomestico lavadora = new Electrodomestico();

        System.out.println(nevera.getMarca() + " " +nevera.getModelo() + " " + nevera.getConsumo());
        System.out.println(horno.getMarca() + " " +horno.getModelo() + " " + horno.getConsumo());
        System.out.println(tele.getMarca() + " " +tele.getModelo() + " " + tele.getConsumo());
        System.out.println(lavadora.getMarca()); //obtenemos null pero no falla
    }

}