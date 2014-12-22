package com.wypozyczalnia.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  
import com.wypozyczalnia.domain.Pracownik;  

public class PracownikExtractor  implements ResultSetExtractor<Pracownik> {
	
	public Pracownik extractData(ResultSet resultSet) throws SQLException, DataAccessException{
		
		Pracownik Pracownik = new Pracownik();
		
		Pracownik.setId_pracownika(resultSet.getInt(1));
		Pracownik.setImie(resultSet.getString(2));
		Pracownik.setNazwisko(resultSet.getString(3));
		Pracownik.setData_zatrudnienia(resultSet.getString(4));
		Pracownik.setPensja(resultSet.getInt(5));
		Pracownik.setTelefon(resultSet.getInt(6));
		
		return Pracownik;	
	}

}
