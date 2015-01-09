package com.wypozyczalnia.controller;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.servlet.ModelAndView;  

import com.wypozyczalnia.domain.Samochod;
import com.wypozyczalnia.services.SamochodService;  


@Controller
public class SamochodPageController {
	
	@Autowired 
	SamochodService SamochodService;
	
	@RequestMapping("/registerSamochod")
	public ModelAndView registerSamochod(@ModelAttribute Samochod Samochod){
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("poznan");
		cityList.add("warszawa");
		cityList.add("wroclaw");
		cityList.add("krakow");
		
		Map<String, List> map = new HashMap<String, List>();
		map.put("cityList", cityList);
		return new ModelAndView("registerSamochod","map",map);
	}
	
	@RequestMapping("/insertSamochod")
	public String insertData(@ModelAttribute Samochod Samochod){
		if(Samochod != null)
			SamochodService.insertData(Samochod);
		return "redirect:/getSamochod";
	}
	
	@RequestMapping("/getSamochod")
	public ModelAndView getSamochodList(){
		List<Samochod> SamochodList = SamochodService.getSamochodList();
		return new ModelAndView("samochodList", "samochodList", SamochodList);
	}
	
	@RequestMapping("/editSamochod")
	public ModelAndView editSamochod(@RequestParam String id, @ModelAttribute Samochod samochod){
		
		samochod = SamochodService.getSamochod(id);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Samochod", samochod);
		return new ModelAndView("editSamochod", "map", map);
	}
	
	
	@RequestMapping("/updateSamochod")
	public String updateSamochod(@ModelAttribute Samochod Samochod){
		SamochodService.updateData(Samochod);
		return "redirect:/getSamochod";
	}
	
	@RequestMapping("/deleteSamochod")
	public String deleteSamochod(@RequestParam String id){
		System.out.println("id = " + id);
		SamochodService.deleteData(id);
		return "redirect:/getSamochod";
	}

}
