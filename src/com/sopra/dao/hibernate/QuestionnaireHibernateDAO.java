package com.sopra.dao.hibernate;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.dao.IQuestionnaireDAO;
import com.sopra.model.Questionnaire;

@Repository
@Transactional
public class QuestionnaireHibernateDAO extends DAOHibernate<Questionnaire, Integer> implements IQuestionnaireDAO{

}
