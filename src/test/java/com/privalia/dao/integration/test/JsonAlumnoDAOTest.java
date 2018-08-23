package com.privalia.dao.integration.test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.privalia.common.Alumno;
import com.privalia.dao.JsonAlumnoDAO;


@RunWith(value = Parameterized.class)
public class JsonAlumnoDAOTest {
	private int idAlumno;
	private String nombre;
	private String apellidos;
	private String dni;
	
	

	public JsonAlumnoDAOTest(int idAlumno, String nombre, String apellidos, String dni) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	@Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "Osama","Khollala","47952183J"},
                {2, "asdsad","asdasdsa","asdasdasd"},
                {8, "sadsadsad","sdsadasd","5213645K"},
                {4, "dsadsadsada","asdasdsa","2136542L"},
                {25, "sadsadasd","sadsadasd","564564K"}
        });
    }



	@Test
	public void testAdd() throws UnsupportedOperationException, IOException{
		
		Alumno alumno = new Alumno(idAlumno,nombre,apellidos,dni);
		
		JsonAlumnoDAO dao = new JsonAlumnoDAO();
		
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