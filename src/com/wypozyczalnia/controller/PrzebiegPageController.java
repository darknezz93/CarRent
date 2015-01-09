package com.wypozyczalnia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wypozyczalnia.domain.Przebieg;
import com.wypozyczalnia.services.PrzebiegService;

@Controller
public class PrzebiegPageController {
	
	@Autowired 
	PrzebiegService PrzebiegService;
	
	
	@RequestMapping("/getPrzebieg")
	public ModelAndView getSamochodList(){
		List<Przebieg> PrzebiegList = PrzebiegService.getSamochodCourse();
		return new ModelAndView("przebiegList", "przebiegList", PrzebiegList);
	}

}
