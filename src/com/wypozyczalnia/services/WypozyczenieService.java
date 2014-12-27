package com.wypozyczalnia.services;

import java.util.List;

import com.wypozyczalnia.domain.Samochod;
import com.wypozyczalnia.domain.Wypozyczenie;

public interface WypozyczenieService {
	
	public void insertData(Wypozyczenie wypozyczenie);
	public List<Wypozyczenie> getWypozyczenieList();
	public void deleteData(String id);
	public Wypozyczenie getWypozyczenie(String id);
	public void updateData(Wypozyczenie wypozyczenie);
	

}
