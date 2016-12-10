/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.everis.tallerJava.clases;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abel
 */
public class Extension extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Mi hilo con la clase Thread");
        } catch (InterruptedException ex) {
            Logger.getLogger(Extension.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
