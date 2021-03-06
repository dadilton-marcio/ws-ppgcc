package com.fincontrol.model;

import java.util.UUID;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;


@DynamoDBTable(tableName="Fornecedor")
public class Fornecedor {
	
	private UUID codFornecedor;
	private String descricao;
	
	@DynamoDBHashKey(attributeName="codFornecedor")
	@DynamoDBAutoGeneratedKey
	public UUID getCodFornecedor() {
		return codFornecedor;
	}
	public void setCodFornecedor(UUID codFornecedor) {
		this.codFornecedor = codFornecedor;
	}
	@DynamoDBAttribute(attributeName="descricao")
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Fornecedor: {codFornecedor:'" + codFornecedor + "', descricao:'" + descricao + "'}";
	}
}
