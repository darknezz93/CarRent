package com.wypozyczalnia.dao;

import java.util.ArrayList;  
import java.util.List;  

import javax.sql.DataSource;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  

import com.wypozyczalnia.domain.Miejsce;  
import com.wypozyczalnia.jdbc.MiejsceRowMapper; 

public class MiejsceDaoImpl implements MiejsceDao {
	
	@Autowired
	DataSource dataSource;
	
	public void insertData(Miejsce Miejsce){
		
		String sql = "INSERT INTO Miejsce (ulica, numer, miasto)"
					 + "VALUES  (?, ?, ?)";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[]{Miejsce.getUlica(), Miejsce.getNumer(),Miejsce.getMiasto()});
		
	}
	
	public List<Miejsce> getMiejsceList(){
		List MiejsceList = new ArrayList();
		
		String sql = "SELECT * FROM Miejsce";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		MiejsceList = jdbcTemplate.query(sql, new MiejsceRowMapper());
		return MiejsceList;
	}
	
	@Override
	public void deleteData(String id){
		String sql = "DELETE FROM Miejsce WHERE id_miejsca = " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);
	}
	
	@Override
	public void updateData(Miejsce Miejsce){
		String sql = "UPDATE Miejsce set"
				+ " ulica = ?, numer = ?, miasto = ? WHERE id_miejsca=?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[]{Miejsce.getUlica(), Miejsce.getNumer(), Miejsce.getMiasto(), Miejsce.getId_miejsca()});
	}
	
	@Override
	public Miejsce getMiejsce(String id){
		List<Miejsce> MiejsceList = new ArrayList<Miejsce>();
		String sql = "SELECT * FROM Miejsce where id_miejsca =" +id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		MiejsceList = jdbcTemplate.query(sql, new MiejsceRowMapper());
		return MiejsceList.get(0);
	}

}
