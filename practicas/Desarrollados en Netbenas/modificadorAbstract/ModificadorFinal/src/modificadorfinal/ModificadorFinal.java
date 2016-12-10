/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadorfinal;
import mx.com.everis.tallerJava.Clases.Persona;
/**
 *
 * @author Abel
 */
public class ModificadorFinal extends Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        System.out.println(Persona.nombre);
        System.out.println("la suma es"+Persona.sumar());
        
        Persona P =new Persona();
        System.out.println(P.apellido);
        
        
    }
    
}
