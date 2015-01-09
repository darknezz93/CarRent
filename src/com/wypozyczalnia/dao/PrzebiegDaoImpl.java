package com.wypozyczalnia.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.wypozyczalnia.domain.Przebieg;
import com.wypozyczalnia.jdbc.PrzebiegRowMapper;



public class PrzebiegDaoImpl implements PrzebiegDao {
	
	@Autowired
	DataSource dataSource;

	
	public List<Przebieg> getSamochodCourse(){
		List<Przebieg> PrzebiegList = new ArrayList();
		String sql = "SELECT PRZEBIEG()";  //Funkcja zwracaj¹ca ³¹czny przbieg aut w magazynie
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		PrzebiegList = jdbcTemplate.query(sql, new PrzebiegRowMapper());
		return PrzebiegList;
	}

}
