package com.exemplocompleto.dao;

public interface QueryList {

	public static String OBTER_FUNCIONARIO = "SELECT * FROM FUNCIONARIO ";
	public static String OBTER_POR_ID = "SELECT * FROM FUNCIONARIO WHERE codigo=:codigo";
	
}
