package com.tony.sandbox.rest.gs;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.tony.sandbox.rest.gs.commons.UserService;

/**
 * Configure JAX-RS through an Application sub-class
 * @author tony
 *
 */
@ApplicationPath("rest")
public class ApplicationConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<>();
		classes.add(UserService.class);
		return classes;
	}
}
