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
public class Coche {

    private int x;
    private int x1;
    private int v;
    private int v1;
    private int a;
    private int a1;

    public Coche(int x, int x1, int v, int v1, int a, int a1) {
        this.x = x;
        this.x1 = x1;
        this.v = v;
        this.v1 = v1;
        this.a = a;
        this.a1 = a1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }
    
    public double tiempoEncuentro() {
        return (-1*(v+v1)+Math.sqrt(((v+v1)*(v+v1))-(2*((a+a1)*(x-x1)))))/(a+a1);
    }
    
    public double posicion() {
        return x + v*tiempoEncuentro() + (a*tiempoEncuentro()*tiempoEncuentro())/2;
    }
    
    public double posicion1() {
        return x1 - v1*tiempoEncuentro() - (a1*tiempoEncuentro()*tiempoEncuentro())/2;
    }
    
    public double velocidad() {
        return v + a*tiempoEncuentro();
    }
    
    public double velocidad1() {
        return v1 - a1*tiempoEncuentro();
    }
}
