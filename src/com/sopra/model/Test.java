package com.sopra.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sopra.model.constantes.Branche;
import com.sopra.model.constantes.Niveau;

@Entity
@Table(name="test")
public class Test {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TES_ID")
	private Integer idTest;

	@Column(name="TES_NIVEAU")
	private Niveau niveau;
	
	@Column(name="TES_BRANCHE")
	private Branche branche;
	
	@Column(name="TES_DATE")
	private Date date;
	
	@OneToOne
	@JoinColumn(name="TES_CANDIDAT_ID")
	private Candidat candidat;
	
	@OneToMany(mappedBy="test")
	private List<Reponse> reponses;
	
	/**
	 * @return the candidat
	 */
	public Candidat getCandidat() {
		return candidat;
	}

	/**
	 * @param candidat the candidat to set
	 */
	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	/**
	 * @return the niveau
	 */
	public Niveau getNiveau() {
		return niveau;
	}

	/**
	 * @param niveau the niveau to set
	 */
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	/**
	 * @return the branche
	 */
	public Branche getBranche() {
		return branche;
	}

	/**
	 * @param branche the branche to set
	 */
	public void setBranche(Branche branche) {
		this.branche = branche;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the idTest
	 */
	public Integer getIdTest() {
		return idTest;
	}

	/**
	 * 
	 */
	public Test() {
		super();
	}
	
	
}
