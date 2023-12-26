
package com.enrique;

import com.enrique.entities.Animal;
import com.enrique.entities.Ave;
import com.enrique.entities.Mamifero;
import com.enrique.entities.Reptil;


public class Ejercicio11 {

    public static void main(String[] args) {
        
        Mamifero cerdo = new Mamifero();
        Ave gorrion = new Ave();
        Reptil iguana = new Reptil();
        
        cerdo.saludar();
        gorrion.saludar();
        iguana.saludar();
        
        Animal animal = cerdo;// es posible y ahora se comporta como un mamifero, asi lo vemos con el siguiente metodo
        animal.saludar();
        
        // al cambiar a private solo podemos acceder a los metodos desde la propia clase y por tanto no es posible acceder a ellos 
    }
    
}
