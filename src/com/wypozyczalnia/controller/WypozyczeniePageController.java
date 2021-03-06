package com.wypozyczalnia.controller;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.dao.DataAccessException;
import org.springframework.jca.cci.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.servlet.ModelAndView;  

import com.wypozyczalnia.domain.Klient;
import com.wypozyczalnia.domain.Miejsce;
import com.wypozyczalnia.domain.Pracownik;
import com.wypozyczalnia.domain.Samochod;
import com.wypozyczalnia.domain.Wypozyczenie;
import com.wypozyczalnia.jdbc.KlientRowMapper;
import com.wypozyczalnia.jdbc.PracownikRowMapper;
import com.wypozyczalnia.jdbc.SamochodRowMapper;
import com.wypozyczalnia.jdbc.WypozyczenieRowMapper;
import com.wypozyczalnia.services.KlientService;
import com.wypozyczalnia.services.MiejsceService;
import com.wypozyczalnia.services.PracownikService;
import com.wypozyczalnia.services.SamochodService;
import com.wypozyczalnia.services.WypozyczenieService;  


@Controller
public class WypozyczeniePageController {
	
	@Autowired 
	WypozyczenieService wypozyczenieService;
	@Autowired 
	KlientService klientService;
	@Autowired 
	SamochodService samochodService;
	@Autowired 
	PracownikService pracownikService;
	@Autowired 
	MiejsceService miejsceService;
	@Autowired 
	DataSource dataSource;
	
	@RequestMapping("/registerWypozyczenie")
	public ModelAndView registerWypozyczenie(@ModelAttribute Wypozyczenie wypozyczenie){
			
		List<Klient> listaKlientow = klientService.getKlientList();
		List<Samochod> listaSamochodow = samochodService.getSamochodList();
		List<Pracownik> listaPracownikow = pracownikService.getPracownikList();
		List<Miejsce> listaMiejsc = miejsceService.getMiejsceList();
		
		Map<String, List> map = new HashMap<String, List>();
		map.put("klient", listaKlientow);
		map.put("pracownik", listaPracownikow);
		map.put("samochod", listaSamochodow);
		map.put("miejsce", listaMiejsc);
		System.out.println(listaKlientow);
		
		return new ModelAndView("registerWypozyczenie", "map", map);
	}
	
	@RequestMapping("/insertWypozyczenie")
	public String insertData(@ModelAttribute Wypozyczenie wypozyczenie){
		try
		{
			if(wypozyczenie != null)
				wypozyczenieService.insertData(wypozyczenie);
			return "redirect:/getWypozyczenie";
		}
		catch (InvalidResultSetAccessException e) 
		{
			System.out.println("Niepoprawne dane");
		    //throw new RuntimeException(e);
		    return "redirect:/registerWypozyczenie";
		} 
		catch (DataAccessException e)
		{
			System.out.println("Niepoprawne dane");
		    //throw new RuntimeException(e);
			return "redirect:/registerWypozyczenie";
		}
	}
	
	@RequestMapping("/getWypozyczenie")
	public ModelAndView getWypozyczenieList(){
		List<Wypozyczenie> wypozyczenieList = wypozyczenieService.getWypozyczenieList();
		return new ModelAndView("wypozyczenieList", "wypozyczenieList", wypozyczenieList);
	}
	
	@RequestMapping("/editWypozyczenie")
	public ModelAndView editWypozyczenie(@RequestParam String id, @ModelAttribute Wypozyczenie wypozyczenie){
		
		wypozyczenie = wypozyczenieService.getWypozyczenie(id);
		
		List<Klient> listaKlientow = klientService.getKlientList();
		List<Samochod> listaSamochodow = samochodService.getSamochodList();
		List<Pracownik> listaPracownikow = pracownikService.getPracownikList();
		List<Miejsce> listaMiejsc = miejsceService.getMiejsceList();
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("klient", listaKlientow);
		map.put("pracownik", listaPracownikow);
		map.put("samochod", listaSamochodow);
		map.put("miejsce", listaMiejsc);
		
		
		map.put("wypozyczenie", wypozyczenie);
		return new ModelAndView("editWypozyczenie", "map", map);
	}
	
	@RequestMapping("/updateWypozyczenie")
	public String updateWypozyczenie(@ModelAttribute Wypozyczenie wypozyczenie){
		
		try
		{
			wypozyczenieService.updateData(wypozyczenie);
			return "redirect:/getWypozyczenie";
		}
		catch (InvalidResultSetAccessException e) 
		{
			System.out.println("Niepoprawne dane");
		    //throw new RuntimeException(e);
		    return "redirect:/getWypozyczenie";
		} 
		catch (DataAccessException e)
		{
			System.out.println("Niepoprawne dane");
		    //throw new RuntimeException(e);
			return "redirect:/getWypozyczenie";
		}
		

	}
	
	@RequestMapping("/deleteWypozyczenie")
	public String deleteWypozyczenie(@RequestParam String id){
		System.out.println("id = " + id);
		wypozyczenieService.deleteData(id);
		return "redirect:/getWypozyczenie";
	}

}
