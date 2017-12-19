package com.fincontrol.model;

public enum SituacaoConta {
	PENDENTE,
	PAGA,
	CANCELADA;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name();
	}

}
