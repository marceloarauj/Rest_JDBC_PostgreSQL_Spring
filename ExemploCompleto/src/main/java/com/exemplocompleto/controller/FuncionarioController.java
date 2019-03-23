package com.exemplocompleto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplocompleto.models.FuncionarioModel;
import com.exemplocompleto.service.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@Autowired
	FuncionarioService servicoFunc;
	
	@GetMapping(value ="/ap",produces = "application/json")
	public List<FuncionarioModel> obterFuncionarios(){
		return servicoFunc.obterFuncionarios();
	}
}
