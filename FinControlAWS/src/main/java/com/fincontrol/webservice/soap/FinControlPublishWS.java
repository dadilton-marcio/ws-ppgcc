package com.fincontrol.webservice.soap;

import java.util.UUID;

import javax.xml.ws.Endpoint;

import com.fincontrol.db.DBControl;
import com.fincontrol.model.Categoria;
import com.fincontrol.model.ContaPagar;
import com.fincontrol.model.Fornecedor;
import com.fincontrol.model.SituacaoConta;

public class FinControlPublishWS {
public static void main(String[] args) {
	IFinControlWS webservice = new FinControlWS();
	String url = "http://localhost:8080/fincontrolws";
	
	DBControl banco = new DBControl();

	/*
	Fornecedor fornecedor = new Fornecedor();
	fornecedor.setDescricao("Bar do Nelson");
	banco.getMapper().save(fornecedor);
	System.out.println("Fornecedor cadastrado: " + fornecedor);	
	
	//Categoria categoria = new Categoria();
	//categoria.setDescricao("Festa");
	//banco.getMapper().save(categoria);
	//System.out.println("Categoria Cadastrada: " + categoria);
	
	Categoria categoria = banco.DBMapper.load(Categoria.class,UUID.fromString("191361e1-dad9-4b2e-8651-0e712804f21b"));
	
	ContaPagar conta = new ContaPagar();
	conta.setCategoria(categoria);
	conta.setFornecedor(fornecedor);
	conta.setSituacao(SituacaoConta.PENDENTE);
	conta.setDescricao("Compra de uma grade de cerveja, no bar do Nelson");
	conta.setValor(65.00);
	banco.getMapper().save(conta);
	System.out.println("Conta  cadastrada: " + conta);
	*/

	System.out.println("FinControlWS rodando... ");
	Endpoint.publish(url, webservice);
}
}
