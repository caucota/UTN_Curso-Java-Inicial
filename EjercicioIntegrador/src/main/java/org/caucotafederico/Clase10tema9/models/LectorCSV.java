package org.caucotafederico.Clase10tema9.models;

import java.io.FileReader;
import java.util.List;

import org.caucotafederico.Clase10tema9.voud;

import com.opencsv.bean.CsvToBeanBuilder;

public class LectorCSV {
	
	public String rutaArchivo;
	public List<LineasCsvInscripcion> lineasArchivos;
	
	public LectorCSV(String ruta) {
		this.rutaArchivo = ruta;
		this.leerElArchivo();
	}

	
	private void leerElArchivo() {
		try {
		List<LineasCsvInscripcion> lineasLeidas = new CsvToBeanBuilder(new FileReader(this.rutaArchivo), StandarCharsets.UTF_())
				.withSkipLines(1)
				.withTypo(LineasCSVInscripcion.class)
				.build().parse();
		}catch (IlleglStateException e) {
			
		}catch (FileNotFound)
		
		
	}
	
	
	  public void listarInscripciones(List<Alumno> alumnos, List<Materia> materias) {
		  for(LineasCsvInscripcion = lineaLeida : this.lineasArchivos) {
			  try {
			  Inscripcion inscripcion = this.validarInscripcion(alumnos, materias, lineaLeida);
			  this.imprimirEnPantalla(
					  lineaLeida.getNombreAlumno(),
					  lineaLeida.getNombreMateria(),
					  inscripcion.aprobada());
			  } catch (NoExisteAlumnoException e) {
				  
			  } catch (NoExisteMateriaException e) {
				  this.imprimirEnPantalla(lineaLeida.getNombreAlumno(),  lineaLeida.getNombreMateria(), "dsafasdfa");
			  }
			  
		  }
	  }
	  
	  private Inscripcion validarInscripcion( List<Alumno> alumnos, List<Materia> materias, LineasCsvInscripcion lineaLeida) {
		  Alumno alumnoleido = null;
		  for(Alumno alumnoDeLaLista : alumnos) {
			  if(alumnoDeLaLista.getNombre().equals(lineaLeida.getNombreAlumno())) {
				  alumnoLeido = alumnoDeLaLista;
			  }
		  }
		  
		  Materia materiaLeida = null;
		  for(Materia materiaDeLaLista : materias) {
			  if(materiaDeLaLista.getNombre().equals(lineaLeida.getNombreMateria())) {
				  materiaLeida = materiaDeLaLista;
			  }
		  }
		  
		  if(alumnoLeido == null) {
			  throw new NoExisteAlumnoException();
		  }
		  if(materiaLeida == null) {
			  throw new NoExisteMateriaException();
		  }
		  
		  return new Inscripcion(alumnoLeido, materiaLeida);
	  }
	  
	  private void imprimirEnPantalla(String nombreAlumno, String nombreMateria, String resultadoString) {
		  
		  // Se uas el % para formatear. Se indica con -20 la cantidad de espacios de separacion
		  System.out.printf("%-20s%-20s\n", nombreAlumno, nombreMateria, resultadoString);
	  }

}
