package com.sopra.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("0")
public class Admin extends Personne {
	@Column(name="UTI_USERNAME")
	private String username;
	
	@Column(name="UTI_PASSWORD")
	private String password;

	public Admin(){
		
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
