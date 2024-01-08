package com.enrique.ejercicio7;

import com.enrique.ejercicio7.entities.Evento;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio7 {

    public static void main(String[] args) {

        List<Evento> eventos = new ArrayList<>();
        eventos.add(new Evento("Reunión Equipo", LocalDate.of(2024, 1, 15), "Reunión"));
        eventos.add(new Evento("Conferencia Java", LocalDate.of(2024, 2, 10), "Conferencia"));
        eventos.add(new Evento("Taller de Desarrollo", LocalDate.of(2024, 1, 20), "Taller"));
        eventos.add(new Evento("Reunión Departamental", LocalDate.of(2024, 1, 15), "Reunión"));
        eventos.add(new Evento("Conferencia AI", LocalDate.of(2024, 2, 5), "Conferencia"));

        LocalDate fechaEspecifica = LocalDate.of(2024, 1, 15);
        List<Evento> eventosParaFecha = eventos.stream()
                .filter(e -> e.getFecha().equals(fechaEspecifica))
                .collect(Collectors.toList());

        System.out.println("Eventos para la fecha " + fechaEspecifica + ":");
        eventosParaFecha.forEach(e -> System.out.println(e.getNombre()));

        Map<String, Long> eventosPorCategoria = eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));

        System.out.println("Cantidad de eventos por categoría:");
        eventosPorCategoria.forEach((categoria, cantidad)
                -> System.out.println(categoria + ": " + cantidad));

        LocalDate fechaActual = LocalDate.now();
        Optional<Evento> eventoMasProximo = eventos.stream()
                .filter(e -> e.getFecha().isAfter(fechaActual))
                .min((e1, e2) -> e1.getFecha().compareTo(e2.getFecha()));

        eventoMasProximo.ifPresent(evento
                -> System.out.println("Evento más próximo: " + evento.getNombre()
                        + " (Fecha: " + evento.getFecha() + ")"));
    }
}
