package com.wypozyczalnia.services;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;  
import com.wypozyczalnia.dao.KlientDao;  
import com.wypozyczalnia.domain.Klient;  

public class KlientServiceImpl implements KlientService {
	
	@Autowired
	KlientDao klientdao;
	
	@Override
	public void insertData(Klient klient){
		klientdao.insertData(klient);
	}
	
	@Override
	public List<Klient> getKlientList(){
		return klientdao.getKlientList();
	}
	
	
	@Override
	public void deleteData(String id){
		klientdao.deleteData(id);
	}
	
	@Override
	public Klient getKlient(String id){
		return klientdao.getKlient(id);
	}
	
	@Override
	public void updateData(Klient klient){
		klientdao.updateData(klient);
	}
	

}
