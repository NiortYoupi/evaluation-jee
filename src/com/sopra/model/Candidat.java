package com.sopra.model;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("1")
public class Candidat extends Personne {
	
	@Column(name="UTI_CLEACCES")
	private String cleAcces;

	@OneToOne(mappedBy="candidat")
	private Test test;
	
	public Candidat(){
		
	}
	
	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public String getCleAcces() {
		return cleAcces;
	}

	public void setCleAcces(String cleAcces) {
		this.cleAcces = cleAcces;
	}
	
	
}
