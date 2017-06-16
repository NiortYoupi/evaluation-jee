package com.sopra.dao.hibernate;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.dao.IPropositionDAO;
import com.sopra.model.Proposition;

@Repository
@Transactional
public class PropositionHibernateDAO extends DAOHibernate<Proposition, Integer> implements IPropositionDAO{

}
