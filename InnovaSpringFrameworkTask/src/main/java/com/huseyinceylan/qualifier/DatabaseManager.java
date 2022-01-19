package com.huseyinceylan.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierDatabase")
@ApplicationScoped
public class DatabaseManager implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDatabase iDatabase;
	
	public String getiDatabase() {
		return iDatabase.database("Database : ");
	}
	
}
