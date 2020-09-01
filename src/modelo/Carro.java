/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import static java.lang.Thread.sleep;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Coche;
import controlador.CocheController;

/**
 * 
 * @author Josue Emmanuel Medina Garcia
 */
public class Carro extends Thread{
    
    private frmCarro c; 
    private JLabel carro;
    private JLabel carro1;

    CocheController cc = new CocheController();
    public Carro(frmCarro c, JLabel carro, JLabel carro1) {
        this.c = c;
        this.carro = carro;
        this.carro1 = carro1;

    }
    
    public static double posicion(int x, int v, int a, double t) {
        return x + v*t + (a*t*t)/2;
    }
    
    /*public static double tiempo(int xa, int va, int aa,int xb, int vb, int ab) {
        return (-1*(va+vb)+Math.sqrt(((va+vb)*(va+vb))-(2*((aa+ab)*(xa-xb)))))/(aa+ab);
    }*/
    
    @Override
    public void run(){
        int x = 0;
        int x1 = 0;
        int tiempo = 0;
        try {
            while (true) { 
                
                sleep(10); 
                x = c.getCarro().getLocation().x;
                x1 = c.getCarro1().getLocation().x;
                tiempo++;
                carro.setLocation(x + ((int)posicion(x, Integer.parseInt(c.getTxtVel().getText()), Integer.parseInt(c.getTxtAce().getText()), tiempo)/1000), carro.getLocation().y);
                carro1.setLocation(x1-((int)posicion(x1, Integer.parseInt(c.getTxtVel().getText()), Integer.parseInt(c.getTxtAce1().getText()), tiempo)/1000), carro.getLocation().y);  
                c.repaint(); 
                if(x>=x1-100){
                    break;
                }
            }
            c.botonesFinal();
            JOptionPane.showMessageDialog(null, "Los coches chocaron :(");
            Coche coche = new Coche(Integer.parseInt(c.getTxtPos().getText()),Integer.parseInt(c.getTxtPos1().getText()), Integer.parseInt(c.getTxtVel().getText()), Integer.parseInt(c.getTxtVel1().getText()), Integer.parseInt(c.getTxtAce().getText()), Integer.parseInt(c.getTxtAce1().getText()));
            c.añadir(coche);
            c.listar();
            } catch (Exception e) {
        }
    }
}
