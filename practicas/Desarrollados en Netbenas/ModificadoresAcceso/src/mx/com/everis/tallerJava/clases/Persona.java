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
public class Persona {
    public String nombre;
    protected String apellido;
    private int Edad;
    
    protected void caminar(){
        System.out.println(nombre + " esta corriendo");
    }
    
    public void comer(){
        System.out.println(nombre + " esta comiendo");
    }
    
    public void beber(){
        System.out.println(nombre + " esta esta bebiendo");
    }
}
