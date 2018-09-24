package com.telefonica.pontointeligente.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telefonica.pontointeligente.api.entities.Funcionario;
import com.telefonica.pontointeligente.api.repositories.FuncionarioRepository;
import com.telefonica.pontointeligente.api.services.FuncionarioService;

import javassist.NotFoundException;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {
	
	private static final Logger log =  LoggerFactory.getLogger(Funcionario.class);
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public Funcionario persistir(Funcionario funcionario) {
		log.info("Buscando uma empresa para o funcionario {}", funcionario);
		return this.funcionarioRepository.save(funcionario);
	}

	@Override
	public Optional<Funcionario> buscarPorCpf(String cpf) {
		log.info("Persistindo CPF: {}", cpf);
		return Optional.ofNullable(this.funcionarioRepository.findByCpf(cpf));
	}

	@Override
	public Optional<Funcionario> buscarPorEmail(String email) {
		log.info("Persistindo Email: {}", email);
		return Optional.ofNullable(this.funcionarioRepository.findByEmail(email));
	}
	
	@Override
	public Optional<Funcionario> buscarPorId(Long id) throws NotFoundException {
		log.info("Persistindo ID: {}", id);
		Optional<Funcionario> fn = this.funcionarioRepository.findById(id);	
				
		return fn;
	}



}