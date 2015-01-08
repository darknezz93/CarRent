package com.wypozyczalnia.dao;

import java.util.ArrayList;  
import java.util.List;  
import javax.sql.DataSource;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  
import com.wypozyczalnia.domain.Pracownik;  
import com.wypozyczalnia.jdbc.PracownikRowMapper; 

public class PracownikDaoImpl implements PracownikDao {
	
	@Autowired
	DataSource dataSource;
	
	public void insertData(Pracownik Pracownik){
		
		String sql = "INSERT INTO Pracownik (imie, nazwisko, data_zatrudnienia, pensja, telefon)"
					 + "VALUES  (?, ?, ?, ?, ?)";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[]{Pracownik.getImie(), Pracownik.getNazwisko(),
					Pracownik.getData_zatrudnienia(), Pracownik.getPensja(), Pracownik.getTelefon()});
		
	}
	
	public List<Pracownik> getPracownikList(){
		List PracownikList = new ArrayList();
		
		String sql = "SELECT * FROM Pracownik";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		PracownikList = jdbcTemplate.query(sql, new PracownikRowMapper());
		return PracownikList;
	}
	
	public void deletePracownikLowestSalary(){
		int pensja;
		String sql = "CALL USUN_NAJGORZEJ_ZARABIAJACY()";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);
	}
	
	@Override
	public void deleteData(String id){
		String sql = "DELETE FROM Pracownik WHERE id_pracownika = " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);
	}
	
	@Override
	public void updateData(Pracownik Pracownik){
		String sql = "UPDATE Pracownik set imie = ?, nazwisko = ?, data_zatrudnienia = ?, "
				+ "pensja = ?, telefon = ? WHERE id_pracownika=?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[]{Pracownik.getImie(), Pracownik.getNazwisko(),
				Pracownik.getData_zatrudnienia(), Pracownik.getPensja(), Pracownik.getTelefon(),
			    Pracownik.getId_pracownika()});
	
		
	}
	
	@Override
	public Pracownik getPracownik(String id){
		List<Pracownik> PracownikList = new ArrayList<Pracownik>();
		String sql = "SELECT * FROM Pracownik where id_pracownika =" +id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		PracownikList = jdbcTemplate.query(sql, new PracownikRowMapper());
		return PracownikList.get(0);
	}

}

