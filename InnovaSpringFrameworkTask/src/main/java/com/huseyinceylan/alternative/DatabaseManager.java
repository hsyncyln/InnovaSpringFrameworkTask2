package com.huseyinceylan.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeDatabase")
@ApplicationScoped
public class DatabaseManager {
	
	@Inject
	private IDatabase iDatabase;
	
	public String getiDatabase() {
		return iDatabase.database("Database : ");
	}
	
}
