package com.wypozyczalnia.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.jdbc.core.RowMapper;  
import com.wypozyczalnia.domain.Miejsce;

public class MiejsceRowMapper implements RowMapper<Miejsce> {
	
	@Override
	public Miejsce mapRow(ResultSet resultSet, int line) throws SQLException {
		MiejsceExtractor MiejsceExtractor = new MiejsceExtractor();
		return MiejsceExtractor.extractData(resultSet);
	}

}
