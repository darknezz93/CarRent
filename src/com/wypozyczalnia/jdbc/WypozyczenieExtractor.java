package com.wypozyczalnia.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  
import com.wypozyczalnia.domain.Wypozyczenie;  

public class WypozyczenieExtractor  implements ResultSetExtractor<Wypozyczenie> {
	
	public Wypozyczenie extractData(ResultSet resultSet) throws SQLException, DataAccessException{
		
		Wypozyczenie wypozyczenie = new Wypozyczenie();
		
		wypozyczenie.setId_wypozyczenia(resultSet.getInt(1));
		wypozyczenie.setData_wypozyczenia(resultSet.getString(2));
		wypozyczenie.setSamochod_id_samochodu(resultSet.getInt(3));
		wypozyczenie.setMiejsce_id_miejsca(resultSet.getInt(4));
		wypozyczenie.setPracownik_id_pracownika(resultSet.getInt(5));
		wypozyczenie.setKlient_id_klienta(resultSet.getInt(6));
		wypozyczenie.setImie_klienta(resultSet.getString(7));

		return wypozyczenie;
		
	}

}
