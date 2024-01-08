package com.enrique.ejercicio9.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascotas {

    public static <T> void agregar(List<T> lista, T objeto) {
        lista.add(objeto);
    }

    public static <T> List<T> buscarPorNombre(List<T> lista, String nombre) {
        List<T> resultados = new ArrayList<>();
        for (T t : lista) {
            if (((Mascota) t).getNombre().equalsIgnoreCase(nombre)) {
                resultados.add(t);
            }
        }
        return resultados;

    }

    public static <T> List<T> buscarPorEspecie(List<T> lista, String especie) {
        List<T> resultados = new ArrayList<>();
        for (T t : lista) {
            if (((Mascota) t).getEspecie().equalsIgnoreCase(especie)) {
                resultados.add(t);
            }
        }
        return resultados;
    }

    public static <T> int calcularTotal(List<T> lista) {
        int total = lista.size();

        return total;
    }

    public static <T> List<T> generarDatosAleatorios(List<T> lista, int cantidad) {

        List<T> resultados = new ArrayList<T>();
        Random rand = new Random();
        String[] nombres = {"Luna", "Max", "Bella", "Charlie", "Lucas", "Daisy", "Rocky", "Coco", "Simba", "Lola"};
        String[] especies = {"Perro", "Gato", "Reptil", "Ave"};

        for (int i = 0; i < cantidad; i++) {
            String nombreAleatorio = nombres[rand.nextInt(nombres.length)];
            int edadAleatoria = rand.nextInt(10) + 1; // Edad entre 1 y 10
            String especieAleatoria = especies[rand.nextInt(especies.length)];
            int id = lista.size() + i;

            Mascota mascota = new Mascota(id, nombreAleatorio, edadAleatoria, especieAleatoria);
            resultados.add((T) mascota);
        }
        return resultados;
    }
}
