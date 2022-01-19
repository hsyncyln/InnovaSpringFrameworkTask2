package com.huseyinceylan.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mysql implements IDatabase {
	
	@Override
	public String database(String data) {
		return data + "Mysql";
	}
	
}
