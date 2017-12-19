package com.fincontrol.webservice.soapclient;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import com.fincontrol.webservice.soap.Categoria;
import com.fincontrol.webservice.soap.ContaPagar;
import com.fincontrol.webservice.soap.Fornecedor;
import com.fincontrol.webservice.soap.IFinControlWS;
import com.fincontrol.webservice.soap.IFinControlWSProxy;

public class AppClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		// TODO Auto-generated method stub

	   IFinControlWS cliente = new IFinControlWSProxy();
	   
	   //usando o Ol� Mundo
	   System.out.println(cliente.hello());
	   
	   //listando as categorias
	   for(Categoria categoria: cliente.listarCategorias()) {
		   
		   System.out.println("Categoria - C�digo: " + categoria.getCodCategoria() + " Descri��o:" + categoria.getDescricao());
	   }
	   
	   //listando os fornecedores
	   for(Fornecedor fornecedor: cliente.listarFornecedores()) {
		   System.out.println("Fornecedor - C�digo: " + fornecedor.getCodFornecedor() + " Descri��o:" + fornecedor.getDescricao());
	   }
	   
	   
	   //Cadastrando Contas a Pagar
	   ContaPagar conta = new ContaPagar();
	   conta.setCodCategoria("df74fd36-3321-42b2-8502-a644a609845c");//Festa
	   conta.setCodFornecedor("275d7e29-aba6-4957-ad47-2d1cf09e0ccf");//Bar do Nelson
	   conta.setValor(250.50);
	   conta.setDescricao("Anivers�rio do M�rcio");
	   conta.setDataVencimento("31/01/2018");
	   
	   ContaPagar contaCadastrada = cliente.cadastrarContaPagar(conta);
	   
	   System.out.println("C�digo da Conta: " + contaCadastrada.getCodContaPagar());
	   System.out.println("C�digo da Categoria: " + contaCadastrada.getCodCategoria());
	   System.out.println("C�digo do Fornecedor: " + contaCadastrada.getCodCategoria());
	   
	   
	}

}
