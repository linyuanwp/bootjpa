package com.bootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bootjpa.dao.AlienRepo;
import com.bootjpa.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	/*
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam String aname) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		List<Alien> alienList = repo.findByAname(aname);
		mv.addObject(alienList.get(0));
		return mv;
	}
		
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		List<Alien> alienList = repo.findByAidGreaterThan(aid);
		mv.addObject(alienList.get(0));
		return mv;
	}
	
		*/
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam String aname) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		List<Alien> alienList = repo.findByAnameSorted(aname);
		System.out.println(alienList);
		mv.addObject(alienList.get(0));
		return mv;
	}

}
