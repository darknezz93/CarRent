package com.wypozyczalnia.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  
import com.wypozyczalnia.domain.Klient;  

public class KlientExtractor  implements ResultSetExtractor<Klient> {
	
	public Klient extractData(ResultSet resultSet) throws SQLException, DataAccessException{
		
		Klient klient = new Klient();
		
		klient.setId_klienta(resultSet.getInt(1));
		klient.setImie(resultSet.getString(2));
		klient.setNazwisko(resultSet.getString(3));
		klient.setTelefon(resultSet.getInt(4));
		klient.setUlica(resultSet.getString(5));
		klient.setNumer(resultSet.getInt(6));
		klient.setMiasto(resultSet.getString(7));
		
		return klient;
		
	}

}
