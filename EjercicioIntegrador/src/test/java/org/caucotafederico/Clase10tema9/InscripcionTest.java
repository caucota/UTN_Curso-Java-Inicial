package org.caucotafederico.Clase10tema9;
import org.caucotafederico.Clase10tema9.models.Alumno;
import org.caucotafederico.Clase10tema9.models.Materia;
import org.junit.Test;

public class InscripcionTest {
	@Test
	public void validarInscripcionDeMateriasSinCorrelativas() {
		///Creamos materias
		Materia programacionI = new Materia("Programacion I");
		Materia programacionII = new Materia("Programacion II");
		Materia baseDeDatosI = new Materia("Base de datos I");
		
		programacionII.agregarMateriaCorrelativa(programacionI);
		
		Alumno alumno = new Alumno("Nahuel Ramirez", "1380000-0");
		
		Inscripcion = inscripcion = new Inscripcion(alumno, baseDeDatosI);
		
		assertTrue(inscripcion.aprobada());
	}
	
	@Test
	public void validarInscripcionDeMateriasConCorrelativasYQueAlumnoLaTEnga() {
		///Creamos materias
		Materia programacionI = new Materia("Programacion I");
		Materia programacionII = new Materia("Programacion II");
		Materia baseDeDatosI = new Materia("Base de datos I");
		
		programacionII.agregarMateriaCorrelativa(programacionI);
		
		Alumno alumno = new Alumno("Nahuel Ramirez", "1380000-0");
		
		Inscripcion = inscripcion = new Inscripcion(alumno, programacionII);
		
		assertTrue(inscripcion.aprobada());
	}	
	
	@Test
	public void validarInscripcionDeMateriasConCorrelativasYQueAlumnoNoLaTEnga() {
		///Creamos materias
		Materia programacionI = new Materia("Programacion I");
		Materia programacionII = new Materia("Programacion II");
		Materia baseDeDatosI = new Materia("Base de datos I");
		
		programacionII.agregarMateriaCorrelativa(programacionI);
		
		Alumno alumno = new Alumno("Nahuel Ramirez", "1380000-0");
		
		Inscripcion = inscripcion = new Inscripcion(alumno, programacionII);
		
		assertFalse(inscripcion.aprobada());
	}	
	

}
