package com.sopra.dao;

import java.util.List;

import com.sopra.exception.WrongUsernameOrPasswordException;
import com.sopra.model.Admin;
import com.sopra.model.Candidat;
import com.sopra.model.Personne;

public interface IPersonneDAO extends IDAO<Personne, String> {
	public Admin auth(String username, String password) throws WrongUsernameOrPasswordException;
	public List<Candidat> findAllCandidats();
}