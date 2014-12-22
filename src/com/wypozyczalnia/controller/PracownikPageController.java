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

import com.wypozyczalnia.domain.Pracownik;
import com.wypozyczalnia.services.PracownikService;  


@Controller
public class PracownikPageController {
	
	@Autowired 
	PracownikService PracownikService;
	
	@RequestMapping("/registerPracownik")
	public ModelAndView registerPracownik(@ModelAttribute Pracownik Pracownik){
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("poznan");
		cityList.add("warszawa");
		cityList.add("wroclaw");
		cityList.add("krakow");
		
		Map<String, List> map = new HashMap<String, List>();
		map.put("cityList", cityList);
		return new ModelAndView("registerPracownik","map",map);
	}
	
	@RequestMapping("/insertPracownik")
	public String insertData(@ModelAttribute Pracownik Pracownik){
		if(Pracownik != null)
			PracownikService.insertData(Pracownik);
		return "redirect:/getPracownik";
	}
	
	@RequestMapping("/getPracownik")
	public ModelAndView getPracownikList(){
		List<Pracownik> PracownikList = PracownikService.getPracownikList();
		return new ModelAndView("pracownikList", "pracownikList", PracownikList);
	}
	
	@RequestMapping("/editPracownik")
	public ModelAndView editPracownik(@RequestParam String id, @ModelAttribute Pracownik pracownik){
		
		pracownik = PracownikService.getPracownik(id);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pracownik", pracownik);
		return new ModelAndView("editPracownik", "map", map);
	}
	
	@RequestMapping("/updatePracownik")
	public String updatePracownik(@ModelAttribute Pracownik Pracownik){
		PracownikService.updateData(Pracownik);
		return "redirect:/getPracownik";
	}
	
	@RequestMapping("/deletePracownik")
	public String deletePracownik(@RequestParam String id){
		System.out.println("id = " + id);
		PracownikService.deleteData(id);
		return "redirect:/getPracownik";
	}

}
