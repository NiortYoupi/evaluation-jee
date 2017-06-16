package com.sopra.dao.hibernate;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.dao.ITestDAO;
import com.sopra.model.Test;

@Repository
@Transactional
public class TestHibernateDAO extends DAOHibernate<Test, Integer> implements ITestDAO{
public TestHibernateDAO() {
	this.maClasse = Test.class;
	this.maClasseString = "Test";
}
}
