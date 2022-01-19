package com.huseyinceylan.qualifier;

@QualifierSecimler
public class Postgresql implements IDatabase {
	
	@Override
	public String database(String data) {
		return data + "Postgresql";
	}
	
}
