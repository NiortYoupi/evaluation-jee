package com.sopra.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sopra.dao.IPersonneDAO;
import com.sopra.model.Candidat;

@Controller
@RequestMapping("/candidats")
public class CandidatController {

	@Autowired
	private IPersonneDAO personneDAO;
	
	@RequestMapping("")
	public String getAll(Model model) {
		model.addAttribute("candidats", this.personneDAO.findAllCandidats());
		
		return "candidats";
	}
	
	@RequestMapping(value={ "/edit", "/edit/{id}" }, method=RequestMethod.GET)
	public String edit(@PathVariable(value="id", required=false) String candidatId, Model model) {
		if (candidatId != null) {
			model.addAttribute("candidat", this.personneDAO.find(candidatId));
		}
		
		return (candidatId != null) ? "editCandidat" : "addCandidat";
	}
	
	
	@RequestMapping(value={ "/edit", "/edit/{id}" }, method=RequestMethod.POST)
	public String edit(@PathVariable(value="id", required=false) String candidatId, @Valid @ModelAttribute("candidat") Candidat candidat, BindingResult result) {
		candidat = (Candidat) this.personneDAO.save(candidat);
		return "redirect:/candidats";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") String candidatId) {
		this.personneDAO.delete(this.personneDAO.find(candidatId));
		return "redirect:/candidats";
	}
}
