package com.telefonica.pontointeligente.api.services;

import java.util.Optional;

import com.telefonica.pontointeligente.api.entities.Funcionario;


public interface FuncionarioService {
	
	/**
	 * Persiste um funcionario na base de dados
	 * 
	 * @param funcionario
	 * @return Funcionario
	 */
	Funcionario persistir(Funcionario funcionario);

	/**
	 * Busca e retorna um funcionario dado um CPF.
	 * 
	 * @param cpf
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Busca e retorna um funcionario dado um Email.
	 * 
	 * @param email
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorEmail(String email);
	
	/**
	 * Busca e retorna um funcionario dado um ID.
	 * 
	 * @param id
	 * @return Optional<Funcionario>
	 * @throws NotFoundException 
	 */
	Optional<Funcionario> buscarPorId(Long id);
}
