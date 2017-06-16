package com.sopra.dao.hibernate;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.dao.IPersonneDAO;
import com.sopra.exception.WrongUsernameOrPasswordException;
import com.sopra.model.Admin;
import com.sopra.model.Personne;

@Repository
@Transactional
public class PersonneHibernateDAO extends DAOHibernate<Personne, String> implements IPersonneDAO{

	public PersonneHibernateDAO() {
		this.maClasse = Personne.class;
		this.maClasseString = "Personne";
	}
	@Override
	public Admin auth(String username, String password) throws WrongUsernameOrPasswordException {
		try{
		return this.em.createQuery("from Admin a where a.username = :username AND a.password = :password", Admin.class)
				.setParameter("username", username)
				.setParameter("password", password)
				.getSingleResult();
		}
		
		catch (Exception e) {
			e.printStackTrace();
			throw new WrongUsernameOrPasswordException();
		}
	}

}
