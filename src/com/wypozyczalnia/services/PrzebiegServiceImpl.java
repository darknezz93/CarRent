package com.wypozyczalnia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wypozyczalnia.dao.PrzebiegDao;
import com.wypozyczalnia.domain.Przebieg;


public class PrzebiegServiceImpl implements PrzebiegService {
	
	@Autowired
	PrzebiegDao Przebiegdao;
	
	@Override
	public List<Przebieg> getSamochodCourse(){
		return Przebiegdao.getSamochodCourse();
	}

}
