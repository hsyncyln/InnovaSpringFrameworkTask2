package com.huseyinceylan.enumqualifier;

@QualifierSecimler(DatabaseEnum.POSTGRESQL)
public class Postgresql implements IDatabase {
	
	@Override
	public String database(String data) {
		return data + "Postgresql";
	}
	
}
