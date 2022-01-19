package com.huseyinceylan.enumqualifier;

@QualifierSecimler(DatabaseEnum.MYSQL)
public class Mysql implements IDatabase {
	
	@Override
	public String database(String data) {
		return data + "Mysql";
	}
	
}
