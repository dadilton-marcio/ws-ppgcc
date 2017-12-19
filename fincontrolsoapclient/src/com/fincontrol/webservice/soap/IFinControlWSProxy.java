package com.fincontrol.webservice.soap;

public class IFinControlWSProxy implements com.fincontrol.webservice.soap.IFinControlWS {
  private String _endpoint = null;
  private com.fincontrol.webservice.soap.IFinControlWS iFinControlWS = null;
  
  public IFinControlWSProxy() {
    _initIFinControlWSProxy();
  }
  
  public IFinControlWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initIFinControlWSProxy();
  }
  
  private void _initIFinControlWSProxy() {
    try {
      iFinControlWS = (new com.fincontrol.webservice.soap.ApiLocator()).getFinControlWSPort();
      if (iFinControlWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iFinControlWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iFinControlWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iFinControlWS != null)
      ((javax.xml.rpc.Stub)iFinControlWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.fincontrol.webservice.soap.IFinControlWS getIFinControlWS() {
    if (iFinControlWS == null)
      _initIFinControlWSProxy();
    return iFinControlWS;
  }
  
  public com.fincontrol.webservice.soap.ContaPagar cadastrarContaPagar(com.fincontrol.webservice.soap.ContaPagar contaPagar) throws java.rmi.RemoteException{
    if (iFinControlWS == null)
      _initIFinControlWSProxy();
    return iFinControlWS.cadastrarContaPagar(contaPagar);
  }
  
  public com.fincontrol.webservice.soap.ContaPagar[] gerarListagemDeContas(com.fincontrol.webservice.soap.ParametroRelatorio parametros) throws java.rmi.RemoteException{
    if (iFinControlWS == null)
      _initIFinControlWSProxy();
    return iFinControlWS.gerarListagemDeContas(parametros);
  }
  
  public java.lang.String cadastrarDadosIniciais() throws java.rmi.RemoteException{
    if (iFinControlWS == null)
      _initIFinControlWSProxy();
    return iFinControlWS.cadastrarDadosIniciais();
  }
  
  public com.fincontrol.webservice.soap.Categoria[] listarCategorias() throws java.rmi.RemoteException{
    if (iFinControlWS == null)
      _initIFinControlWSProxy();
    return iFinControlWS.listarCategorias();
  }
  
  public com.fincontrol.webservice.soap.Fornecedor[] listarFornecedores() throws java.rmi.RemoteException{
    if (iFinControlWS == null)
      _initIFinControlWSProxy();
    return iFinControlWS.listarFornecedores();
  }
  
  public java.lang.String hello() throws java.rmi.RemoteException{
    if (iFinControlWS == null)
      _initIFinControlWSProxy();
    return iFinControlWS.hello();
  }
  
  
}