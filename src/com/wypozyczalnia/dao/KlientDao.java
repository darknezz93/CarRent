package com.wypozyczalnia.dao;

import java.util.List;
import com.wypozyczalnia.domain.Klient;

public interface KlientDao {
	
	public void insertData(Klient data);
	public List<Klient> getKlientList();
	public void updateData(Klient klient);
	public void deleteData(String id);
	public Klient getKlient(String id);
	
	

}
