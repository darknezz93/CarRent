package com.wypozyczalnia.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wypozyczalnia.domain.Przebieg;


public class PrzebiegRowMapper implements RowMapper<Przebieg> {
	
	@Override
	public Przebieg mapRow(ResultSet resultSet, int line) throws SQLException {
		PrzebiegExtractor PrzebiegExtractor = new PrzebiegExtractor();
		return PrzebiegExtractor.extractData(resultSet);
	}

}
