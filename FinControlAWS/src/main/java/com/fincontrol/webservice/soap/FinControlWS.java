package com.fincontrol.webservice.soap;

import java.util.List;

import javax.jws.WebService;

import com.fincontrol.control.WSController;
import com.fincontrol.model.ContaPagar;

@WebService(endpointInterface="com.fincontrol.webservice.soap.IFinControlWS")
public class FinControlWS implements IFinControlWS {
	WSController controle = new WSController();

	public String hello() {
		// TODO Auto-generated method stub
		return "Olah Mundo";
	}

	@Override
	public ContaPagar setContaPagar(ContaPagar conta) {
		// TODO Auto-generated method stub
		return controle.cadastraContaPagar(conta);
	}

	@Override
	public List<ContaPagar> getListagemContas(ParametroRelatorio parametros) {
		// TODO Auto-generated method stub
		return controle.getListagemContas(parametros);
	}

}
