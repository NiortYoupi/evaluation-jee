package com.sopra.model.constantes;

public enum Niveau {
	NiveauBac("Bac"),
	NiveauBacPlus1("Bac +1"),
	NiveauBacPlus2("Bac +2");
	
	private String name="";
	
	private Niveau(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
