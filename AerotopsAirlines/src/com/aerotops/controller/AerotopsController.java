package com.aerotops.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aerotops.model.Booking;
import com.aerotops.model.User;
import com.aerotops.service.AerotopsService;

@Controller
public class AerotopsController {

	@Autowired
	private User user;
	
	@Autowired
	private Booking booking;
	
	@Autowired
	private AerotopsService service;
	
	@RequestMapping(path="/")
	public String homePage(){
		return "Home";
	}
	
	
	
	@RequestMapping(path="homePage")
	public String homePg(){
		return "Home";
	}
	
	
	
	@RequestMapping(path="AboutUsPage")
	public String aboutUs(){
		return "AboutUs";
	}
	
	@RequestMapping(path="ContactUsPage")
	public String contactUs(){
		return "ContactUs";
	}
	
	
	
	
	
	@RequestMapping(path="addUserPage")
	public String addUserPage()
	{
		return "AddUser";
	}
	
	@RequestMapping(path="addUser.do", method=RequestMethod.POST)
	public String addUser(User user)
	{
		boolean result=service.addUser(user);
		
		if(result)
		{
			return "Home";
		}
		else 
		{
			return "error";
		}
	}
	
	
	
	
}
