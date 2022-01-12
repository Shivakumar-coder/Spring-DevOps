package com.thbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@RequestMapping("/index")
	public String showIndexPage()
	{
		return "index";
	}
	@RequestMapping("/forgetPassword")
	public String showForgetPassword()
	{
		return "forget";
	}
	
	@RequestMapping("/gold")
	public String showGoldPage()
	{
		return "customer";
	}
	@RequestMapping("/silver")
	public String showSilverPage()
	{
		return "silver";
	}
	@RequestMapping("/diamond")
	public String showDiamondPage()
	{
		return "diamond";
	}
	@RequestMapping("/platinum")
	public String showPlatinumPage()
	{
		return "platinum";
	}
	@RequestMapping("/about")
	public String showAboutPage()
	{
		return "about";
	}
	
//hi




	

}
