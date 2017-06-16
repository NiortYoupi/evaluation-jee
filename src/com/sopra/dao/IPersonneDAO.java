package com.sopra.dao;

import com.sopra.exception.WrongUsernameOrPasswordException;
import com.sopra.model.Admin;
import com.sopra.model.Personne;

public interface IPersonneDAO extends IDAO<Personne, String> {
	public Admin auth(String username, String password) throws WrongUsernameOrPasswordException;
}
