package com.enrique.ejercicio1;

import com.enrique.ejercicio1.entities.Reserva;
import com.enrique.ejercicio1.entities.Vuelo;
import com.enrique.ejercicio1.exceptions.ReservaInvalidaException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<Vuelo> vuelos = new ArrayList<Vuelo>();
        vuelos.add(new Vuelo("A36", "Canarias", LocalDate.parse("03-02-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy")), 1));
        vuelos.add(new Vuelo("B22", "Barcelona", LocalDate.parse("01-02-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy")), 2));
        vuelos.add(new Vuelo("C47", "Madrid", LocalDate.parse("05-03-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy")), 4));
        vuelos.add(new Vuelo("D16", "Irlanda", LocalDate.parse("07-07-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy")), 10));
        vuelos.add(new Vuelo("E12", "Francia", LocalDate.parse("04-04-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy")), 100));

        try {

            Reserva reserva1 = reservaDeVuelos();


            for (Vuelo vuelo : vuelos) {
                if (reserva1.getDestino().equals(vuelo.getDestino()) && reserva1.getFechaDeViaje().equals(vuelo.getFechaDeViaje())) {
                    if (vuelo.getNumeroDeAsientos() < reserva1.getNumeroDeAsientos()) {
                        System.out.println("lo sentimos no puede reservar tantos Asientos para este vuelo");
                        System.out.println("asientos disponibles: " + vuelo.getNumeroDeAsientos());
                    } else {
                        System.out.println("la reserva ha sido realizada");
                    }
                }
            }

        } catch (ReservaInvalidaException ex) {
            System.out.println(ex.getMessage() + "Vuelva a Rellenar los datos de la Reserva");
        }

    }

    public static Reserva reservaDeVuelos() throws ReservaInvalidaException {

        System.out.println("bienvenido a nuestro programa de reserva de vuelos");
        System.out.println("introduzca su nombre");
        String nombreReserva = sc.nextLine();
        if (nombreReserva.isBlank()) {
            throw new ReservaInvalidaException("Error al rellenar el nombre");
        }
        System.out.println("Introduzca el destino");
        String destinoReserva = sc.nextLine();
        if (destinoReserva.isBlank()) {
            throw new ReservaInvalidaException("Error al rellenar el destino");
        }
        System.out.println("introduzca la fecha de cuando desea viajar en formato dd-MM-yyyy");
        String fechaReserva = sc.nextLine();
        if (fechaReserva.isBlank()) {
            throw new ReservaInvalidaException("Error al rellenar la fecha");
        }
        System.out.println("cuantos asientos desea reservar?");
        String asientosReserva = sc.nextLine();
        if (asientosReserva.isBlank()) {
            throw new ReservaInvalidaException("Error al rellenar los asientos");
        }

        Reserva reserva = new Reserva(nombreReserva, destinoReserva, LocalDate.parse(fechaReserva, DateTimeFormatter.ofPattern("dd-MM-yyyy")), Integer.parseInt(asientosReserva));
        return reserva;

    }

}
