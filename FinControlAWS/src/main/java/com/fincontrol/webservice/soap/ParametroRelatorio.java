package com.fincontrol.webservice.soap;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fincontrol.model.DateAdapter;

@XmlRootElement
public class ParametroRelatorio {
	private Date dataInicial;
	private Date dataFinal;
	
	@XmlJavaTypeAdapter(DateAdapter.class)
	@XmlElement(required=true)
	public Date getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	
	@XmlJavaTypeAdapter(DateAdapter.class)
	@XmlElement(required=true)
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	
}
