package com.wypozyczalnia.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.jdbc.core.RowMapper;  
import com.wypozyczalnia.domain.Wypozyczenie;

public class WypozyczenieRowMapper implements RowMapper<Wypozyczenie> {
	
	@Override
	public Wypozyczenie mapRow(ResultSet resultSet, int line) throws SQLException {
		WypozyczenieExtractor wypozyczenieExtractor = new WypozyczenieExtractor();
		return wypozyczenieExtractor.extractData(resultSet);
	}

}
