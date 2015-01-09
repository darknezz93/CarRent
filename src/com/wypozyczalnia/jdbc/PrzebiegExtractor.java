package com.wypozyczalnia.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.wypozyczalnia.domain.Przebieg;

public class PrzebiegExtractor  implements ResultSetExtractor<Przebieg> {
	
	public Przebieg extractData(ResultSet resultSet) throws SQLException, DataAccessException{
		
		Przebieg Przebieg = new Przebieg();
		Przebieg.setPrzebieg(resultSet.getInt(1));

		return Przebieg;	
	}

}