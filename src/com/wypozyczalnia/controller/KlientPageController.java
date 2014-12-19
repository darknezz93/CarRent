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

import com.wypozyczalnia.domain.Klient;
import com.wypozyczalnia.services.KlientService;  


@Controller
public class KlientPageController {
	
	@Autowired 
	KlientService klientService;
	
	@RequestMapping("/register")
	public ModelAndView registerKlient(@ModelAttribute Klient klient){
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("poznan");
		cityList.add("warszawa");
		cityList.add("wroclaw");
		cityList.add("krakow");
		
		Map<String, List> map = new HashMap<String, List>();
		map.put("cityList", cityList);
		return new ModelAndView("register","map",map);
	}
	
	@RequestMapping("/insert")
	public String insertData(@ModelAttribute Klient klient){
		if(klient != null)
			klientService.insertData(klient);
		return "redirect:/getKlient";
	}
	
	@RequestMapping("/getKlient")
	public ModelAndView getKlientList(){
		List<Klient> klientList = klientService.getKlientList();
		return new ModelAndView("klientList", "klientList", klientList);
	}
	
	@RequestMapping("/edit")
	public ModelAndView editKlient(@RequestParam String id, @ModelAttribute Klient klient){
		
		klient = klientService.getKlient(id);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("klient", klient);
		return new ModelAndView("edit", "map", map);
	}
	
	@RequestMapping("/update")
	public String updateKlient(@ModelAttribute Klient klient){
		klientService.updateData(klient);
		return "redirect:/getKlient";
	}
	
	@RequestMapping("/delete")
	public String deleteKlient(@RequestParam String id){
		System.out.println("id = " + id);
		klientService.deleteData(id);
		return "redirect:/getKlient";
	}

}
