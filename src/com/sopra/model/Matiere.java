package com.sopra.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "matiere")

public class Matiere {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MAT_ID")
	private Integer idMatiere;

	@Column(name = "MAT_NOM")
	private String nom;
	
	@JsonIgnore
	@OneToMany(mappedBy="matiere")
	private List<Questionnaire> questionnaires;
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the idMatiere
	 */
	public Integer getIdMatiere() {
		return idMatiere;
	}

	/**
	 * 
	 */
	public Matiere() {
	}
	
	
}
