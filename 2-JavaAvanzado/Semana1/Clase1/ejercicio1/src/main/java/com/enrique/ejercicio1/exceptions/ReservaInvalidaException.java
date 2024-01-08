package com.enrique.ejercicio1.exceptions;

public class ReservaInvalidaException extends Exception{


    public ReservaInvalidaException() {
    super();
    }
    
    public ReservaInvalidaException(String mensaje) {
        super(mensaje);
    }

}
