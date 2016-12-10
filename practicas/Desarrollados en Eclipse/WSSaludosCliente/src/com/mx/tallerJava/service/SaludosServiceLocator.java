/**
 * SaludosServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mx.tallerJava.service;

public class SaludosServiceLocator extends org.apache.axis.client.Service implements com.mx.tallerJava.service.SaludosService {

    public SaludosServiceLocator() {
    }


    public SaludosServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SaludosServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SaludosPort
    private java.lang.String SaludosPort_address = "http://localhost:8080/WSSaludos/SaludosService";

    public java.lang.String getSaludosPortAddress() {
        return SaludosPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SaludosPortWSDDServiceName = "SaludosPort";

    public java.lang.String getSaludosPortWSDDServiceName() {
        return SaludosPortWSDDServiceName;
    }

    public void setSaludosPortWSDDServiceName(java.lang.String name) {
        SaludosPortWSDDServiceName = name;
    }

    public com.mx.tallerJava.service.Saludos getSaludosPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SaludosPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSaludosPort(endpoint);
    }

    public com.mx.tallerJava.service.Saludos getSaludosPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.mx.tallerJava.service.SaludosPortBindingStub _stub = new com.mx.tallerJava.service.SaludosPortBindingStub(portAddress, this);
            _stub.setPortName(getSaludosPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSaludosPortEndpointAddress(java.lang.String address) {
        SaludosPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.mx.tallerJava.service.Saludos.class.isAssignableFrom(serviceEndpointInterface)) {
                com.mx.tallerJava.service.SaludosPortBindingStub _stub = new com.mx.tallerJava.service.SaludosPortBindingStub(new java.net.URL(SaludosPort_address), this);
                _stub.setPortName(getSaludosPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SaludosPort".equals(inputPortName)) {
            return getSaludosPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.tallerJava.mx.com/", "SaludosService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.tallerJava.mx.com/", "SaludosPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SaludosPort".equals(portName)) {
            setSaludosPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
