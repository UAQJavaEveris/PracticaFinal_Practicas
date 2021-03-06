package com.mx.tallerJava.service;

public class SaludosProxy implements com.mx.tallerJava.service.Saludos {
  private String _endpoint = null;
  private com.mx.tallerJava.service.Saludos saludos = null;
  
  public SaludosProxy() {
    _initSaludosProxy();
  }
  
  public SaludosProxy(String endpoint) {
    _endpoint = endpoint;
    _initSaludosProxy();
  }
  
  private void _initSaludosProxy() {
    try {
      saludos = (new com.mx.tallerJava.service.SaludosServiceLocator()).getSaludosPort();
      if (saludos != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)saludos)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)saludos)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (saludos != null)
      ((javax.xml.rpc.Stub)saludos)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mx.tallerJava.service.Saludos getSaludos() {
    if (saludos == null)
      _initSaludosProxy();
    return saludos;
  }
  
  public java.lang.String getSaludo(java.lang.String arg0) throws java.rmi.RemoteException{
    if (saludos == null)
      _initSaludosProxy();
    return saludos.getSaludo(arg0);
  }
  
  public java.lang.String getSaludoByName(java.lang.String arg0) throws java.rmi.RemoteException{
    if (saludos == null)
      _initSaludosProxy();
    return saludos.getSaludoByName(arg0);
  }
  
  
}