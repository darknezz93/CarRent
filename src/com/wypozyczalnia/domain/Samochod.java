package com.wypozyczalnia.domain;

public class Samochod {
	
	private int id_samochodu;
	private int cena_za_dobe;
	private String marka;
	private int rok_produkcji;
	private String kolor;
	private int przebieg;
	private float pojemnosc_silnika;
	
	public int getId_samochodu(){
		return id_samochodu;
	}
	
	public void setId_samochodu(int id_samochodu){
		this.id_samochodu = id_samochodu;
	}
	
	public int getCena_za_dobe(){
		return cena_za_dobe;
	}
	
	public void setCena_za_dobe(int cena_za_dobe){
		this.cena_za_dobe = cena_za_dobe;
	}
	
	public String getMarka(){
		return marka;
	}
	
	public void setMarka(String marka){
		this.marka = marka;
	}
	
	public int getRok_produkcji(){
		return rok_produkcji;
	}
	
	public void setRok_produkcji(int rok_produkcji){
		this.rok_produkcji = rok_produkcji;
	}
	
	public String getKolor(){
		return kolor;
	}
	
	public void setKolor(String kolor){
		this.kolor = kolor;
	}
	
	public int getPrzebieg(){
		return przebieg;
	}
	
	public void setPrzebieg(int przebieg){
		this.przebieg = przebieg;
	}
	
	public float getPojemnosc_silnika(){
		return pojemnosc_silnika;
	}
	
	public void setPojemnosc_silnika(float pojemnosc_silnika){
		this.pojemnosc_silnika = pojemnosc_silnika;
	}
	

}
