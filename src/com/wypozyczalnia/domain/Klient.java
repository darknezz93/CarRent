package com.wypozyczalnia.domain;

public class Klient {
	
	private int id_klienta;
	private String imie;
	private String nazwisko;
	private int telefon;
	private String ulica;
	private int numer;
	private String miasto;
	
	public int getId_klienta(){
		return id_klienta;
	}
	
	public void setId_klienta(int id_klienta){
		this.id_klienta = id_klienta;
	}
	
	public String getImie(){
		return imie;
	}
	
	public void setImie(String imie){
		this.imie = imie;
	}
	
	public String getNazwisko(){
		return nazwisko;
	}
	
	public void setNazwisko(String nazwisko){
		this.nazwisko = nazwisko;
	}
	
	public int getTelefon(){
		return telefon;
	}
	
	public void setTelefon(int telefon){
		this.telefon = telefon;
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
