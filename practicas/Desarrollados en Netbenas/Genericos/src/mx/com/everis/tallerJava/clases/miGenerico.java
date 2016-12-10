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
public class miGenerico<T> {
    
    public T valor;
    miGenerico(T valor){
        this.valor=valor;
        System.out.println(valor);
    }
    
    public void print(){
        System.out.println("Valor: "+this.valor.toString());
    }
}
