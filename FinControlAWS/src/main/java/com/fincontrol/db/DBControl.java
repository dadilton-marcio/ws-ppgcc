package com.fincontrol.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeTableRequest;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.TableDescription;
import com.amazonaws.services.dynamodbv2.util.TableUtils;
import com.amazonaws.services.dynamodbv2.util.TableUtils.TableNeverTransitionedToStateException;
import com.fincontrol.model.Categoria;
import com.fincontrol.model.ContaPagar;
import com.fincontrol.model.Fornecedor;

public class DBControl {
	public static AmazonDynamoDB dynamoDBClient; //representação do client do Amazon Dynamo DB
	public DynamoDBMapper DBMapper; //representação do mapeador de objetos do banco
	
	//abaixo, o DynamoDBMapperConfig será criado para trazer os dados que forem atualizados da base de dados 
	public DynamoDBMapperConfig DBConfig;//representação do configurador do mapeador de objetos
	
	public DBControl() {
		this.iniciarBanco();
		
	}
	
	@SuppressWarnings("deprecation")
	public void iniciarBanco() {
		//iniciando as credenciais
        ProfileCredentialsProvider credentialsProvider = new ProfileCredentialsProvider();
        
        try {
            credentialsProvider.getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (C:\\Users\\Dadilton\\.aws\\credentials), and is in valid format.",
                    e);
        }
        
        /*dynamoDB = AmazonDynamoDBClientBuilder.standard()
            .withCredentials(credentialsProvider)
            .withRegion("us-west-2")
            .build();*/
        
        if (dynamoDBClient == null)
        	dynamoDBClient = AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "us-west-2")).build();
        
        DBMapper = new DynamoDBMapper(dynamoDBClient);
        DBConfig = new DynamoDBMapperConfig(DynamoDBMapperConfig.ConsistentReads.CONSISTENT);
        
        try {
        	ListTablesResult listTablesResult = dynamoDBClient.listTables();
        	if (!listTablesResult.getTableNames().contains(Fornecedor.class.getSimpleName()))
			criarTabela(Fornecedor.class);
        	if (!listTablesResult.getTableNames().contains(ContaPagar.class.getSimpleName()))
			criarTabela(ContaPagar.class);
        	if (!listTablesResult.getTableNames().contains(Categoria.class.getSimpleName()))
			criarTabela(Categoria.class);
			popularCategorias();
			
		} catch (TableNeverTransitionedToStateException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@SuppressWarnings("rawtypes")
	public void criarTabela(Class classe) throws TableNeverTransitionedToStateException, InterruptedException {
		 CreateTableRequest tableRequest = this.DBMapper.generateCreateTableRequest(classe);
		 tableRequest.setProvisionedThroughput(new ProvisionedThroughput(5L,5L));
		 TableUtils.createTableIfNotExists(DBControl.dynamoDBClient, tableRequest);
		 TableUtils.waitUntilActive(DBControl.dynamoDBClient, classe.getSimpleName());
		 
		 DescribeTableRequest describeTableRequest = new DescribeTableRequest(classe.getSimpleName());
		 TableDescription tableDescription = DBControl.dynamoDBClient.describeTable(describeTableRequest).getTable();
		 
		 System.out.println("Descrição da tabela: " + tableDescription);
	}
	
	public DynamoDBMapper getMapper() {
		return this.DBMapper;
	}
	
	public void popularCategorias() {

		Map<String, AttributeValue> params = new HashMap<String, AttributeValue>();
		params.put(":descricao", new AttributeValue().withS("Festa"));
		DynamoDBScanExpression scanExpression = new DynamoDBScanExpression().withFilterExpression(" descricao = :descricao").withExpressionAttributeValues(params);
		List<Categoria> categorias = this.DBMapper.scan(Categoria.class, scanExpression);
		if(categorias.size() == 0) {
			System.out.println("Categoria Festa não encontrada.");
			Categoria categoria = new Categoria();
			categoria.setDescricao("Festa");
			this.DBMapper.save(categoria);
			System.out.println("categoria cadastrada: " + categoria);
		}
		
		params = new HashMap<String, AttributeValue>();
        params.put(":descricao", new AttributeValue().withS("Despesa Comum"));
		scanExpression = new DynamoDBScanExpression().withFilterExpression(" descricao = :descricao").withExpressionAttributeValues(params);
		categorias = this.DBMapper.scan(Categoria.class, scanExpression);
		if(categorias.size() == 0) {
			System.out.println("Categoria Despesa Comum não encontrada");
			Categoria categoria = new Categoria();
			categoria.setDescricao("Despesa Comum");
			this.DBMapper.save(categoria);
			System.out.println("categoria cadastrada: " + categoria);
		}
		
	}
}

