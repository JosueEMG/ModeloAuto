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

    private double x;
    private double x1;
    private double v;
    private double v1;
    private double a;
    private double a1;

    public Coche(double x, double x1, double v, double v1, double a, double a1) {
        this.x = x;
        this.x1 = x1;
        this.v = v;
        this.v1 = v1;
        this.a = a;
        this.a1 = a1;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
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
