package com.exemplocompleto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemplocompleto.dao.FuncionarioDao;
import com.exemplocompleto.models.FuncionarioModel;

@Service
public class FuncionarioService implements IFuncionarioServ {

	@Autowired
	FuncionarioDao consult;
	
	@Override
	public List<FuncionarioModel> obterFuncionarios() {
	
		return consult.getFuncionarios();
	}

	@Override
	public FuncionarioModel obterFuncionarioId(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
