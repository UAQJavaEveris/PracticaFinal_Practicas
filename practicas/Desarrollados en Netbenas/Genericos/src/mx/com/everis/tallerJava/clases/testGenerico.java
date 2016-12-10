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
public class testGenerico {
    Persona p=new Persona();
    
    miGenerico<Float> generico=new miGenerico<Float>(15.3f);
    miGenerico<Persona> generico2=new miGenerico<Persona>(new Persona());
}
