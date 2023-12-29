package com.enrique.entities;

public class Producto {

    int codigo;
    String marca;
    String tipo;
    double precioCosto;
    double precioVenta;
    int cantidadStock;

    public Producto() {
    }

    public Producto(int codigo, String marca, String tipo, double precioCosto, double precioVenta, int cantidadStock) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.cantidadStock = cantidadStock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", marca=" + marca + ", tipo=" + tipo + ", precioCosto=" + precioCosto + ", precioVenta=" + precioVenta + ", cantidadStock=" + cantidadStock + '}';
    }
    
    
    
}
