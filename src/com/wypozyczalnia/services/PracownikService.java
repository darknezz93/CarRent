package com.wypozyczalnia.services;

import java.util.List;
import com.wypozyczalnia.domain.Pracownik;

public interface PracownikService {
	
	public void insertData(Pracownik pracownik);
	public List<Pracownik> getPracownikList();
	public void deleteData(String id);
	public Pracownik getPracownik(String id);
	public void updateData(Pracownik pracownik);
	

}
