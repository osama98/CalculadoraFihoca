package com.privalia.dao.integration.test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.privalia.common.Alumno;
import com.privalia.dao.AlumnoDAO;

public class AlumnoDAOTest {

	@Test
	public void testAdd() throws UnsupportedOperationException, IOException{
		
		Alumno alumno = new Alumno(3,"Pepe","awsdsd","5466454J");
		
		AlumnoDAO dao = new AlumnoDAO();
		
			
		Alumno alumnoInserted = dao.add(alumno);
		assertTrue(alumnoInserted.equals(alumno));
		
		//crear un alumno de prueba
			//Alumno alumno = new Alumno();
			//alumno.setIdAlumno(1);
			//alumno.setName("assada");
		
		
		//Instanciar AlumnoDao
		//Llamar al metodo add enviando el alumno de prueba creado
		//Devlover el alumno escrito en el fichero alumno.txt
		//Comprobar que los dos alumnos son iguales.Equals.
	}

}
