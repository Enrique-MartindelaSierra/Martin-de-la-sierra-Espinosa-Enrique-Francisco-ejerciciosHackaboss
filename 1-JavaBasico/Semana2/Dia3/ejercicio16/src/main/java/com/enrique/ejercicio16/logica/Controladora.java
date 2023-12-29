package com.enrique.ejercicio16.logica;

import com.enrique.ejercicio16.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearPlatillo(Platillo plat) {
        controlPersis.crearPlatillo(plat);

    }

    public List<Platillo> traerPlatillos() {
        return controlPersis.traerPlatillos();
    }

    public void eliminarPlatillo(int idEliminar) {
        controlPersis.eliminarPlatillo(idEliminar);
    }

    public Platillo buscarPlatillo(int idEditar) {
        return controlPersis.buscarPlatillo(idEditar);
    }

    public void editarPlatillo(Platillo platEdit) {
        controlPersis.editarPlatillo(platEdit);
    }
}
