/**
 * Sumas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.tallerJava.service;

public interface Sumas extends java.rmi.Remote {
    public int getSuma(int arg0, int arg1) throws java.rmi.RemoteException;
    public int getSumaArrayNum(java.lang.Integer[] arg0) throws java.rmi.RemoteException;
    public int getSumaTresNumeros(int arg0, int arg1, int arg2) throws java.rmi.RemoteException;
}
