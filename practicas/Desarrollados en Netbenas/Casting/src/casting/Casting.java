
package casting;


public class Casting {

    /*
     * Upcasting
     */
    
    Empleado emp=new Ejecutivo("Gerente de ventas",20000); //apuntador a ejecutivo
    
    
    
    /*
     * downcasting
     */
    Empleado emp2=(Empleado)emp; //se convierte la referencia
    
    
    
}
