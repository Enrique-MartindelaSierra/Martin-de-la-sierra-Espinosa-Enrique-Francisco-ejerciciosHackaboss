
package com.enrique.entities;

public class Reptil extends Animal {
    
    double longitud;
    String tipoDeEscamas;
    String tipoDeVeneno;
    String habitat;

    public Reptil() {
    }

    public Reptil(int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion, double longitud, String tipoDeEscamas, String tipoDeVeneno, String habitat) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.longitud = longitud;
        this.tipoDeEscamas = tipoDeEscamas;
        this.tipoDeVeneno = tipoDeVeneno;
        this.habitat = habitat;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getTipoDeEscamas() {
        return tipoDeEscamas;
    }

    public void setTipoDeEscamas(String tipoDeEscamas) {
        this.tipoDeEscamas = tipoDeEscamas;
    }

    public String getTipoDeVeneno() {
        return tipoDeVeneno;
    }

    public void setTipoDeVeneno(String tipoDeVeneno) {
        this.tipoDeVeneno = tipoDeVeneno;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + " Reptil{" + "longitud=" + longitud + ", tipoDeEscamas=" + tipoDeEscamas + ", tipoDeVeneno=" + tipoDeVeneno + ", habitat=" + habitat + '}';
    }
    
     @Override
     public void saludar(){
        System.out.println("Hola, soy un reptil");
    }
    
    
}
