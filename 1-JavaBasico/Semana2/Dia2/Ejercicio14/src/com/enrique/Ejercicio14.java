package com.enrique;

import com.enrique.entities.Producto;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio14 {

    public static void main(String[] args) {

        Producto producto1 = new Producto(111, "marca1", "tipo1", 10, 110, 1);
        Producto producto2 = new Producto(222, "marca2", "tipo2", 20, 220, 2);
        Producto producto3 = new Producto(333, "marca3", "tipo3", 30, 330, 3);
        Producto producto4 = new Producto(444, "marca4", "tipo4", 40, 440, 4);
        Producto producto5 = new Producto(555, "marca5", "tipo5", 50, 550, 5);
        Producto producto6 = new Producto(666, "marca6", "tipo6", 60, 660, 6);
        Producto producto7 = new Producto(777, "marca7", "tipo7", 70, 770, 7);
        Producto producto8 = new Producto(888, "marca8", "tipo8", 80, 880, 8);
        Producto producto9 = new Producto(999, "marca9", "tipo9", 90, 990, 9);
        Producto producto10 = new Producto(101, "marca10", "tipo10", 100, 1000, 10);

        List<Producto> productos = new ArrayList<Producto>();

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);
        productos.add(producto8);
        productos.add(producto9);
        productos.add(producto10);

        double precioVentaMayor = 0;
        for (int i = 0; i < productos.size(); i++) {

            if (productos.get(i).getPrecioVenta() > precioVentaMayor) {
                precioVentaMayor = productos.get(i).getPrecioVenta();
            }

        }
        System.out.println("el mayor precio de venta es: " + precioVentaMayor);
        double precioCostoMenor = 10000000;

        for (int i = 0; i < productos.size(); i++) {

            if (productos.get(i).getPrecioCosto() < precioCostoMenor) {
                precioCostoMenor = productos.get(i).getPrecioCosto();
            }

        }
        System.out.println("el menor precio de costo es: " + precioCostoMenor);

        System.out.println("eliminando producto 5 de codigo: " + productos.get(4).getCodigo());

        productos.remove(4);

        System.out.println("el producto 5 ha sido eliminado");

        double cantidadMayorStock = 0;
        for (int i = 0; i < productos.size(); i++) {

            if (productos.get(i).getCantidadStock() > cantidadMayorStock) {
                cantidadMayorStock = productos.get(i).getCantidadStock();
            }

        }
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCantidadStock() == cantidadMayorStock) {
                    System.out.println("el producto con la mayor cantidad en stock: "+productos.get(i));
            productos.get(i).setCantidadStock((productos.get(i).getCantidadStock()-3));
                System.out.println("el producto con la mayor cantidad en stock tras descontar 3: "+productos.get(i));
            }
            }

        }

    }
