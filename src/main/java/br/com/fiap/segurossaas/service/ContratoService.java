package br.com.fiap.segurossaas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.segurossaas.model.Contrato;
import br.com.fiap.segurossaas.model.Loja;
import br.com.fiap.segurossaas.repository.ContratoRepository;

@Service
public class ContratoService {
	
	@Autowired
	private ContratoRepository repository;
	
	public Iterable<Contrato> obterTodos(Loja loja){
		Iterable<Contrato> convidados = repository.findByLoja(loja);
		return convidados;
	}
}
