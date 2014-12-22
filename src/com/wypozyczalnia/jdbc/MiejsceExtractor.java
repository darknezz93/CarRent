package com.wypozyczalnia.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  
import com.wypozyczalnia.domain.Miejsce;  

public class MiejsceExtractor  implements ResultSetExtractor<Miejsce> {
	
	public Miejsce extractData(ResultSet resultSet) throws SQLException, DataAccessException{
		
		Miejsce Miejsce = new Miejsce();
		
		Miejsce.setId_miejsca(resultSet.getInt(1));
		Miejsce.setUlica(resultSet.getString(2));
		Miejsce.setNumer(resultSet.getInt(3));
		Miejsce.setMiasto(resultSet.getString(4));
		
		return Miejsce;
		
	}

}
