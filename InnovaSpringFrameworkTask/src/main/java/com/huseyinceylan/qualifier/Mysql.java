package com.huseyinceylan.qualifier;

@QualifierSecimler
public class Mysql implements IDatabase {
	
	@Override
	public String database(String data) {
		return data + "Mysql";
	}
	
}
