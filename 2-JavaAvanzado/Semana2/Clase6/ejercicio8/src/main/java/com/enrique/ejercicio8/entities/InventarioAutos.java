package com.enrique.ejercicio8.entities;

import java.util.ArrayList;
import java.util.List;

public class InventarioAutos<T extends Auto> {

    public static <T> void agregar(List<T> lista, T objeto) {
        lista.add(objeto);
    }

    public static <T> List<T> buscarPorMarca(List<T> lista, String marca) {
        List<T> resultados = new ArrayList<>();
        for (T t : lista) {
            if (((Auto) t).getMarca().equalsIgnoreCase(marca)) {
                resultados.add(t);
            }
        }
        return resultados;

    }

    public static <T> List<T> buscarPorAño(List<T> lista, int año) {
        List<T> resultados = new ArrayList<>();
        for (T t : lista) {
            if (((Auto) t).getAño() == año) {
                resultados.add(t);
            }
        }
        return resultados;
    }

    public static <T> double CalcularTotal(List<T> lista) {
        double total = 0;
        for (T t : lista) {
            total += ((Auto)t).getPrecio();
        }

        return total;
    }
}
