package com.wypozyczalnia.dao;

import java.sql.SQLException;
import java.util.ArrayList;  
import java.util.List;  

import javax.sql.DataSource;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.dao.DataAccessException;
import org.springframework.jca.cci.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;  

import com.wypozyczalnia.domain.Samochod;
import com.wypozyczalnia.domain.Wypozyczenie;  
import com.wypozyczalnia.jdbc.WypozyczenieRowMapper; 

public class WypozyczenieDaoImpl implements WypozyczenieDao {
	
	@Autowired
	DataSource dataSource;
	private Object jdbcTemplate;
	
	public void insertData(Wypozyczenie Wypozyczenie){
		//SELECT a.id_klienta FROM Klient a INNER JOIN Wypozyczenie b WHERE a.nazwisko = b.nazwisko_klienta
		String sql = "INSERT INTO Wypozyczenie (data_wypozyczenia, Samochod_id_samochodu, Miejsce_id_miejsca, Pracownik_id_pracownika, Klient_id_klienta"
				+ ",nazwisko_klienta, nazwa_samochodu, nazwisko_pracownika, imie_klienta, imie_pracownika)"
					 + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		String klientNazwisko = Wypozyczenie.nazwisko_klienta;
		String klientImie = Wypozyczenie.imie_klienta;
		String pracownikNazwisko = Wypozyczenie.nazwisko_pracownika;
		String pracownikImie = Wypozyczenie.imie_pracownika;
		String nazwaSamochodu =  Wypozyczenie.nazwa_samochodu;
		String miejsceUlica = Wypozyczenie.miejsce_ulica;
		
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		
		int Klient_id = jdbcTemplate.queryForObject(
		        "SELECT id_klienta FROM Klient WHERE nazwisko = ?", Integer.class, klientNazwisko);
		String Klient_imie = jdbcTemplate.queryForObject(
		        "SELECT imie FROM Klient WHERE nazwisko = ?", String.class, klientNazwisko);
		int Pracownik_id = jdbcTemplate.queryForObject(
		        "SELECT id_pracownika FROM Pracownik WHERE nazwisko = ?", Integer.class, pracownikNazwisko);
		String Pracownik_imie = jdbcTemplate.queryForObject(
		        "SELECT imie FROM Pracownik WHERE nazwisko = ?", String.class, pracownikNazwisko);
		int Samochod_id = jdbcTemplate.queryForObject(
		        "SELECT id_samochodu FROM Samochod WHERE marka = ?", Integer.class, nazwaSamochodu);
		int Miejsce_id = jdbcTemplate.queryForObject(
		        "SELECT id_miejsca FROM Miejsce WHERE ulica = ?", Integer.class, miejsceUlica);
		
	
		jdbcTemplate.update(sql, new Object[]{Wypozyczenie.getData_wypozyczenia(),Samochod_id,
					Miejsce_id, Pracownik_id, Klient_id,
					Wypozyczenie.getNazwisko_klienta(), Wypozyczenie.getNazwa_samochodu(), Wypozyczenie.getNazwisko_pracownika(),
					Klient_imie, Pracownik_imie});
		

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
				+ "Pracownik_id_pracownika = ?, Klient_id_klienta = ?, nazwisko_klienta = ?, nazwa_samochodu = ?,"
				+ "nazwisko_pracownika = ?, imie_klienta = ?, imie_pracownika = ? WHERE id_wypozyczenia=?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String klientNazwisko = Wypozyczenie.nazwisko_klienta;
		String klientImie = Wypozyczenie.imie_klienta;
		String pracownikNazwisko = Wypozyczenie.nazwisko_pracownika;
		String pracownikImie = Wypozyczenie.imie_pracownika;
		String nazwaSamochodu =  Wypozyczenie.nazwa_samochodu;
		String miejsceUlica = Wypozyczenie.miejsce_ulica;
		
		
		int Klient_id = jdbcTemplate.queryForObject(
		        "SELECT id_klienta FROM Klient WHERE nazwisko = ?", Integer.class, klientNazwisko);
		String Klient_imie = jdbcTemplate.queryForObject(
		        "SELECT imie FROM Klient WHERE nazwisko = ?", String.class, klientNazwisko);
		int Pracownik_id = jdbcTemplate.queryForObject(
		        "SELECT id_pracownika FROM Pracownik WHERE nazwisko = ?", Integer.class, pracownikNazwisko);
		String Pracownik_imie = jdbcTemplate.queryForObject(
		        "SELECT imie FROM Pracownik WHERE nazwisko = ?", String.class, pracownikNazwisko);
		int Samochod_id = jdbcTemplate.queryForObject(
		        "SELECT id_samochodu FROM Samochod WHERE marka = ?", Integer.class, nazwaSamochodu);
		int Miejsce_id = jdbcTemplate.queryForObject(
		        "SELECT id_miejsca FROM Miejsce WHERE ulica = ?", Integer.class, miejsceUlica);
		
		
		jdbcTemplate.update(sql, new Object[]{Wypozyczenie.getData_wypozyczenia(),Samochod_id,
				Miejsce_id, Pracownik_id, Klient_id,
				Wypozyczenie.getNazwisko_klienta(), Wypozyczenie.getNazwa_samochodu(), Wypozyczenie.getNazwisko_pracownika(),
				Klient_imie, Pracownik_imie, Wypozyczenie.getId_wypozyczenia()});
	
		
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
