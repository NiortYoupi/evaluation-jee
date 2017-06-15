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
@Table(name = "proposition")
public class Proposition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRO_ID")
	private Integer idProposition;

	@Column(name = "PRO_ISCORRECT")
	private Boolean isCorrect;

	@Column(name = "PRO_NUMERO")
	private Character numero;
	
	@ManyToOne
	@JoinColumn(name="PRO_QUESTION_ID")
	private Question question;

	/**
	 * @return the correct
	 */
	public Boolean isCorrect() {
		return isCorrect;
	}


	/**
	 * @param correct the correct to set
	 */
	public void setIsCorrect(Boolean correct) {
		this.isCorrect = correct;
	}

	/**
	 * @return the numero
	 */
	public Character getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Character numero) {
		this.numero = numero;
	}

	/**
	 * @return the idProposition
	 */
	public Integer getIdProposition() {
		return idProposition;
	}

	/**
	 * 
	 */
	public Proposition() {
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
	
	
	
}
