package br.com.fiap.segurossaas.repository;

 import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.segurossaas.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
	
}
