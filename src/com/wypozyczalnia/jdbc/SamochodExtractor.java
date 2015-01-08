package com.wypozyczalnia.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  
import com.wypozyczalnia.domain.Samochod;  

public class SamochodExtractor  implements ResultSetExtractor<Samochod> {
	
	public Samochod extractData(ResultSet resultSet) throws SQLException, DataAccessException{
		
		Samochod Samochod = new Samochod();
		Samochod.setId_samochodu(resultSet.getInt(1));
		Samochod.setCena_za_dobe(resultSet.getInt(2));
		Samochod.setMarka(resultSet.getString(3));
		Samochod.setRok_produkcji(resultSet.getInt(4));
		Samochod.setKolor(resultSet.getString(5));
		Samochod.setPrzebieg(resultSet.getInt(6));
		Samochod.setPojemnosc_silnika(resultSet.getFloat(7));
		return Samochod;	
	}

}
