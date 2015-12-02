package com.tony.sandbox.rest.gs;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("UserService")
public class UserService {
	@GET
	@Path("/name/{i}")
	@Produces(MediaType.TEXT_XML)
	public String userName(@PathParam("i") final String i) {
		final String name = i;
		return "<User>" + "<Name>" + name + "</Name>" + "</User>";
	}
}
