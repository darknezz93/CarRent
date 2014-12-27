package com.wypozyczalnia.dao;

import java.util.ArrayList;  
import java.util.List;  

import javax.sql.DataSource;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  

import com.wypozyczalnia.domain.Samochod;
import com.wypozyczalnia.domain.Wypozyczenie;  
import com.wypozyczalnia.jdbc.WypozyczenieRowMapper; 

public class WypozyczenieDaoImpl implements WypozyczenieDao {
	
	@Autowired
	DataSource dataSource;
	
	public void insertData(Wypozyczenie Wypozyczenie){
		//SELECT id_samochodu FROM Samochod JOIN wypozyczenie WHERE marka=nazwa_samochodu
		String sql = "INSERT INTO Wypozyczenie (data_wypozyczenia,Samochod_id_samochodu, Miejsce_id_miejsca, Pracownik_id_pracownika, Klient_id_klienta, imie_klienta)"
					 + "?, ?, ?, ?, ?, ?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		
		//String sql_id_samochodu = "INSERT INTO Wypozyczenie (Samochod_id_samochodu) SELECT id_samochodu FROM Samochod a JOIN Wypozyczenie b WHERE a.marka = b.nazwa_samochodu";
		//jdbcTemplate.update(sql_id_samochodu);
		jdbcTemplate.update(sql, new Object[]{Wypozyczenie.getData_wypozyczenia(),Wypozyczenie.getSamochod_id_samochodu(),
					Wypozyczenie.getMiejsce_id_miejsca(), Wypozyczenie.getPracownik_id_pracownika(), Wypozyczenie.getKlient_id_klienta(), Wypozyczenie.getImie_klienta()});
		
		
	}
	
	public List<Wypozyczenie> getWypozyczenieList(){
		List WypozyczenieList = new ArrayList();
		
		String sql = "SELECT * FROM Wypozyczenie";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		WypozyczenieList = jdbcTemplate.query(sql, new WypozyczenieRowMapper());
		return WypozyczenieList;
	}
	
	@Override
	public void deleteData(String id){
		String sql = "DELETE FROM Wypozyczenie WHERE id_wypozyczenia = " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);
	}
	
	@Override
	public void updateData(Wypozyczenie Wypozyczenie){
		String sql = "UPDATE Wypozyczenie set data_wypozyczenia = ?, Samochod_id_samochodu = ?, Miejsce_id_miejsca = ?, "
				+ "Pracownik_id_pracownika = ?, Klient_id_klienta = ?, imie_klienta = ? WHERE id_wypozyczenia=?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[]{Wypozyczenie.getData_wypozyczenia(), Wypozyczenie.getSamochod_id_samochodu(),
				Wypozyczenie.getMiejsce_id_miejsca(), Wypozyczenie.getPracownik_id_pracownika(), Wypozyczenie.getKlient_id_klienta(), Wypozyczenie.getImie_klienta()});
	
		
	}
	
	@Override
	public Wypozyczenie getWypozyczenie(String id){
		List<Wypozyczenie> WypozyczenieList = new ArrayList<Wypozyczenie>();
		String sql = "SELECT * FROM Wypozyczenie where id_wypozyczenia =" +id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		WypozyczenieList = jdbcTemplate.query(sql, new WypozyczenieRowMapper());
		return WypozyczenieList.get(0);
	}




}
