package com.exemplocompleto.service;

import java.util.List;

import com.exemplocompleto.models.FuncionarioModel;

public interface IFuncionarioServ {
	
	List<FuncionarioModel> obterFuncionarios();
	FuncionarioModel obterFuncionarioId(int codigo);
	
}
