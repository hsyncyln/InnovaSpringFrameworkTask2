package com.huseyinceylan.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mssql implements IDatabase {
	
	@Override
	public String database(String data) {
		return data + "Mssql";
	}
	
}
