package br.com.fiap.segurossaas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name="contrato")
@Getter
@Setter
public class Contrato {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String numero;
	
	private String formaPagamento;

	private Segurado segurado;
	
	private Loja loja;

	private Produto produto;
	
	public Contrato(){
	}
}
