package com.privalia.factory;

import com.privalia.dao.JsonAlumnoDAO;

public class JsonDAOFactory extends DAOFactory{
		
	
	public JsonAlumnoDAO getAlumnoDAO() {
	    // OracleDbCustomerDAO implements CustomerDAO
	    return new JsonAlumnoDAO();
	  }
}
