
/*
 * El primero modificador es el package que seria el default
 */
package mx.com.everis.tallerJava.principal;
/*
 * importamos la clase persona desde el otro package
 */
import mx.com.everis.tallerJava.clases.Persona;

/**
 * @author Abel
 */
public class ProgTarea01TallerEveris extends Persona{

    /*
     * Una vez extendida la clase podemos acceder a sus atributos 
     * y metodos protected
     */
    ProgTarea01TallerEveris (){
        apellido="asd";
        comer();
        
        
        /*
        *Como podemos ver aun realizando las relaciones lo metodos
        *privados siguen sin estar al alcance
        */
        
        //edad
        //beber()
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p=new Persona();
        
        /*
        *Una vez importada la clase al package tenemos acceso a lo 
        *publico
        */
        p.nombre="juan";
        p.caminar();
        
        System.out.println();
    }
    
}
