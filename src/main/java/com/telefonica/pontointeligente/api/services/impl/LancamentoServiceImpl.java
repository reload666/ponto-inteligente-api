package com.telefonica.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.telefonica.pontointeligente.api.entities.Lancamento;
import com.telefonica.pontointeligente.api.repositories.LancamentoRepository;
import com.telefonica.pontointeligente.api.services.LancamentoService;

@Service
public class LancamentoServiceImpl implements LancamentoService {
	private static final Logger log =  LoggerFactory.getLogger(Lancamento.class);
	
	@Autowired
	private LancamentoRepository LancamentoRepository;

	@Override
	public Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest) {
		log.info("Buscando lançamentos para o funcionario ID {}", funcionarioId);
		return this.LancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest);
	}

	@Override
	public Optional<Lancamento> buscarPorId(Long id) {
		log.info("Buscando um lançamento pelo ID {}", id);
		Optional<Lancamento> lancamento = this.LancamentoRepository.findById(id);
		return lancamento;
	}

	@Override
	public Lancamento persistir(Lancamento lancamento) {
		log.info("Persistindo o lançamento: {}", lancamento);
		return this.LancamentoRepository.save(lancamento);
	}

	@Override
	public void remover(Long id) {
		log.info("Removendo o lançamento ID {}", id);
		this.LancamentoRepository.deleteById(id);
		
	}

	
}
