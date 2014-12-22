package com.wypozyczalnia.domain;

public class Miejsce {
	
	private int id_miejsca;
	private String ulica;
	private int numer;
	private String miasto;
	
	public int getId_miejsca(){
		return id_miejsca;
	}
	
	public void setId_miejsca(int id_miejsca){
		this.id_miejsca = id_miejsca;
	}
	
	public String getUlica(){
		return ulica;
	}
	
	public void setUlica(String ulica){
		this.ulica = ulica;
	}
	
	public int getNumer(){
		return numer;
	}
	
	public void setNumer(int numer){
		this.numer = numer;
	}
	
	public String getMiasto(){
		return miasto;
	}
	
	public void setMiasto(String miasto){
		this.miasto = miasto;
	}

}
