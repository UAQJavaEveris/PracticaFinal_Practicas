/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.everis.tallerJava.clases;

/**
 *
 * @author Abel
 */
public class Hilos {

    /**
      * Hay dor formas de crear hilos en java, extendiendo de la clase Thread
      * y implementando la interfaz runnable
      * 
      * las dos deben tener el metodo public void run()
     */
    public static void main(String[] args) {
        //Primera forma de hilos
        Thread Extension=new Thread (new Extension());
        Extension.start();
        //segunda forma de hilos
        Implementando miHilo=new Implementando();
        Thread Implementando=new Thread(miHilo);
        
        Implementando.start();
        
    }
    
}
