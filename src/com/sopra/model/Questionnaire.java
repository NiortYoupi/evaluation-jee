package com.sopra.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "questionnaire")
public class Questionnaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QUEAIRE_ID")
	private Integer idQuestionnaire;
	
	@Column(name = "QUEAIRE_DUREE")
	private Integer duree;
	
	@Column(name = "QUEAIRE_NOMEPREUVE")
	private String nomEpreuve;
	
	@ManyToOne
	@JoinColumn(name="QUEAIRE_MATIERE_ID")
	private Matiere matiere;
	
	@OneToMany(mappedBy="questionnaire")
	private List<Question> questions;
	
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
	 * @return the matiere
	 */
	public Matiere getMatiere() {
		return matiere;
	}
	/**
	 * @param matiere the matiere to set
	 */
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	/**
	 * @return the duree
	 */
	public Integer getDuree() {
		return duree;
	}
	/**
	 * @param duree the duree to set
	 */
	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	/**
	 * @return the nomEpreuve
	 */
	public String getNomEpreuve() {
		return nomEpreuve;
	}
	/**
	 * @param nomEpreuve the nomEpreuve to set
	 */
	public void setNomEpreuve(String nomEpreuve) {
		this.nomEpreuve = nomEpreuve;
	}
	/**
	 * @return the idQuestionnaire
	 */
	public Integer getIdQuestionnaire() {
		return idQuestionnaire;
	}
	/**
	 * 
	 */
	public Questionnaire() {
		super();
	}
	
	
}
