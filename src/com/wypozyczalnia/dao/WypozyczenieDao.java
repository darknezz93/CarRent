package com.wypozyczalnia.dao;

import java.util.List;

import com.wypozyczalnia.domain.Samochod;
import com.wypozyczalnia.domain.Wypozyczenie;

public interface WypozyczenieDao {
	
	public void insertData(Wypozyczenie data);
	public List<Wypozyczenie> getWypozyczenieList();
	public void updateData(Wypozyczenie wypozyczenie);
	public void deleteData(String id);
	public Wypozyczenie getWypozyczenie(String id);
	
	

}
