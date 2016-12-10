/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Abel
 */
public class Arreglos {

    String nombre[]={"hola","hola2","hola3"};
    int valores[]={1,3,5,7};
    double decimales[]={1.1,2.3};
    Double decimalesobjc []={new Double (3.4),new Double (4.5)};
    static Persona personas[]={new Persona("Gustavo","Sanchez"),new Persona("Gustavo","Sanchez",18)};
    public static void main(String[] args) {
        
        
        for (int i=0;i<personas.length;i++){
            System.out.println("Nombre: "+personas[i].getNombre()+"Apellido: "+personas[i].getApellido()+" edad: " +personas[i].getEdad());
        }
        
        for (Persona p: personas){
            System.out.println("Nombre: "+p.getNombre()+"Apellido: "+p.getApellido()+" edad: " +p.getEdad());
        }
        
    }
    
}
