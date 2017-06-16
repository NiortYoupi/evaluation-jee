package com.sopra.dao.hibernate;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.dao.IQuestionDAO;
import com.sopra.model.Question;

@Repository
@Transactional
public class QuestionHibernateDAO extends DAOHibernate<Question, Integer> implements IQuestionDAO{

}
