package com.enrique.ejercicio8;

import com.enrique.ejercicio8.entities.Auto;
import com.enrique.ejercicio8.entities.InventarioAutos;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio8 {

    public static void main(String[] args) {
        List<Auto> inventario = new ArrayList<Auto>();
        Auto auto1 = new Auto("Renault", "X", 2020, 15000.00);
        Auto auto2 = new Auto("Toyota", "Camry", 2022, 25000.00);
        Auto auto3 = new Auto("Honda", "Civic", 2022, 22000.00);
        Auto auto4 = new Auto("Ford", "Escape", 2023, 28000.00);
        
        InventarioAutos.agregar(inventario, auto1);
        InventarioAutos.agregar(inventario, auto2);
        InventarioAutos.agregar(inventario, auto3);
        InventarioAutos.agregar(inventario, auto4);
        
        System.out.println(inventario);
        
        System.out.println(InventarioAutos.buscarPorAño(inventario, 2022));
        
        System.out.println(InventarioAutos.buscarPorMarca(inventario, "Ford"));
        
        System.out.println(InventarioAutos.CalcularTotal(inventario));
    }
}
