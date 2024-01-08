package com.enrique.ejercicio9;

import com.enrique.ejercicio9.entities.Mascota;
import com.enrique.ejercicio9.entities.RegistroMascotas;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {

    public static void main(String[] args) {

        List<Mascota> mascotas = new ArrayList<Mascota>();
        mascotas.addAll(RegistroMascotas.generarDatosAleatorios(mascotas, 20));

        System.out.println(mascotas);
        
        System.out.println(RegistroMascotas.buscarPorEspecie(mascotas, "ave"));
        System.out.println(RegistroMascotas.buscarPorNombre(mascotas, "max"));
        
        System.out.println(RegistroMascotas.calcularTotal(mascotas));
        
    }
}
