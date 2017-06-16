package com.sopra.dao.hibernate;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.model.Reponse;

@Repository
@Transactional
public class ReponseHibernateDAO extends DAOHibernate<Reponse, Integer> {

}
