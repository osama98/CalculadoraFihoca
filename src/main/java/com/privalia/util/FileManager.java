package com.privalia.util;

import java.io.File;

public class FileManager {
	
	  /*public static void main(String[] args) throws IOException {
        String ruta = "alumnos.txt";
        
        File archivo = new File(ruta);
        
        BufferedWriter bw;
        
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El fichero de texto ya estaba creado.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        
        bw.close();
    }*/
	
	
	public static File createFile(String archivo) {
		
		File fichero = new File(archivo);
		return fichero;
	}
	
	public static boolean fileExist(String archivo) {
		
		return new File(archivo).exists();
	}

}
