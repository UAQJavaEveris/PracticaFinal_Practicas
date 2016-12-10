/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;
import A.Persona;
import B.Acciones;
/**
 *
 * @author Abel
 */
public class Hijo extends Persona implements Acciones {

    /**
     *constructor public
     */
    public Hijo(){
        System.out.println("Hijo " + getNombre()); 
    }
    public Hijo (String nombre){
        super(nombre);
    }
    /**
     * to run
     */
    public void correr() {
        System.out.println("Correr " + getNombre());
    }

    /**
     * to speak
     */
    public void hablar() {
        System.out.println("Hablar " + getNombre());
    }

    /**
     * to drink
     */
    public void beber() {
        System.out.println("beber " + getNombre());    
    }
    
}
