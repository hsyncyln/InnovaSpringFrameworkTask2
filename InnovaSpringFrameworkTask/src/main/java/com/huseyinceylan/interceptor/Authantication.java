package com.huseyinceylan.interceptor;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "interceptorAuthantication")
@ApplicationScoped
public class Authantication implements Serializable {
	private static final long serialVersionUID = 143165323L;
	
	@Inject
	private Authanticate authanticate;
	
	public String getAuthanticatedMaessage() {
		return authanticate.isAuthanticate("MSSQL");
	}
	
}
