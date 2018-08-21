package com.privalia.dao;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.privalia.common.Alumno;
import com.privalia.util.FileManager;

public class AlumnoDAO implements IDao<Alumno> {
	
		public static String archivo = null;
	
	static {
		
		archivo = "alumnos.txt";
		
		if(FileManager.fileExist(archivo) == false) {
			FileManager.createFile(archivo);
		}
	}

	public Alumno add(Alumno model) throws IOException{
		
		BufferedWriter bufferedwritter = null;
		
		
		try {
			
			bufferedwritter = new BufferedWriter(new FileWriter(archivo,true));
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
			bufferedreader = new BufferedReader(new FileReader(archivo));
			
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
	
	
	
	/*public void Write(Alumno model, FileManager archivo)
    {
        PrintWriter pw = null;
        try
        {
            pw = new PrintWriter(archivo);

            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }*/
	

}
