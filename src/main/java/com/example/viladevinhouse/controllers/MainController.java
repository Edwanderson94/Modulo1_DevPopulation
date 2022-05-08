package com.example.viladevinhouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	// abrir pagina home
	@GetMapping({"/", "/home"})
	public String home() {
		return "home";
	}	
	
	// abrir pagina login
	@GetMapping("/login")
	public String login() {
		return "login";
	}	
	
	// login invalido
	@GetMapping("/login-error")
	public String loginError(ModelMap model) {
		model.addAttribute("alerta", "erro");
		model.addAttribute("Titulo", "Credenciais Invalidas");
		model.addAttribute("texto", "Login ou senha incorretos, tente novamente");
		model.addAttribute("subtexto", "Acesso permitivo somente para cadastros ativados");
		return "login-error";
	}	
}
