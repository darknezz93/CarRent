package com.wypozyczalnia.services;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;  
import com.wypozyczalnia.dao.MiejsceDao;  
import com.wypozyczalnia.domain.Miejsce;  

public class MiejsceServiceImpl implements MiejsceService {
	
	@Autowired
	MiejsceDao miejscedao;
	
	@Override
	public void insertData(Miejsce miejsce){
		miejscedao.insertData(miejsce);
	}
	
	@Override
	public List<Miejsce> getMiejsceList(){
		return miejscedao.getMiejsceList();
	}
	
	@Override
	public void deleteData(String id){
		miejscedao.deleteData(id);
	}
	
	@Override
	public Miejsce getMiejsce(String id){
		return miejscedao.getMiejsce(id);
	}
	
	@Override
	public void updateData(Miejsce miejsce){
		miejscedao.updateData(miejsce);
	}
	

}
