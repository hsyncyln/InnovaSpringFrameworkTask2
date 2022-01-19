package com.huseyinceylan.sterotype;

@DatabaseMultipleAnnotation
public class DatabaseBean {
	
	private String dbName = "Mssql";
	
	public String getDbName() {
		return dbName;
	}
	
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	
}
