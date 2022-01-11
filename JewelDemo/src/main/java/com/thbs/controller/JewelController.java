package com.thbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thbs.entity.Jewels;
import com.thbs.repository.JewelRepository;

@Controller
public class JewelController {
	
	@Autowired
	JewelRepository jewelRepo;
	
//	Showing Seller page
	
	@RequestMapping("/seller")
	public String showSellerHome()
	{
		return "seller";
		
	}
//	Adding jewels into database
//	Values taken from seller.html page using POST method 
	@RequestMapping("/addJewel")
	public String addJewel(@ModelAttribute("jewels") Jewels j )
	{		
		jewelRepo.save(j);
		System.out.println("Jewel Added Successfully");
		return "seller";
	}
	

}
