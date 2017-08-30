package br.com.fiap.segurossaas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="produto")
public class Produto {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private double preco;
	
	private String descricao;
	
	private Loja loja;
	
	public Produto(){
		
	}
}
