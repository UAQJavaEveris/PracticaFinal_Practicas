
package mx.com.everis.tallerJava.principal;

import java.util.ArrayList;
import java.util.List;


public class Testing {

  
    public static void main(String[] args) {
        ArrayList <String> nombres=new ArrayList <String>();
        
        nombres.add("GustavoA");
        nombres.add("JuanicioG");
        nombres.add("PeregilF");
        
        List<String> apellidos= new ArrayList<String>();
        apellidos.add("Araiza");
        apellidos.add("Gonzalez");
        apellidos.add("Fernandez");
        
         for (String a:nombres){
            System.out.println(a);
        }
         System.out.println("\n\n");
        
        System.out.println("Apellidos size: "+apellidos.size());
        System.out.println("Apellido 2: "+apellidos.get(1)+"\n\n");
        
       if(apellidos.contains("Sanchez")){
           System.out.println("Contiene el apellido");
       }else{
           System.out.println("No contiene el apellido");
       }
     
       
    }
    
}
