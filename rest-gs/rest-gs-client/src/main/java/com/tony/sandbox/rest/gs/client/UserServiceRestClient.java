package com.tony.sandbox.rest.gs.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class UserServiceRestClient {

	public static void main(final String[] args) {
		final Client client = ClientBuilder.newClient();
		final WebTarget webTarget = client.target(URI.create("http://localhost:8080/rest-gs-server-servlet3-withwebxml/rest/UserService")).path("json").path("0");
		System.out.println("Target URI : " + webTarget.getUri());
		final Response response = webTarget.request().accept(MediaType.APPLICATION_JSON).get();
		System.out.println("Response status : " + response.getStatus());
		System.out.println("Response header : " + response.getHeaders());
		// System.out.println("Payload : " + response.readEntity(String.class));
		System.out.println("Payload : " + response.readEntity(User.class));
	}
}
