package com.fincontrol.webservice.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.ResponseWrapper;

import com.fincontrol.model.Categoria;
import com.fincontrol.model.ContaPagar;
import com.fincontrol.model.Fornecedor;

@WebService
public interface IFinControlWS {
	@WebMethod(operationName="Hello")
	public String hello();
	
	@WebMethod(operationName="CadastrarContaPagar")
	@WebResult(name="ContaPagar")
	//@ResponseWrapper(localName="Conta")
	public ContaPagar setContaPagar(@XmlElement(required=true) @WebParam(name="ContaPagar") ContaPagar conta);
	
	@WebMethod(operationName="GerarListagemDeContas")
	@WebResult(name="Conta")
	@ResponseWrapper(localName="Contas")
	public List<ContaPagar> getListagemContas(@XmlElement(required=true)
	                                          @WebParam(name="parametros") 
	                                          ParametroRelatorio parametros);
	@WebMethod(operationName="ListarCategorias")
	@WebResult(name="Categoria")
	@ResponseWrapper(localName="Categorias")
	public List<Categoria> getCategorias();
	
	@WebMethod(operationName="ListarFornecedores")
	@WebResult(name="Fornecedor")
	@ResponseWrapper(localName="Fornecedores")
	public List<Fornecedor> getFornecedores();

	@WebMethod(operationName="CadastrarDadosIniciais")
	public String cadastrarDadosIniciais();	
}
