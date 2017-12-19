package com.fincontrol.webservice.soap;

import java.util.List;

import javax.jws.WebService;

import com.fincontrol.control.WSController;
import com.fincontrol.model.Categoria;
import com.fincontrol.model.ContaPagar;
import com.fincontrol.model.Fornecedor;

@WebService(endpointInterface="com.fincontrol.webservice.soap.IFinControlWS",serviceName="api")
public class FinControlWS implements IFinControlWS {
	WSController controle = new WSController();

	public String hello() {
		// TODO Auto-generated method stub
		return "Olah Mundo";
	}


	public ContaPagar setContaPagar(ContaPagar conta) {
		// TODO Auto-generated method stub
		return controle.cadastraContaPagar(conta);
	}

	public List<ContaPagar> getListagemContas(ParametroRelatorio parametros) {
		// TODO Auto-generated method stub
		return controle.getListagemContas(parametros);
	}


	@Override
	public List<Categoria> getCategorias() {
		// TODO Auto-generated method stub
		return controle.getCategorias();
	}


	@Override
	public List<Fornecedor> getFornecedores() {
		// TODO Auto-generated method stub
		return controle.getFornecedores();
	}


	@Override
	public String cadastrarDadosIniciais() {
		// TODO Auto-generated method stub
		return controle.cadastraDadosIniciais();
	}
	
	

}
