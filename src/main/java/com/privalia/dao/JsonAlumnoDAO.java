package com.privalia.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.privalia.common.Alumno;
import com.privalia.util.FileManager;

public class JsonAlumnoDAO implements IDao<Alumno> {

	public static final String PATH = "alumnos.json";
	
	static {
		if(FileManager.fileExist(PATH) == false) {
			FileManager.createFile(PATH);
		}
	}

	public Alumno add(Alumno model) throws IOException{
		
		BufferedWriter bufferedwritter = null;
		
		
		try {
			
			bufferedwritter = new BufferedWriter(new FileWriter(PATH,true));
			bufferedwritter.append(model.toString());
			bufferedwritter.newLine();

		} catch (IOException ex) {
			
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
			throw ex;
			
		} finally {
			if(bufferedwritter != null) {
				bufferedwritter.close();
			}
		}
		
		return searchById(model.getIdAlumno());
	}
	
	private Alumno searchById(int idAlumno) throws IOException {
		
		BufferedReader bufferedreader = null;
		Alumno alumnoFinal = new Alumno();
		
		try {
			bufferedreader = new BufferedReader(new FileReader(PATH));
			
			String line = "";
			String[] alumno = null;
			
		    while ((bufferedreader.readLine()) != null) {
		    	
		       line = bufferedreader.readLine();
		       
		       alumno = line.split(",",4);
		       
		       if(Integer.parseInt(alumno[0]) == idAlumno) {
		    	   break;
		       }
		    }
		    
		    
		    alumnoFinal = new Alumno(Integer.parseInt(alumno[0]),alumno[1],alumno[2],alumno[3]);
		    
		    
		    
		} catch(IOException ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
			throw ex;
		} finally {
			
			if(bufferedreader != null) {
				bufferedreader.close();
			}
		}
		
		
		return alumnoFinal;
		
	}

}
