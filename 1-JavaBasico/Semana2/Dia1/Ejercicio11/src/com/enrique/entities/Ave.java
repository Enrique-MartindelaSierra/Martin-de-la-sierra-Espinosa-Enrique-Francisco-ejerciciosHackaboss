
package com.enrique.entities;

public class Ave extends Animal {
    
    String envergaduraDeAlas;
    String tipoDeVuelo;
    String colorDePlumaje;
    String tipoDePico;

    public Ave() {
        super();
    }

    public Ave(int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion, String envergaduraDeAlas, String tipoDeVuelo, String colorDePlumaje, String tipoDePico) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.envergaduraDeAlas = envergaduraDeAlas;
        this.tipoDeVuelo = tipoDeVuelo;
        this.colorDePlumaje = colorDePlumaje;
        this.tipoDePico = tipoDePico;
    }

    public String getEnvergaduraDeAlas() {
        return envergaduraDeAlas;
    }

    public void setEnvergaduraDeAlas(String envergaduraDeAlas) {
        this.envergaduraDeAlas = envergaduraDeAlas;
    }

    public String getTipoDeVuelo() {
        return tipoDeVuelo;
    }

    public void setTipoDeVuelo(String tipoDeVuelo) {
        this.tipoDeVuelo = tipoDeVuelo;
    }

    public String getColorDePlumaje() {
        return colorDePlumaje;
    }

    public void setColorDePlumaje(String colorDePlumaje) {
        this.colorDePlumaje = colorDePlumaje;
    }

    public String getTipoDePico() {
        return tipoDePico;
    }

    public void setTipoDePico(String tipoDePico) {
        this.tipoDePico = tipoDePico;
    }

    @Override
    public String toString() {
        return super.toString() + " Ave{" + "envergaduraDeAlas=" + envergaduraDeAlas + ", tipoDeVuelo=" + tipoDeVuelo + ", colorDePlumaje=" + colorDePlumaje + ", tipoDePico=" + tipoDePico + '}';
    }
 
     @Override
     public void saludar(){
        System.out.println("Hola, soy un ave");
    }
    
    
    
}
