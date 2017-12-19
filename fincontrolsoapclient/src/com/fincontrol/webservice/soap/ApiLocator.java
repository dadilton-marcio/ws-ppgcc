/**
 * ApiLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fincontrol.webservice.soap;

public class ApiLocator extends org.apache.axis.client.Service implements com.fincontrol.webservice.soap.Api {

    public ApiLocator() {
    }


    public ApiLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ApiLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FinControlWSPort
    private java.lang.String FinControlWSPort_address = "http://localhost:8080/fincontrolsoap/api";

    public java.lang.String getFinControlWSPortAddress() {
        return FinControlWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FinControlWSPortWSDDServiceName = "FinControlWSPort";

    public java.lang.String getFinControlWSPortWSDDServiceName() {
        return FinControlWSPortWSDDServiceName;
    }

    public void setFinControlWSPortWSDDServiceName(java.lang.String name) {
        FinControlWSPortWSDDServiceName = name;
    }

    public com.fincontrol.webservice.soap.IFinControlWS getFinControlWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FinControlWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFinControlWSPort(endpoint);
    }

    public com.fincontrol.webservice.soap.IFinControlWS getFinControlWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.fincontrol.webservice.soap.ApiSoapBindingStub _stub = new com.fincontrol.webservice.soap.ApiSoapBindingStub(portAddress, this);
            _stub.setPortName(getFinControlWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFinControlWSPortEndpointAddress(java.lang.String address) {
        FinControlWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.fincontrol.webservice.soap.IFinControlWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.fincontrol.webservice.soap.ApiSoapBindingStub _stub = new com.fincontrol.webservice.soap.ApiSoapBindingStub(new java.net.URL(FinControlWSPort_address), this);
                _stub.setPortName(getFinControlWSPortWSDDServiceName());
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
        if ("FinControlWSPort".equals(inputPortName)) {
            return getFinControlWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.webservice.fincontrol.com/", "api");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.webservice.fincontrol.com/", "FinControlWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FinControlWSPort".equals(portName)) {
            setFinControlWSPortEndpointAddress(address);
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
