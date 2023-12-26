package com.enrique;

import com.enrique.entities.Auto;
import com.enrique.entities.Camioneta;
import com.enrique.entities.Moto;
import com.enrique.entities.Vehiculo;

public class Ejercicio13 {

    public static void main(String[] args) {

        Auto coche = new Auto(100, 200, 1, "abc-0108", "audi", "a4", 2015, 10000);
        Camioneta camioneta = new Camioneta(80, 10, 2, "bac-0203", "nisan", "tiger", 1998, 20000);
        Moto moto = new Moto(240, "tipoMotor1", 3, "cab-0304", "volvo", "beatle", 2020, 30000);

        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = coche;
        vehiculos[1] = camioneta;
        vehiculos[2] = moto;

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
            System.out.println("Antiguedad " + vehiculo.calcularAntiguedad()+ " años");
            if (vehiculo instanceof Auto) {
                Auto a = (Auto) vehiculo;
                a.cargarEnergia();
            } else if (vehiculo instanceof Camioneta) {
                Camioneta c = (Camioneta) vehiculo;
                c.recargarCombustible();
            } else if (vehiculo instanceof Moto) {
                Moto m = (Moto) vehiculo;
                m.recargarCombustible();
            }
        }
    }

}
