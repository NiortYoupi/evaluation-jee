package com.sopra.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "question")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QUE_ID")
	private Integer idQuestion;

	@Column(name = "QUE_INTITULE")
	private String intitule;

	@Column(name = "QUE_NUMERO")
	private Integer numero;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "QUE_QUESTIONNAIRE_ID")
	private Questionnaire questionnaire;

	/**
	 * @return the propositions
	 */
	public List<Proposition> getPropositions() {
		return propositions;
	}

	/**
	 * @param propositions
	 *            the propositions to set
	 */
	public void setPropositions(List<Proposition> propositions) {
		this.propositions = propositions;
	}

	@ManyToMany
	@JoinTable(name = "qcm", uniqueConstraints = @UniqueConstraint(columnNames = { "QCM_QUESTION_ID",
			"QCM_PROPOSITION_ID" }), joinColumns = @JoinColumn(name = "QCM_QUESTION_ID", referencedColumnName = "QUE_ID"), inverseJoinColumns = @JoinColumn(name = "QCM_PROPOSITION_ID", referencedColumnName = "PRO_ID"))
	private List<Proposition> propositions;

	@OneToMany(mappedBy = "question")
	private List<Reponse> reponses;

	/**
	 * @return the questionnaire
	 */
	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}

	/**
	 * @param questionnaire
	 *            the questionnaire to set
	 */
	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}

	/**
	 * @return the intitule
	 */
	public String getIntitule() {
		return intitule;
	}

	/**
	 * @param intitule
	 *            the intitule to set
	 */
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * @return the idQuestion
	 */
	public Integer getIdQuestion() {
		return idQuestion;
	}

	public Question() {
		super();
	}

	/**
	 * @return the reponses
	 */
	public List<Reponse> getReponses() {
		return reponses;
	}

}
