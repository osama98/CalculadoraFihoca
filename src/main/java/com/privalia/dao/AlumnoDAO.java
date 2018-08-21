package com.privalia.dao;

import java.io.PrintWriter;

import com.privalia.common.Alumno;
import com.privalia.util.FileManager;

public class AlumnoDAO implements IDao<Alumno> {

	public Alumno add(Alumno model){
		
		FileManager archivo = new FileManager();	
		
		
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
