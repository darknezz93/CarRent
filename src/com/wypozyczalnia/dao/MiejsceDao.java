package com.wypozyczalnia.dao;

import java.util.List;
import com.wypozyczalnia.domain.Miejsce;

public interface MiejsceDao {
	
	public void insertData(Miejsce data);
	public List<Miejsce> getMiejsceList();
	public void updateData(Miejsce miejsce);
	public void deleteData(String id);
	public Miejsce getMiejsce(String id);
	
	

}
