
package com.enrique.entities;

public class Moto extends Vehiculo implements Combustion {

    double cilindrada;
    String tipoMotor;

    public Moto() {
    }

    public Moto(double cilindrada, String tipoMotor, int id, String placa, String marca, String modelo, int año, double costo) {
        super(id, placa, marca, modelo, año, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return super.toString() + " Moto{" + "cilindrada=" + cilindrada + ", tipoMotor=" + tipoMotor + '}';
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
