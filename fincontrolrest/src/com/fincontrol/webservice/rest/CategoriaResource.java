package com.fincontrol.webservice.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/categorias")
public class CategoriaResource {

	//@Path("{codCategoria}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String busca() {
		return "teste";
	}
}
