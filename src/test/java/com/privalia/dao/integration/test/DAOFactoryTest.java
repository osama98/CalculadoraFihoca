package com.privalia.dao.integration.test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.privalia.common.Alumno;
import com.privalia.common.DBType;
import com.privalia.dao.IDao;
import com.privalia.factory.DAOFactory;


@RunWith(value = Parameterized.class)

public class DAOFactoryTest {
	private int idAlumno;
	private String nombre;
	private String apellidos;
	private String dni;
	
	

	public DAOFactoryTest(int idAlumno, String nombre, String apellidos, String dni) {
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
	public void TxtAlumnoTest() throws UnsupportedOperationException, IOException{
		
		DAOFactory daoFactory = DAOFactory.getDAOFactory(DBType.TXT);
		IDao<Alumno> iDao = daoFactory.getAlumnoDAO();
		
		Alumno alumno = new Alumno(idAlumno,nombre,apellidos,dni);
		
		assertTrue(iDao.add(alumno).equals(alumno));
	}
	
	@Test
	public void JsonAlumnoTest() throws UnsupportedOperationException, IOException{
		
		DAOFactory daoFactory = DAOFactory.getDAOFactory(DBType.JSON);
		
		IDao<Alumno> iDao = daoFactory.getAlumnoDAO();
		
		Alumno alumno = new Alumno(idAlumno,nombre,apellidos,dni);
		
		assertTrue(iDao.add(alumno).equals(alumno));
	}

}
