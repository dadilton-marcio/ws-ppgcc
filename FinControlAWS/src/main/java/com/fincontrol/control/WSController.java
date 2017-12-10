package com.fincontrol.control;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.fincontrol.db.DBControl;
import com.fincontrol.model.ContaPagar;
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
}
