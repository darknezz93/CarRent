package com.wypozyczalnia.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.jdbc.core.RowMapper;  
import com.wypozyczalnia.domain.Pracownik;

public class PracownikRowMapper implements RowMapper<Pracownik> {
	
	@Override
	public Pracownik mapRow(ResultSet resultSet, int line) throws SQLException {
		PracownikExtractor PracownikExtractor = new PracownikExtractor();
		return PracownikExtractor.extractData(resultSet);
	}

}
