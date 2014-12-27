package com.wypozyczalnia.dao;

import java.util.ArrayList;  
import java.util.List;  

import javax.sql.DataSource;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  

import com.wypozyczalnia.domain.Klient;  
import com.wypozyczalnia.jdbc.KlientRowMapper; 


public class KlientDaoImpl implements KlientDao {
	
	@Autowired
	DataSource dataSource;
	
	public void insertData(Klient klient){
		
		String sql = "INSERT INTO Klient (imie, nazwisko, telefon, ulica, numer, miasto)"
					 + "VALUES  (?, ?, ?, ?, ?, ?)";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[]{klient.getImie(), klient.getNazwisko(),
					klient.getTelefon(), klient.getUlica(), klient.getNumer(),
					klient.getMiasto()});
		
	}
	
	public List<Klient> getKlientList(){
		List klientList = new ArrayList();
		
		String sql = "SELECT * FROM Klient";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		klientList = jdbcTemplate.query(sql, new KlientRowMapper());
		return klientList;
	}
	
	
	@Override
	public void deleteData(String id){
		String sql = "DELETE FROM Klient WHERE id_klienta = " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);
	}
	
	@Override
	public void updateData(Klient klient){
		String sql = "UPDATE Klient set imie = ?, nazwisko = ?, telefon = ?, "
				+ "ulica = ?, numer = ?, miasto = ? WHERE id_klienta=?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[]{klient.getImie(), klient.getNazwisko(),
				klient.getTelefon(), klient.getUlica(), klient.getNumer(),
				klient.getMiasto(),klient.getId_klienta()});
	
		
	}
	
	@Override
	public Klient getKlient(String id){
		List<Klient> klientList = new ArrayList<Klient>();
		String sql = "SELECT * FROM Klient where id_klienta =" +id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		klientList = jdbcTemplate.query(sql, new KlientRowMapper());
		return klientList.get(0);
	}

}
