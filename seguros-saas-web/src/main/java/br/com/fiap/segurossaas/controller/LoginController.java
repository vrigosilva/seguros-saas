package br.com.fiap.segurossaas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fiap.segurossaas.model.Contrato;
import br.com.fiap.segurossaas.model.Loja;
import br.com.fiap.segurossaas.service.ContratoService;
import br.com.fiap.segurossaas.service.LojaService;

@Controller
public class LoginController {
	
	@Autowired
	private LojaService lojaService;
	
	@Autowired
	private ContratoService contratoService;
	
	@RequestMapping("/")
	public String index(){
		return "login";
	}
	
	@RequestMapping("logar")
	public String logar(@RequestParam("usuario") String usuario, @RequestParam("senha") String senha, Model model ){
		Loja loja = lojaService.buscaLoja(usuario, senha);
		if(loja != null){
			Iterable<Contrato> contratos = contratoService.obterTodos(loja);
			model.addAttribute("loja", contratos);
			return "home";
		}
		else
			return "login";
	}
}
