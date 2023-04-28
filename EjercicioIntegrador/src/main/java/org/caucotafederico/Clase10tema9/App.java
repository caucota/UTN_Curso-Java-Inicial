package org.caucotafederico.Clase10tema9;

import org.caucotafederico.Clase10tema9.models.Alumno;
import org.caucotafederico.Clase10tema9.models.LectorCSV;

import com.sun.tools.javac.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Materia programacionI = new Materia("Programacion I");
        Materia programacionII = new Materia("Programacion II");
        Materia baseDeDatosI = new Materia("Base de datosI");
        
        programacionII.agregarMateriaCorrelativa(programacionI);
        
        List<Materia> = materias = new ArrayList<Materia>();
        materias.add(programacionI);
        materias.add(programacionII);
        materias.add(baseDeDatosI);
        
        Alumno alumno1 = new Alumno ("Vanesa Sosa", "138000-0");
        Alumno alumno2 = new Alumno("Jose RodriguAlumno14000-0");
        
        List<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        
        LectorCSV archivoLeido = new LectorCSV("src/main/resources/inscripcion.csv");
        /*
        for(LineasCsvInscripcion lineasLeidas: archivoLeido.lineasArchivos) {
        	System.out.println(lineasLeidas.getNombreAlumno() + " | " + lineasLeidas.getNombreMateria());
        }
        */
        
        archivoLeido.listarInscripciones(alumnos, materias);
    }
    
  
}
