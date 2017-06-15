package com.sopra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reponse")
public class Reponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="REP_ID")
	private Integer idReponse;
	
	/**
	 * @return the test
	 */
	public Test getTest() {
		return test;
	}

	/**
	 * @param test the test to set
	 */
	public void setTest(Test test) {
		this.test = test;
	}

	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}

	@Column(name="REP_TEMPSDEREPONSE")
	private Integer tempsDeReponse;
	
	@Column(name="REP_REPONSE")
	private String reponse;
	
	@ManyToOne
	@JoinColumn(name="REP_TEST_ID")
	private Test test;
	
	@ManyToOne
	@JoinColumn(name="REP_QUESTION_ID")
	private Question question;

	/**
	 * 
	 */
	public Reponse() {
	}

	/**
	 * @return the tempsDeReponse
	 */
	public Integer getTempsDeReponse() {
		return tempsDeReponse;
	}

	/**
	 * @param tempsDeReponse the tempsDeReponse to set
	 */
	public void setTempsDeReponse(Integer tempsDeReponse) {
		this.tempsDeReponse = tempsDeReponse;
	}

	/**
	 * @return the reponse
	 */
	public String getReponse() {
		return reponse;
	}

	/**
	 * @param reponse the reponse to set
	 */
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	/**
	 * @return the idReponse
	 */
	public Integer getIdReponse() {
		return idReponse;
	}
	
	
}
