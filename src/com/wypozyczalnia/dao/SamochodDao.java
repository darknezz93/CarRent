package com.wypozyczalnia.dao;

import java.util.List;
import com.wypozyczalnia.domain.Samochod;

public interface SamochodDao {
	
	public void insertData(Samochod data);
	public List<Samochod> getSamochodList();
	public void updateData(Samochod samochod);
	public void deleteData(String id);
	public Samochod getSamochod(String id);

}
