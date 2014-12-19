package com.wypozyczalnia.services;

import java.util.List;
import com.wypozyczalnia.domain.Klient;

public interface KlientService {
	
	public void insertData(Klient klient);
	public List<Klient> getKlientList();
	public void deleteData(String id);
	public Klient getKlient(String id);
	public void updateData(Klient klient);
	

}
