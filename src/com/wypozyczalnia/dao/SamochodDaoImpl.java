package com.wypozyczalnia.dao;

import java.util.ArrayList;  
import java.util.List;  
import javax.sql.DataSource;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  
import com.wypozyczalnia.domain.Samochod;  
import com.wypozyczalnia.jdbc.SamochodRowMapper; 

public class SamochodDaoImpl implements SamochodDao {
	
	@Autowired
	DataSource dataSource;
	
	public void insertData(Samochod Samochod){
		
		String sql = "INSERT INTO Samochod (cena_za_dobe, marka, rok_produkcji, kolor, przebieg, pojemnosc_silnika)"
					 + "VALUES  (?, ?, ?, ?, ?, ?)";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[]{Samochod.getCena_za_dobe(), Samochod.getMarka(),
					Samochod.getRok_produkcji(), Samochod.getKolor(), Samochod.getPrzebieg(),
					Samochod.getPojemnosc_silnika()});
		
	}
	
	public List<Samochod> getSamochodList(){
		List SamochodList = new ArrayList();
		
		String sql = "SELECT * FROM Samochod";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		SamochodList = jdbcTemplate.query(sql, new SamochodRowMapper());
		return SamochodList;
	}
	
	@Override
	public void deleteData(String id){
		String sql = "DELETE FROM Samochod WHERE id_samochodu = " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);
	}
	
	@Override
	public void updateData(Samochod Samochod){
		String sql = "UPDATE Samochod set cena_za_dobe = ?, marka = ?, rok_produkcji = ?, "
				+ "kolor = ?, przebieg = ?, pojemnosc_silnika = ? WHERE id_samochodu=?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[]{Samochod.getCena_za_dobe(), Samochod.getMarka(),
				Samochod.getRok_produkcji(), Samochod.getKolor(), Samochod.getPrzebieg(),
				Samochod.getPojemnosc_silnika(), Samochod.getId_samochodu()});
	
		
	}
	
	@Override
	public Samochod getSamochod(String id){
		List<Samochod> SamochodList = new ArrayList<Samochod>();
		String sql = "SELECT * FROM Samochod where id_samochodu =" +id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		SamochodList = jdbcTemplate.query(sql, new SamochodRowMapper());
		return SamochodList.get(0);
	}

}

