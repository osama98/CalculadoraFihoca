package com.privalia.factory;

import com.privalia.common.Alumno;
import com.privalia.common.DBType;
import com.privalia.dao.IDao;

public abstract class DAOFactory {
	 // List of DAO types supported by the factory
	  public static final int TXT = 0;
	  public static final int JSON= 1;
	 
	  // There will be a method for each DAO that can be 
	  // created. The concrete factories will have to 
	  // implement these methods.
	  public abstract IDao<Alumno> getAlumnoDAO();
	 
	  public static DAOFactory getDAOFactory(DBType txt2) {
	 
	    switch (txt2) {
	      case TXT: 
	          return new TxtDAOFactory();
	      case JSON: 
	          return new JsonDAOFactory();
	      default           : 
	          return null;
	    }
	    
	  }
}
