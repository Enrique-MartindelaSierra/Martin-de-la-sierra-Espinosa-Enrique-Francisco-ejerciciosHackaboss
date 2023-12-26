package com.enrique;

import com.enrique.entities.Camiseta;
import com.enrique.entities.Pantalon;
import com.enrique.entities.Sombrero;
import com.enrique.entities.Vestimenta;
import com.enrique.entities.Zapato;

public class Ejercicio12 {

    public static void main(String[] args) {

        Vestimenta[] vestimentas = new Vestimenta[9];
        vestimentas[0] = new Zapato(1, "deportiva", 40, "nike", 44, "blanco", "caucho", "velcro");
        vestimentas[1] = new Zapato(2, "bota", 20, "adidas", 43, "negro", "cuero", "cordón");
        vestimentas[2] = new Zapato(3, "chancla", 5, "quechua", 38, "azul", "caucho", "abierta");
        vestimentas[3] = new Pantalon(4, "chandal", 9.90, "marca1", 40, "gris", "chandal", "Tejido1");
        vestimentas[4] = new Pantalon(5, "vaquero", 19.90, "marca2", 38, "azul","vaquero", "Tejido2");
        vestimentas[5] = new Pantalon(6, "pirata", 6.90, "marca3", 42, "marron", "pirata", "Tejido3");
        vestimentas[6] = new Camiseta(7, "playera", 8, "marca4", 20, "rojo", "corta", "cuello1");
        vestimentas[7] = new Camiseta(8, "camisa", 12, "marca5", 32, "blanco", "larga", "cuello2");
        vestimentas[8] = new Sombrero(9, "sombrero", 7, "marca6", 6, "negro", "copa", "M");
        
        
        for (Vestimenta vestimenta : vestimentas) {
            vestimenta.mostrar();
            
        } 
        

    }
}
