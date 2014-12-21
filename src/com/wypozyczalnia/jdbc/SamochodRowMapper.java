package com.wypozyczalnia.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.jdbc.core.RowMapper;  
import com.wypozyczalnia.domain.Samochod;

public class SamochodRowMapper implements RowMapper<Samochod> {
	
	@Override
	public Samochod mapRow(ResultSet resultSet, int line) throws SQLException {
		SamochodExtractor SamochodExtractor = new SamochodExtractor();
		return SamochodExtractor.extractData(resultSet);
	}

}
