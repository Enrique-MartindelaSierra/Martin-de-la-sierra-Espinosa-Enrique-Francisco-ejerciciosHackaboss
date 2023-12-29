package com.enrique.ejercicio16;

import com.enrique.ejercicio16.logica.Controladora;
import com.enrique.ejercicio16.logica.Platillo;
import java.util.List;

public class Ejercicio16 {

    public static void main(String[] args) {

        Controladora control = new Controladora();

        /*PROCESO DE ALTAS*/
        System.out.println("--------REALIZANDO LAS ALTAS--------");
        Platillo plat1 = new Platillo(1,"Milanesa a la napolitana","esta es la receta", 15.0);
        control.crearPlatillo(plat1);
        Platillo plat2 = new Platillo(2, "Fiedos con salsa", "esta es la receta", 8.0);
        control.crearPlatillo(plat2);
        control.crearPlatillo(new Platillo(3, "Paella", "esta es la receta", 25.0));

  
        /*PROCESO DE ELIMINACIÓN*/
        System.out.println("--------ELIMINANDO REGISTRO 2--------");
        int idEliminar = 2;
        control.eliminarPlatillo(idEliminar);
        
        /*PROCESO DE EDICIÓN*/
        System.out.println("--------EDITANDO REGISTRO 3--------");
        int idEditar = 3;
        Platillo platEdit = control.buscarPlatillo(idEditar);
        platEdit.setPrecio(30.0);
        
        control.editarPlatillo(platEdit);
        
        /*PROCESO DE LECTURA*/
        System.out.println("--------LISTA FINAL DE PLATILLOS--------");
        List<Platillo> listaPlatillos = control.traerPlatillos();

        for (Platillo plat : listaPlatillos) {
            System.out.println(plat.toString());
        }

        
    }

}
