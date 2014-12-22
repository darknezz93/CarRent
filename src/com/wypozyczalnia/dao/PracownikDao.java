package com.wypozyczalnia.dao;

import java.util.List;
import com.wypozyczalnia.domain.Pracownik;

public interface PracownikDao {
	
	public void insertData(Pracownik data);
	public List<Pracownik> getPracownikList();
	public void updateData(Pracownik pracownik);
	public void deleteData(String id);
	public Pracownik getPracownik(String id);
	
	

}
