package com.wypozyczalnia.domain;

public class Wypozyczenie {
	
	private int id_wypozyczenia;
	private String data_wypozyczenia;
	private int Samochod_id_samochodu;
	private int Miejsce_id_miejsca;
	private int Pracownik_id_pracownika;
	private int Klient_id_klienta;
	public String nazwisko_klienta;
	public String nazwa_samochodu;
	public String nazwisko_pracownika;
	public String miejsce_ulica;
	public String imie_klienta;
	public String imie_pracownika;
	
	
	public int getId_wypozyczenia(){
		return id_wypozyczenia;
	}
	
	public void setId_wypozyczenia(int id_wypozyczenia){
		this.id_wypozyczenia = id_wypozyczenia;
	}
	
	public String getData_wypozyczenia(){
		return data_wypozyczenia;
	}
	
	public void setData_wypozyczenia(String data_wypozyczenia){
		this.data_wypozyczenia = data_wypozyczenia;
	}
	
	public int getSamochod_id_samochodu(){
		return Samochod_id_samochodu;
	}
	
	public void setSamochod_id_samochodu(int Samochod_id_samochodu){
		this.Samochod_id_samochodu = Samochod_id_samochodu;
	}
	
	public int getMiejsce_id_miejsca(){
		return Miejsce_id_miejsca;
	}
	
	public void setMiejsce_id_miejsca(int Miejsce_id_miejsca){
		this.Miejsce_id_miejsca = Miejsce_id_miejsca;
	}
	
	public int getPracownik_id_pracownika(){
		return Pracownik_id_pracownika;
	}
	
	public void setPracownik_id_pracownika(int Pracownik_id_pracownika){
		this.Pracownik_id_pracownika = Pracownik_id_pracownika;
	}
	
	public int getKlient_id_klienta(){
		return Klient_id_klienta;
	}
	
	public void setKlient_id_klienta(int Klient_id_klienta){
		this.Klient_id_klienta = Klient_id_klienta;
	}
	
	
	public String getNazwisko_klienta(){
		return nazwisko_klienta;
	}
	
	public void setNazwisko_klienta(String nazwisko_klienta){
		this.nazwisko_klienta = nazwisko_klienta;
	}
	
	public String getNazwa_samochodu(){
		return nazwa_samochodu;
	}
	
	public void setNazwa_samochodu(String nazwa_samochodu){
		this.nazwa_samochodu = nazwa_samochodu;
	}
	
	
	public String getNazwisko_pracownika(){
		return nazwisko_pracownika;
	}
	
	public void setNazwisko_pracownika(String nazwisko_pracownika){
		this.nazwisko_pracownika = nazwisko_pracownika;
	}
	
	public String getMiejsce_ulica(){
		return miejsce_ulica;
	}
	
	public void setMiejsce_ulica(String miejsce_ulica){
		this.miejsce_ulica = miejsce_ulica;
	}
	
	public String getImie_pracownika(){
		return imie_pracownika;
	}
	
	public void setImie_pracownika(String imie_pracownika){
		this.imie_pracownika = imie_pracownika;
	}
	
	public String getImie_klienta(){
		return imie_klienta;
	}
	
	public void setImie_klienta(String imie_klienta){
		this.imie_klienta = imie_klienta;
	}
	
	

}
