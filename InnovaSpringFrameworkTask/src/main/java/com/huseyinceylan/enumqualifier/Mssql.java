package com.huseyinceylan.enumqualifier;

import javax.enterprise.inject.Default;

@Default
public class Mssql implements IDatabase {
	
	@Override
	public String database(String data) {
		return data + "Mssql (Default)";
	}
	
}
