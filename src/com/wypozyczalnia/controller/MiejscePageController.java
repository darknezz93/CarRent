package com.wypozyczalnia.controller;

import java.lang.reflect.Array;
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

import com.wypozyczalnia.domain.Miejsce;
import com.wypozyczalnia.services.MiejsceService;  


@Controller
public class MiejscePageController {
	
	@Autowired 
	MiejsceService miejsceService;
	
	@RequestMapping("/registerMiejsce")
	public ModelAndView registerMiejsce(@ModelAttribute Miejsce Miejsce){
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("Poznañ");
		cityList.add("Warszawa");
		cityList.add("Wroclaw");
		cityList.add("Krakow");
		cityList.add("Gdañsk");
		
		Map<String, List> map = new HashMap<String, List>();
		map.put("cityList", cityList);
		return new ModelAndView("registerMiejsce","map",map);
	}
	
	@RequestMapping("/insertMiejsce")
	public String insertData(@ModelAttribute Miejsce Miejsce){
		if(Miejsce != null)
			miejsceService.insertData(Miejsce);
		return "redirect:/getMiejsce";
	}
	
	@RequestMapping("/getMiejsce")
	public ModelAndView getMiejsceList(){
		List<Miejsce> MiejsceList = miejsceService.getMiejsceList();
		return new ModelAndView("miejsceList", "miejsceList", MiejsceList);
	}
	
	@RequestMapping("/editMiejsce")
	public ModelAndView editMiejsce(@RequestParam String id, @ModelAttribute Miejsce miejsce){
		
		miejsce = miejsceService.getMiejsce(id);
		
		List<String>cityList =  new ArrayList<String>();
		cityList.add("Poznañ");
		cityList.add("Warszawa");
		cityList.add("Wroc³aw");
		cityList.add("Gdañsk");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cityList", cityList);
		map.put("miejsce", miejsce);
		return new ModelAndView("editMiejsce", "map", map);
	}
	
	@RequestMapping("/updateMiejsce")
	public String updateMiejsce(@ModelAttribute Miejsce miejsce){
		miejsceService.updateData(miejsce);
		return "redirect:/getMiejsce";
	}
	
	@RequestMapping("/deleteMiejsce")
	public String deleteMiejsce(@RequestParam String id){
		System.out.println("id = " + id);
		miejsceService.deleteData(id);
		return "redirect:/getMiejsce";
	}

}
