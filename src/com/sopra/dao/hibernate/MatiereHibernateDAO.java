package com.sopra.dao.hibernate;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.dao.IMatiereDAO;
import com.sopra.model.Matiere;

@Repository
@Transactional
public class MatiereHibernateDAO extends DAOHibernate<Matiere, Integer> implements IMatiereDAO {


}
