package com.wypozyczalnia.controller;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  

import javax.activation.DataSource;

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
import com.wypozyczalnia.jdbc.KlientRowMapper;
import com.wypozyczalnia.services.KlientService;  


@Controller
public class KlientPageController {
	
	@Autowired 
	KlientService klientService;
	
	@RequestMapping("/registerKlient")
	public ModelAndView registerKlient(@ModelAttribute Klient klient){
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("poznan");
		cityList.add("warszawa");
		cityList.add("wroclaw");
		cityList.add("krakow");
		
		Map<String, List> map = new HashMap<String, List>();
		map.put("cityList", cityList);
		return new ModelAndView("registerKlient","map",map);
	}
	
	@RequestMapping("/insertKlient")
	public String insertData(@ModelAttribute Klient klient){
		if(klient != null)
			klientService.insertData(klient);
		return "redirect:/getKlient";
	}
	
	@RequestMapping("/getKlient")
	public ModelAndView getKlientList(){
		List<Klient> klientList = klientService.getKlientList();
		System.out.println(klientList);
		return new ModelAndView("klientList", "klientList", klientList);
	
	}
	
	@RequestMapping("/editKlient")
	public ModelAndView editKlient(@RequestParam String id, @ModelAttribute Klient klient){
		
		klient = klientService.getKlient(id);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("klient", klient);
		return new ModelAndView("editKlient", "map", map);
	}
	
	@RequestMapping("/updateKlient")
	public String updateKlient(@ModelAttribute Klient klient){
		klientService.updateData(klient);
		return "redirect:/getKlient";
	}
	
	@RequestMapping("/deleteKlient")
	public String deleteKlient(@RequestParam String id){
		
		try
		{
			System.out.println("id = " + id);
			klientService.deleteData(id);
			return "redirect:/getKlient";
		}
		catch (InvalidResultSetAccessException e) 
		{
			System.out.println("Klucz obcy");
		    //throw new RuntimeException(e);
		    return "redirect:/getKlient";
		} 
		catch (DataAccessException e)
		{
			System.out.println("Klucz obcy");
		    //throw new RuntimeException(e);
			return "redirect:/getKlient";
		}

	}

}
