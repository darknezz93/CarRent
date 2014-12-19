package com.wypozyczalnia.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.jdbc.core.RowMapper;  
import com.wypozyczalnia.domain.Klient;

public class KlientRowMapper implements RowMapper<Klient> {
	
	@Override
	public Klient mapRow(ResultSet resultSet, int line) throws SQLException {
		KlientExtractor klientExtractor = new KlientExtractor();
		return klientExtractor.extractData(resultSet);
	}

}
