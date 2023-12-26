
package com.enrique.entities;

public class Zapato extends Vestimenta {
    
    String material;
    String tipoCierre;

    public Zapato() {
    }

    public Zapato(int codigo, String nombre, double precio, String marca, double talla, String color, String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    @Override
    public String toString() {
        return super.toString() + " Zapato{" + "material=" + material + ", tipoCierre=" + tipoCierre + '}';
    }
    

    @Override
    public void mostrar(){
        System.out.println("Estos zapatos son de marca: " + marca);
    }
}
