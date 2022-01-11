package com.thbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thbs.entity.Jewels;
import com.thbs.repository.JewelRepository;
import com.thbs.service.JewelleryService;

@Controller
public class DisplayController {
	@Autowired
	JewelRepository jewelRepo;
	@Autowired
	JewelleryService service;
	
	@RequestMapping("/showAll")
	public String showItems(Model model)
	{
		List<Jewels> jewelList= service.allJewels();
		
		model.addAttribute("jewelList", jewelList);
		
		return "showItems";
	}

}
