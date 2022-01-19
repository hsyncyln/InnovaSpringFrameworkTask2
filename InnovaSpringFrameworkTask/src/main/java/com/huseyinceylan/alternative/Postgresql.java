package com.huseyinceylan.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Postgresql implements IDatabase {
	
	@Override
	public String database(String data) {
		return data + "Postgresql";
	}
	
}
