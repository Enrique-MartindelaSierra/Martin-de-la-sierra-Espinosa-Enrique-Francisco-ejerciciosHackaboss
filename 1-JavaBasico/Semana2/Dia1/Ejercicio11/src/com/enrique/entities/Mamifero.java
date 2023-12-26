
package com.enrique.entities;


public class Mamifero extends Animal {
    
    int numeroDePatas;
    String tipoDeReproduccion;
    String colorDePelaje;
    String habitat;

    public Mamifero() {
    }

    public Mamifero(int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion, int numeroDePatas, String tipoDeReproduccion, String colorDePelaje, String habitat) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.numeroDePatas = numeroDePatas;
        this.tipoDeReproduccion = tipoDeReproduccion;
        this.colorDePelaje = colorDePelaje;
        this.habitat = habitat;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getTipoDeReproduccion() {
        return tipoDeReproduccion;
    }

    public void setTipoDeReproduccion(String tipoDeReproduccion) {
        this.tipoDeReproduccion = tipoDeReproduccion;
    }

    public String getColorDePelaje() {
        return colorDePelaje;
    }

    public void setColorDePelaje(String colorDePelaje) {
        this.colorDePelaje = colorDePelaje;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + " Mamifero{" + "numeroDePatas=" + numeroDePatas + ", tipoDeReproduccion=" + tipoDeReproduccion + ", colorDePelaje=" + colorDePelaje + ", habitat=" + habitat + '}';
    }

    @Override
     public void saludar(){
        System.out.println("Hola, soy un mamifero");
    }
    
    
    
}
