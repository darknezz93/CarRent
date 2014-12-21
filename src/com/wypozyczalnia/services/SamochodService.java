package com.wypozyczalnia.services;

import java.util.List;
import com.wypozyczalnia.domain.Samochod;

public interface SamochodService {
	
	public void insertData(Samochod samochod);
	public List<Samochod> getSamochodList();
	public void deleteData(String id);
	public Samochod getSamochod(String id);
	public void updateData(Samochod samochod);
	

}
