/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;
import java.util.*;
import modelo.Coche;
/**
 * 
 * @author Josue Emmanuel Medina Garcia
 */
public class CocheController {
    List<Coche> list = new ArrayList();

    public CocheController() {
    }
    
    public void añadir(Coche e) {
        list.add(e);
    }
    
    public List<Coche> listado() {
        return list;
    }
}
