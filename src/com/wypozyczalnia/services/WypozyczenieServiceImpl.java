package com.wypozyczalnia.services;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;  

import com.wypozyczalnia.dao.WypozyczenieDao;  
import com.wypozyczalnia.domain.Samochod;
import com.wypozyczalnia.domain.Wypozyczenie;  

public class WypozyczenieServiceImpl implements WypozyczenieService {
	
	@Autowired
	WypozyczenieDao wypozyczeniedao;
	
	@Override
	public void insertData(Wypozyczenie wypozyczenie){
		wypozyczeniedao.insertData(wypozyczenie);
	}
	
	@Override
	public List<Wypozyczenie> getWypozyczenieList(){
		return wypozyczeniedao.getWypozyczenieList();
	}
	
	@Override
	public void deleteData(String id){
		wypozyczeniedao.deleteData(id);
	}
	
	@Override
	public Wypozyczenie getWypozyczenie(String id){
		return wypozyczeniedao.getWypozyczenie(id);
	}
	
	@Override
	public void updateData(Wypozyczenie wypozyczenie){
		wypozyczeniedao.updateData(wypozyczenie);
	}
	

}
