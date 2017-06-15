package com.sopra.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

import com.sopra.security.SecurityPersonne;
import com.sopra.security.SecurityType;



@Entity
@Table(name="personne", uniqueConstraints={@UniqueConstraint(columnNames="PER_IDPERSONNE") })
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="PER_TYPE", discriminatorType=DiscriminatorType.INTEGER)
public abstract class Personne implements SecurityPersonne {
		
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")
	@Column(name="PER_IDPERSONNE")
	private String idPersonne;
	
	@Column(name="PER_NOM")
	private String nom;
	
	@Column(name="PER_PRENOM")
	private String prenom;
	
	@Column(name = "PER_TYPE", insertable = false, updatable = false)
    private int type;

	
	
	
	public Personne(){
		
	}
	
	public String getIdPersonne() {
		return idPersonne;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public SecurityType getSecurityType(){
		switch (this.type) {
		case 0:
			return SecurityType.Administrateur;
		default:
			return SecurityType.Candidat;
		
		}
		
	}
	
	
}
