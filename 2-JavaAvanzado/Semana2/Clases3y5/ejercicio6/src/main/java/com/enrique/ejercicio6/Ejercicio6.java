package com.enrique.ejercicio6;

import com.enrique.ejercicio6.entities.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio6 {

    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<Empleado>();

        empleados.add(new Empleado("Enrique", 20000.00, "Desarrollador"));
        empleados.add(new Empleado("David", 18000.00, "Desarrollador"));
        empleados.add(new Empleado("Isa", 50000.00, "Analista"));
        empleados.add(new Empleado("Nico", 30000.00, "Profesor"));
        empleados.add(new Empleado("Luisina", 180000.00, "Profesor"));

        List<Empleado> empleadosVip = empleados.stream()
                .filter(e -> e.getSalario() > 25000)
                .collect(Collectors.toList());
        System.out.println(empleadosVip);

        final double[] suma = {0.0};  // Declara un array de un solo elemento

        List<Empleado> Desarrolladores = empleados.stream()
                .filter(e -> e.getCategoria().equals("Desarrollador"))
                .collect(Collectors.toList());

        Desarrolladores.stream()
                .map(Empleado::getSalario)
                .forEach(e -> suma[0] += e);

        double media = suma[0] / Desarrolladores.size();
        System.out.println(Desarrolladores);
        System.out.println("media salario Desarrolladores: " + media);
        Optional<Empleado> empleadoMAX = empleados.stream()
                .max((e1, e2) -> Double.compare(e1.getSalario(), e2.getSalario()));
        
        System.out.println(empleadoMAX);
                
    }
}
