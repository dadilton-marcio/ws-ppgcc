package com.fincontrol.control;

import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.fincontrol.db.DBControl;
import com.fincontrol.model.Categoria;
import com.fincontrol.model.ContaPagar;
import com.fincontrol.model.Fornecedor;
import com.fincontrol.webservice.soap.ParametroRelatorio;

public class WSController {
	
	 DBControl banco = new DBControl();
	 
     public ContaPagar cadastraContaPagar(ContaPagar conta) {

    	 if (conta.getCodContaPagar() != null) {
    		 
    		 ContaPagar contaBD = banco.DBMapper.load(ContaPagar.class, conta.getCodContaPagar());
    		 contaBD.setCodCategoria(conta.getCodCategoria());
    		 contaBD.setCodFornecedor(conta.getCodFornecedor());
    		 contaBD.setDataVencimento(conta.getDataVencimento());
    		 contaBD.setDescricao(conta.getDescricao());
    		 contaBD.setSituacao(conta.getSituacao());
    		 contaBD.setValor(conta.getValor());
    		 
    		 conta = contaBD;
    	 }
    	 
    	 banco.DBMapper.save(conta);
    	 return conta; 
     }
     
     public List<ContaPagar> getListagemContas(ParametroRelatorio params){
    	 
    	Map<String, AttributeValue> pars = new HashMap<String, AttributeValue>();
    	
    	SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        dateFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String dataInicial = dateFormatter.format(params.getDataInicial());
        String dataFinal = dateFormatter.format(params.getDataFinal());    	
    	
 		pars.put(":dataInicial", new AttributeValue().withS(dataInicial));
 		pars.put(":dataFinal", new AttributeValue().withS(dataFinal));
 		DynamoDBScanExpression scanExpression = new DynamoDBScanExpression().withFilterExpression("dataVencimento between :dataInicial and :dataFinal ").withExpressionAttributeValues(pars);
 		List<ContaPagar> contas = this.banco.DBMapper.scan(ContaPagar.class, scanExpression);
 		System.out.println(contas.size() + "contas: " + contas);
 		return contas; 
     }
     
     public List<Categoria> getCategorias(){
    	 DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
    	 List<Categoria> categorias = this.banco.DBMapper.scan(Categoria.class, scanExpression);
    	 return categorias;
     }
     
     public List<Fornecedor> getFornecedores(){
    	 DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
    	 List<Fornecedor> fornecedores = this.banco.DBMapper.scan(Fornecedor.class, scanExpression);
    	 return fornecedores;
     }
     
     //para ser usado no REST
     /*
     public String getContaPagar(UUID codContaPagar) {
    	 ContaPagar contaBD = banco.DBMapper.load(ContaPagar.class, codContaPagar);
    	 ByteArrayOutputStream output = new ByteArrayOutputStream();
    	 
    	 try {
			JAXBContext.newInstance(ContaPagar.class).createMarshaller().marshal(contaBD,output);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	 return output.toString();
     }
     */
     
     public String cadastraDadosIniciais() {
    	 
    		Fornecedor fornecedor1 = new Fornecedor();
    		fornecedor1.setDescricao("Bar do Nelson");
    		banco.getMapper().save(fornecedor1);
    		System.out.println("Fornecedor cadastrado: " + fornecedor1);
    		
    		Fornecedor fornecedor2 = new Fornecedor();
    		fornecedor2.setDescricao("Cantina da Esquina");
    		banco.getMapper().save(fornecedor2);
    		System.out.println("Fornecedor cadastrado: " + fornecedor2);
    		
    		
    		Categoria categoria1 = new Categoria();
    		categoria1.setDescricao("Farra");
    		banco.getMapper().save(categoria1);
    		System.out.println("Categoria Cadastrada: " + categoria1);
    		
    		Categoria categoria2 = new Categoria();
    		categoria2.setDescricao("Festa");
    		banco.getMapper().save(categoria2);
    		System.out.println("Categoria Cadastrada: " + categoria2);

    		
    		return "Cadastro Realizado.";

     }
}
