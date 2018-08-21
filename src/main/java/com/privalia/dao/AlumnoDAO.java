package com.privalia.dao;


import java.io.BufferedWriter;
import java.io.FileWriter;

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

	public Alumno add(Alumno model){
		
		BufferedWriter bw;
		try {

			bw = new BufferedWriter(new FileWriter(archivo,true));
            bw.append(model.toString());
            bw.newLine();

			bw.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepci�n: " + ex.getMessage());
		}
		
		
		return model;
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
