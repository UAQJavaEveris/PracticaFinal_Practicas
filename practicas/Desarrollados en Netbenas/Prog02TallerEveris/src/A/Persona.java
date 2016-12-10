/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

/**
 *
 * @author Abel
 */
public class Persona {
    private String nombre;
    private String apellido;

    /**
     * constructor public
     */
    public Persona(){
        System.out.println("Persona");
    }
    
    /**
     * constructor
     * @param nombre 
     */
    public Persona(String nombre){
        this.nombre=nombre;
    }
    
    /**
     * get name
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * set name
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * get name
     * @return 
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * setApellido
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
