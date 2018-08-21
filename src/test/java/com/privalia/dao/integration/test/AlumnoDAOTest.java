package com.privalia.dao.integration.test;

import org.junit.Test;

import com.privalia.common.Alumno;
import com.privalia.dao.AlumnoDAO;

public class AlumnoDAOTest {

	@Test
	public void testAdd() {
		
		Alumno alumno = new Alumno(1,"Osama","Khollala","47958635J");
		
		AlumnoDAO dao = new AlumnoDAO();
		
		dao.add(alumno);		
		//crear un alumno de prueba
		//Instanciar AlumnoDao
		//Llamar al metodo add enviando el alumno de prueba creado
		//Devlover el alumno escrito en el fichero alumno.txt
		//Comprobar que los dos alumnos son iguales.
	}

}
