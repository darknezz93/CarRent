package com.wypozyczalnia.domain;
import java.sql.Date;

public class Pracownik {
	
	private int id_pracownika;
	private String imie;
	private String nazwisko;
	private String data_zatrudnienia;
	private int pensja;
	private long telefon;
	
	public int getId_pracownika(){
		return id_pracownika;
	}
	
	public void setId_pracownika(int id_pracownika){
		this.id_pracownika = id_pracownika;
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
	
	public String getData_zatrudnienia(){
		return data_zatrudnienia;
	}
	
	public void setData_zatrudnienia(String data_zatrudnienia){
		this.data_zatrudnienia = data_zatrudnienia;
	}
	
	public int getPensja(){
		return pensja;
	}
	
	public void setPensja(int pensja){
		this.pensja = pensja;
	}
	
	public long getTelefon(){
		return telefon;
	}
	
	public void setTelefon(int telefon){
		this.telefon = telefon;
	}

	
}
