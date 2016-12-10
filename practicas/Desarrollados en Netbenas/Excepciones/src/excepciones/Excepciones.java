/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Abel
 */
public class Excepciones {

    
    //public static void main(String[] args) throws MiException {
    public static void main(String[] args) {
        
        try{
            int valora=0;
            int valorb=1;

            if (valora>=valorb){
                throw new MiException();
            }else{
                System.out.println("Sin exception");
            }
        }catch(MiException e){
            e.printStackTrace();
        }finally{
            System.out.println("Termina todo");
        }
    }
    
}
