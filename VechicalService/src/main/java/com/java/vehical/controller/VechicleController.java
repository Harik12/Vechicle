package com.java.vehical.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.java.vehical.entity.Vechicle;
import com.java.vehical.vechicleService.VechicleService;

@RestController
@RequestMapping(value="/api")
public class VechicleController {
	@Autowired
	private VechicleService vechicleService;
	
	@RequestMapping(value="/getform",method=RequestMethod.GET)
	public ModelAndView getForm() {
		ModelAndView mv= new ModelAndView("index");
		return mv;
	}
	@RequestMapping(value="/getform",method=RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("vechicle") Vechicle vechicle2) {
		ModelAndView mv= new ModelAndView("result");
	
		
		vechicleService.saveDate(vechicle2);
		
		return mv;
		
		
	}
	@RequestMapping(value="/admin/get",method=RequestMethod.GET)
	public Iterable<Vechicle> getAll(Vechicle vechicle) {
		
		return vechicleService.getAll(vechicle);
		
		
	}
	@RequestMapping(value="/admin/get/{id}",method=RequestMethod.GET)
	 public Optional<Vechicle> getById(@PathVariable("id")Integer id) {
		 
		 return vechicleService.getById(id);
	 }
	@DeleteMapping(value="/manager/del/{id}")
	public void deletByid(@PathVariable("id")Integer id) {
		
		 vechicleService.deletebyId(id);
	}
	 

	
}
