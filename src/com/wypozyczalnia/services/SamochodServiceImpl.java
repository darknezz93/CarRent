package com.wypozyczalnia.services;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;  
import com.wypozyczalnia.dao.SamochodDao;  
import com.wypozyczalnia.domain.Samochod;  

public class SamochodServiceImpl implements SamochodService {
	
	@Autowired
	SamochodDao Samochoddao;
	
	@Override
	public void insertData(Samochod Samochod){
		Samochoddao.insertData(Samochod);
	}
	
	@Override
	public List<Samochod> getSamochodList(){
		return Samochoddao.getSamochodList();
	}
	
	@Override
	public void deleteData(String id){
		Samochoddao.deleteData(id);
	}
	
	@Override
	public Samochod getSamochod(String id){
		return Samochoddao.getSamochod(id);
	}
	
	@Override
	public void updateData(Samochod Samochod){
		Samochoddao.updateData(Samochod);
	}
	

}
