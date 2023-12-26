
package com.enrique.entities;

public class Sombrero extends Vestimenta {
    
    String tipo;
    String tamaño;

    public Sombrero() {
    }

    public Sombrero(int codigo, String nombre, double precio, String marca, double talla, String color, String tipo, String tamaño) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return super.toString() + " Sombrero{" + "tipo=" + tipo + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
    @Override
    public void mostrar(){
    
        System.out.println("Este sombrero es de tipo: " + tipo);
    }
    
    
}
