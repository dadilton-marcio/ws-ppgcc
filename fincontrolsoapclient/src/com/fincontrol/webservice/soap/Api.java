/**
 * Api.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fincontrol.webservice.soap;

public interface Api extends javax.xml.rpc.Service {
    public java.lang.String getFinControlWSPortAddress();

    public com.fincontrol.webservice.soap.IFinControlWS getFinControlWSPort() throws javax.xml.rpc.ServiceException;

    public com.fincontrol.webservice.soap.IFinControlWS getFinControlWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
