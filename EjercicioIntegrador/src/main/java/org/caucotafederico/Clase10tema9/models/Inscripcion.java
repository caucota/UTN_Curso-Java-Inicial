package org.caucotafederico.Clase10tema9.models;

import java.time.LocalDate;

public class Inscripcion {
	private Alumno alumno;
	private Materia materia;
	private LocalDate fecha;
	
	
	public final Alumno getAlumno() {
		return alumno;
	}
	public final void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public final Materia getMateria() {
		return materia;
	}
	public final void setMateria(Materia materia) {
		this.materia = materia;
	}
	public final LocalDate getFecha() {
		return fecha;
	}
	public final void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public boolean aprobada() {
		return this.getMateria().puedeCursar
	}
	
	public String aprobadaString() {
		
	}
}
