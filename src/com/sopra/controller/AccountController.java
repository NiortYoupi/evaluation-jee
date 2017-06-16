package com.sopra.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sopra.dao.IPersonneDAO;
import com.sopra.exception.WrongUsernameOrPasswordException;
import com.sopra.model.Admin;
import com.sopra.model.constantes.ConstanteServlet;

@Controller
public class AccountController {
	
	@Autowired
	private IPersonneDAO personneDAO;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute("admin") Admin admin, BindingResult result, Model model, HttpSession session) {
		if ((!result.hasErrors()) || (result.getErrorCount() == 2)) {
			try {
				admin = this.personneDAO.auth(admin.getUsername(), admin.getPassword());
				
				if (admin != null) {
					session.setAttribute(ConstanteServlet.user, admin);
					session.setAttribute(ConstanteServlet.username, admin.getUsername());
					return "redirect:/home";
				}
			}
			
			catch (WrongUsernameOrPasswordException ex) {
				result.rejectValue("password", ex.getCode(), ex.getMessage());
			}
		}
		
		return "login";
	}
	
	@ModelAttribute("admin")
	public Admin initPersonne() {
		return new Admin();
	}
}
