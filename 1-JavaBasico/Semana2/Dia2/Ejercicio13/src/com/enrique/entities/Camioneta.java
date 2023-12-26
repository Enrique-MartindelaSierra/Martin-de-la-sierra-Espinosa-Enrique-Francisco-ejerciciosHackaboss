package com.enrique.entities;

public class Camioneta extends Vehiculo implements Combustion {

    double capacidadTanque;
    double consumoCombustible;

    public Camioneta() {
    }

    public Camioneta(double capacidadTanque, double consumoCombustible, int id, String placa, String marca, String modelo, int año, double costo) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public String toString() {
        return super.toString() + " Camioneta{" + "capacidadTanque=" + capacidadTanque + ", consumoCombustible=" + consumoCombustible + '}';
    }
     
    
    
    @Override
    public int calcularAntiguedad() {
        return (2023 - super.año);
    }

    @Override
    public void recargarCombustible() {
        System.out.println("el combustible está recargado");
    }

}
