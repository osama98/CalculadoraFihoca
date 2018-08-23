package com.privalia.factory;

import com.privalia.common.Alumno;
import com.privalia.dao.IDao;
import com.privalia.dao.TxtAlumnoDAO;

public class TxtDAOFactory extends DAOFactory {
	
	
	public IDao<Alumno> getAlumnoDAO() {
	    // OracleDbCustomerDAO implements CustomerDAO
	    return new TxtAlumnoDAO();
	  }
}
