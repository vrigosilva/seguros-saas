package br.com.fiap.segurossaas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="segurado")
public class Segurado {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private String cpf;
	
	public Segurado(){
		
	}
}
