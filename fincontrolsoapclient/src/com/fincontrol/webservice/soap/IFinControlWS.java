/**
 * IFinControlWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fincontrol.webservice.soap;

public interface IFinControlWS extends java.rmi.Remote {
    public com.fincontrol.webservice.soap.ContaPagar cadastrarContaPagar(com.fincontrol.webservice.soap.ContaPagar contaPagar) throws java.rmi.RemoteException;
    public com.fincontrol.webservice.soap.ContaPagar[] gerarListagemDeContas(com.fincontrol.webservice.soap.ParametroRelatorio parametros) throws java.rmi.RemoteException;
    public java.lang.String cadastrarDadosIniciais() throws java.rmi.RemoteException;
    public com.fincontrol.webservice.soap.Categoria[] listarCategorias() throws java.rmi.RemoteException;
    public com.fincontrol.webservice.soap.Fornecedor[] listarFornecedores() throws java.rmi.RemoteException;
    public java.lang.String hello() throws java.rmi.RemoteException;
}
