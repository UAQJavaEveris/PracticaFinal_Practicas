/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.everis.tallerJava.Clases;

/**
 *
 * @author Abel
 */
public class Persona {
    public static String nombre="gus";
    public String apellido="gonzalez";
    public Persona(){
       
    }
    
    public static int sumar(){
        return 4;
    }
    
    public void setNombre(String nombre){
        nombre=nombre;
    }
    
    /**
     * El modificador de no acceso abstract se aplica para clases metodos, interfaces
     * reglas:
     * 1) si una clase es abstracta no se podra instanciar
     *  1.1)una clse abstracta puede contener metodos abstractos y no abstractos
     *  1.2)una clse abstracta puede heredar de una clase abstracta 
     *  1.3)una clse abstracta puede heredar de una clase no abstracta
     *  1.4)una clse abstracta es la encargada de implementar los metodos de una clase abstracta
     *  1.5)una clse abstracta 
     * 2)los metodos abstractos solo se definen
     * 3)las interfaces´por default son abstractas
     */
    
    /**
     * el modificador de noacceso final se aplica para: clases, metodos y variables
     * reglas:
     * 1)si una clase es final no tendra subclases esto quiere decir que no puede heredar
     * 2)si un metodo es final no se podra sobreescribir
     * 3)si una variable es final no se podra asignar una segunda vez
     */
    
    
    /**
     * el modificador static se utliza solo para clases y variables 
     * 1)las variables static se pueden acceder a nivel de clase
     * 2)las variables no-static solo se podran acceder mediante una instancia
     * 3)al igual que las variables no se necesita una instancia
     */
    public final String getNombre(){
        return "";
    }
}
