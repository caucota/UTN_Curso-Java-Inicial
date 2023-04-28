package org.caucotafederico.Clase10tema9.models;

import java.util.List;

public class Materia {
	String nombre = "";
	List<Materia> correlativas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Materia> getCorrelativas() {
		return correlativas;
	}
	public void setCorrelativas(List<Materia> correlativas) {
		this.correlativas = correlativas;
	}
	
	public void agregarElemento(Materia materia) {
		correlativas.add(materia);
	}
}
