/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.everis.tallerJava.clases;

import java.util.Iterator;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Abel
 */
public class Testing {
    
    public void imprimirDetallePelicula(ResourceBundle resourceBundle){
        String nombre= resourceBundle.getString("nombre");
        Float precio=(Float)resourceBundle.getObject("precio");
        Integer anio=(Integer)resourceBundle.getObject("anio");
        
        System.out.println(nombre+" - "+precio+" - "+anio);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Muestra los idiomas con los que puedes trabajar
        Locale locale=Locale.getDefault();
        System.out.println("Idioma: "+locale.getDisplayLanguage()+" Pais: "+ locale.getDisplayCountry());
        //Display all locales
        Locale [] listaDelocale=locale.getAvailableLocales();
        
        for (int i=0;i<listaDelocale.length;i++){
            System.out.println("Pais: "+listaDelocale[i].getDisplayCountry());
        }
        
        //Localizacion Current Locale
        Locale currentLocale=Locale.getDefault();
        imprimirDetallePelicula(ResourceBundle.getBundle("MsgErrores",currentLocale));
        
        //Localizacion Current Locale
        Locale currentLocale =Locale.getDefault();
    }
    
}
