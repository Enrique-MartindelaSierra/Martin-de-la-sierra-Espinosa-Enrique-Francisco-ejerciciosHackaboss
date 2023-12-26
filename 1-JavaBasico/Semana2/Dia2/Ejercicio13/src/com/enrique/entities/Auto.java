
package com.enrique.entities;

public class Auto extends Vehiculo implements Electrico {

    double  capacidadBateria;
    double  autonomia;

    public Auto() {
        
    }

    public Auto(double capacidadBateria, double autonomia, int id, String placa, String marca, String modelo, int año, double costo) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return super.toString() + " Auto{" + "capacidadBateria=" + capacidadBateria + ", autonomia=" + autonomia + '}';
    }
    
    
    
  
    
    
    @Override
    public int calcularAntiguedad() {
     return (2023 - super.año); 
    }

    @Override
    public void cargarEnergia() {
        System.out.println("la energia está al cargada");
    }
    
}
