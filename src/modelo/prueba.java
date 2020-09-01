/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Josue Emmanuel Medina Garcia
 */
public class prueba {

    
    public static void main(String[] args) {
        Coche c = new Coche(0, 500, 1, 1, 1, 2);
        
        System.out.println("Tiempo de encuentro: "+c.tiempoEncuentro());
        System.out.println("Posicion final "+c.posicion());
        System.out.println("Posicion final1 "+c.posicion1());
        System.out.println("Velocidad final "+c.velocidad());
        System.out.println("Velocidad final1 "+c.velocidad1()*-1);
    }
    
}
