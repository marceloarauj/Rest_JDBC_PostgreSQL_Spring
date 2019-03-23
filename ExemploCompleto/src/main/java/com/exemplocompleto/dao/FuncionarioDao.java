package com.exemplocompleto.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.exemplocompleto.models.FuncionarioModel;

@Repository
public class FuncionarioDao implements QueryList {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	// retorna um único funcionario pelo código
	public FuncionarioModel getFuncionarioId(int codigo) {
		
		FuncionarioModel func = 
				jdbc.queryForObject
				  (QueryList.OBTER_POR_ID, 
						  new BeanPropertyRowMapper<FuncionarioModel>(FuncionarioModel.class),
						  codigo);
		
		return func;
	}
	
	// retorna uma lista de funcionarios
	public List<FuncionarioModel> getFuncionarios(){
		
		List<FuncionarioModel> funcionarios = 
				 jdbc.query(QueryList.OBTER_FUNCIONARIO, 
						 new BeanPropertyRowMapper(FuncionarioModel.class));
		
		return funcionarios;
		
	}
	
	
}
