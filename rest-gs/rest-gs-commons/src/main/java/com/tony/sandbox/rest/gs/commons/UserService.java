package com.tony.sandbox.rest.gs.commons;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("UserService")
public class UserService {

	private static final List<User> users = new ArrayList<>();
	static {
		users.add(new User("john", 30));
		users.add(new User("fred", 20));
		users.add(new User("Elton", 40));
	}

	@GET
	@Path("/xml/{i}")
	@Produces(MediaType.TEXT_XML)
	public Response nameAsXml(@DefaultValue("0") @PathParam("i") final int i) {
		System.out.println("name-as-xml");
		return Response.ok(users.get(i), MediaType.TEXT_XML).build();
	}

	@GET
	@Path("/json/{i}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response nameAsJson(@DefaultValue("0") @PathParam("i") final int i) {
		System.out.println("name-as-xml");
		return Response.ok(users.get(i), MediaType.APPLICATION_JSON).build();
	}
}
