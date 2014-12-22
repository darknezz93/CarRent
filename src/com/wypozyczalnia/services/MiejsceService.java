package com.wypozyczalnia.services;

import java.util.List;
import com.wypozyczalnia.domain.Miejsce;

public interface MiejsceService {
	
	public void insertData(Miejsce miejsce);
	public List<Miejsce> getMiejsceList();
	public void deleteData(String id);
	public Miejsce getMiejsce(String id);
	public void updateData(Miejsce miejsce);
	

}
