
package mx.com.everis.tallerJava.clases;

/**
 * @author Abel
 */
public class Persona {
    public String nombre="default";
    protected String apellido="default";
    private int Edad=15;
    
    
    /*
    *Los modificadores de accesos private solo dejaran el acceso
    *en la misma clase
    */
    public void caminar(){
        System.out.println(nombre + " esta corriendo a la edad de: "+Edad);
    }
    
    protected void comer(){
        System.out.println(nombre + " esta comiendo");
    }
    
    private void beber(){
        System.out.println(nombre + " esta esta bebiendo");
    }
    
    
    
    
    
}