/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.everis.tallerJava.clases;

import java.util.Vector;
/**
 *
 * @author Abel
 */
public class Genericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector<Float> elementos = new Vector <Float> ();
        elementos.add(10.5f);
        elementos.add(11.8f);
        
        for (int i =0;i<elementos.size();i++){
            Float valorTmp=(Float)elementos.get(i);
            System.out.println(valorTmp);
        }
        
    }
    
}
