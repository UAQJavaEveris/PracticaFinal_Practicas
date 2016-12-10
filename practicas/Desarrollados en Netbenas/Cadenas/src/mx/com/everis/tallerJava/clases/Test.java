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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre="Gustavo";
        String nombre2="Gustavo";
        
        if (nombre.equalsIgnoreCase(nombre2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        String nombreCompleto="Jose Abel Palacios Gonzalez";
        String [] nombre5=nombreCompleto.split(" ");
        for (int i=0;i<nombre5.length;i++){
            System.out.println(nombre5[i]);
        }
        
        String pruebaTrim="    algo   ";
        pruebaTrim=pruebaTrim.trim();
        System.out.println(pruebaTrim);
        
        String pruebaIndex="abcd";
        System.out.println("El index de la c es: "+pruebaIndex.indexOf("c"));
        
        
    }
    
}
