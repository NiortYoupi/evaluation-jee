package com.sopra.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany(mappedBy="propositions")
	private List<Question> questions;

	/**
	 * @return the correct
	 */
	public Boolean isCorrect() {
		return isCorrect;
	}

	/**
	 * @return the questions
	 */
	public List<Question> getQuestions() {
		return questions;
	}

	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
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
	
	
	
}
