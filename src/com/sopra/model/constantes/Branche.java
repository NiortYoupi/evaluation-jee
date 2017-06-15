package com.sopra.model.constantes;

public enum Branche {
	Commercial("Commercial"),
	Ingenieur_Affaire("Ingénieur d'affaire"),
	Manager("Manager");
	
	private String name="";
	
	private Branche(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
