package com.sopra.dao.hibernate;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.dao.IPersonneDAO;
import com.sopra.model.Personne;

@Repository
@Transactional
public class PersonneHibernateDAO extends DAOHibernate<Personne, String> implements IPersonneDAO{

}
