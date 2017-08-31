package org.seguros.saas.produto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.segurossaas.model.Produto;
import br.com.fiap.segurossaas.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	public Produto save(Produto produto) {
		return repository.save(produto);
	}
}
