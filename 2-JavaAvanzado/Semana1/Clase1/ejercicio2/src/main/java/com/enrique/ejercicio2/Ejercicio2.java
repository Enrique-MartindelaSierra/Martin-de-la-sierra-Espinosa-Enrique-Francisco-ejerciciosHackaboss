package com.enrique.ejercicio2;

import com.enrique.ejercicio2.exceptions.productoInvalidoException;
import com.enrique.ejercicio2.entities.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Producto> inventario = new ArrayList<Producto>();
        System.out.println("INVENTARIO DE PRODUCTOS");
        System.out.println(inventario);
        System.out.println("añadir un producto? y/n");
        String yesOrNo = sc.nextLine();

        if (yesOrNo.equalsIgnoreCase("y")) {
            boolean done = false;
            while (!done) {
                try {
                    inventario.add(productoPorConsola());
                    done = true;
                } catch (productoInvalidoException ex) {
                    System.out.println(ex.getMessage() + " vuelva a rellenar los datos del producto");
                }
            }
        } else if (yesOrNo.equalsIgnoreCase("n")) {
            System.out.println("Gracias por usar este programa");

        } else {
            System.out.println("Error: valor incorrecto, introduzca 'y' o 'n' ");

        }

    }

    public static Producto productoPorConsola() throws productoInvalidoException {

        System.out.println("bienvenido a nuestro programa de gestion de inventario");
        System.out.println("introduzca el nombre del producto");
        String nombre = sc.nextLine();
        if (nombre.isBlank()) {
            throw new productoInvalidoException("Error al rellenar el nombre");
        }
        System.out.println("Introduzca el precio del producto");
        String precio = sc.nextLine();
        if (precio.isBlank()) {
            throw new productoInvalidoException("Error al rellenar el precio");
        }

        System.out.println("Introduzca la cantidad de productos en disposición");
        String cantidad = sc.nextLine();
        if (cantidad.isBlank()) {
            throw new productoInvalidoException("Error al rellenar la cantidad");
        }

        Producto producto = new Producto(nombre, Double.parseDouble(precio), Integer.parseInt(cantidad));
        return producto;

    }
}
