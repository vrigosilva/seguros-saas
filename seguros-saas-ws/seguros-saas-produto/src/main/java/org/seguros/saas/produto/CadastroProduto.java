package org.seguros.saas.produto;

import org.seguros.saas.produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.segurossaas.model.Loja;
import br.com.fiap.segurossaas.model.Produto;
import br.com.fiap.segurossaas.model.RetornoVO;

@RestController
@SpringBootApplication
public class CadastroProduto {

	@Autowired
	private ProdutoService produtoService;

	public static void main(String[] args) {
		SpringApplication.run(CadastroProduto.class, args);
	}
	
	
	@RequestMapping(value="/add", 
			produces={MediaType.APPLICATION_JSON_VALUE,
					  MediaType.APPLICATION_XML_VALUE},
			consumes=MediaType.APPLICATION_JSON_VALUE,
			method=RequestMethod.POST)	
	public RetornoVO add(Produto produto){
		produto = produtoService.save(produto);
		
		RetornoVO retornoVO = new RetornoVO();
		if(produto.getId() != null){
			retornoVO.setCodRetorno(0);
			retornoVO.setRetorno("Produto " + produto.getNome() + "cadastrado com sucesso!");
			retornoVO.setSucesso(true);
			retornoVO.setUser(produto.getLoja().getUsuario());
		}else{
			retornoVO.setCodRetorno(1);
			retornoVO.setRetorno("Falha ao inserir produto");
			retornoVO.setSucesso(false);
			retornoVO.setUser(produto.getLoja().getUsuario());
		}
		return retornoVO;
	}

	@RequestMapping(value="/buscar", 
			produces={MediaType.APPLICATION_JSON_VALUE,
					  MediaType.APPLICATION_XML_VALUE},
			method=RequestMethod.GET)	
	public Produto buscar(String usuario, String senha){
		Produto p = new Produto();
		p.setLoja(new Loja());
		return p;
	}
	
}
