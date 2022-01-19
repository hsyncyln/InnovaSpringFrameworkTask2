package com.huseyinceylan.enumqualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "enumQualifierDatabase")
@ApplicationScoped
public class DatabaseManager implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	@QualifierSecimler(value = DatabaseEnum.POSTGRESQL)
	private IDatabase iDatabase;
	
	public String getiDatabase() {
		return iDatabase.database("Database : ");
	}
	
}
