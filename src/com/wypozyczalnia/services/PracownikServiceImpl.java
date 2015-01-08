package com.wypozyczalnia.services;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;  
import com.wypozyczalnia.dao.PracownikDao;  
import com.wypozyczalnia.domain.Pracownik;  

public class PracownikServiceImpl implements PracownikService {
	
	@Autowired
	PracownikDao Pracownikdao;
	
	@Override
	public void insertData(Pracownik Pracownik){
		Pracownikdao.insertData(Pracownik);
	}
	
	@Override
	public List<Pracownik> getPracownikList(){
		return Pracownikdao.getPracownikList();
	}
	
	@Override
	public void deleteData(String id){
		Pracownikdao.deleteData(id);
	}
	
	@Override
	public Pracownik getPracownik(String id){
		return Pracownikdao.getPracownik(id);
	}
	
	@Override
	public void updateData(Pracownik pracownik){
		Pracownikdao.updateData(pracownik);
	}
	
	@Override
	public void deletePracownikLowestSalary(){
		Pracownikdao.deletePracownikLowestSalary();
	}
	

}
