
package com.enrique.entities;

public class Pantalon extends Vestimenta {
    
    String estilo;
    String tipoTejido;

    public Pantalon() {
    }

    public Pantalon(int codigo, String nombre, double precio, String marca, double talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoTejido() {
        return tipoTejido;
    }

    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }

    @Override
    public String toString() {
        return super.toString() + " Pantalon{" + "estilo=" + estilo + ", tipoTejido=" + tipoTejido + '}';
    }
    
   
    @Override
    public void mostrar(){
    
        System.out.println("Estos pantalones son de estilo: " + estilo);
    }
    
    
}
