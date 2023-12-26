package com.enrique.ejercicio15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/universidad";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("funciona");

            Scanner sc = new Scanner(System.in);

            int opcion = 0;
            do {
                System.out.println("Seleccione una opción");
                System.out.println("1 leer un estudiante");
                System.out.println("2 ingresar un estudiante");
                System.out.println("3 salir");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1 -> {
                        leerEstudiante(conexion);
                    }
                    case 2 -> {
                        crearEstudiante(conexion, sc);
                    }
                    case 3 ->
                        System.out.println("Gracias por usar nuestro programa");
                    default ->
                        System.out.println("Error");
                }
            } while (opcion != 3);

            conexion.close();

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void leerEstudiante(Connection conexion) throws SQLException {

        Statement statement = conexion.createStatement();
        String sql = "SELECT * FROM estudiantes";

        ResultSet result = statement.executeQuery(sql);

        while (result.next()) {

            int id = result.getInt("id");
            String nombre = result.getString("nombre");
            int edad = result.getInt("edad");
            double calificacion = result.getDouble("calificacion");

            System.out.println("Id: " + id + " nombre: " + nombre + " edad: " + edad + " calificacion: " + calificacion);
        }

        result.close();
        statement.close();

    }

    private static void crearEstudiante(Connection conexion, Scanner sc) throws SQLException {
        String sql = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

            System.out.println("Introduce el nombre");
            String nombre = sc.nextLine();

            System.out.println("Introduce la edad");
            int edad = Integer.parseInt(sc.nextLine());

            System.out.println("Introduce la calificacion");
            double calificacion = Double.parseDouble(sc.nextLine());

            preparedStatement.setString(1, nombre);
            preparedStatement.setInt(2, edad);
            preparedStatement.setDouble(3, calificacion);
            preparedStatement.executeUpdate();

            System.out.println("Estudiante creado correctamente");

        }

    }

}
