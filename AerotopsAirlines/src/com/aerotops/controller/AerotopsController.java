package com.aerotops.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aerotops.model.Booking;
import com.aerotops.model.Flight;
import com.aerotops.model.User;
import com.aerotops.service.AerotopsService;

@Controller
public class AerotopsController {

	@Autowired
	private User user;
	
	@Autowired
	private Booking booking;
	
	@Autowired
	private Flight flight;
	
	@Autowired
	HttpSession session;
	
	@Autowired
	private AerotopsService service;
	
	@RequestMapping(path="searchFlight")
	public String searchFlightPage(){
		return "SearchFlight";
		
	}
	
	@RequestMapping(path="selectFlight")
	public String selectFlightPage()
	{
		return "SelectFlight";
	}
	
	//Search Flight Module
	@RequestMapping(path="selectFlight.do", method=RequestMethod.POST)
	public String selectFlight(@RequestParam("from") String from,@RequestParam("to") String to,Model model2) 	    
	{	
		List<Flight> list = service.findAllFlights(from,to);
		model2.addAttribute("selflightlist", list);
		System.out.println("after model");
		if(list.size()!=0){
			System.out.println("in list");
			return "ViewSearchedFlightUser";
		}
		else
		{
			return "Error";
		}
		
	}
	
	@RequestMapping(path="selectedFlight.do", method=RequestMethod.POST)
	public String selectedFlight(@RequestParam("flightId") String flightId,@RequestParam("from") String from,@RequestParam("to") String to) 	    
	{	
		session.setAttribute("setflightId", flightId);
		session.setAttribute("setfrom", from);
		session.setAttribute("setto", to);
		return "redirect:bookingPage";
	}
	
	
	@RequestMapping(path="searchFlight.do", method=RequestMethod.POST)
	public String searchFlight(@RequestParam("from") String from,@RequestParam("to") String to,Model model) 	    
	{	
		List<Flight> list = service.findAllFlights(from,to);
		model.addAttribute("flightlist", list);
		if(list.size()!=0){
			return "ViewFlight";
		}
		return "Error";
	}
	
	
	@RequestMapping(path="/")
	public String homePage(){
		return "Home";
	}
	
	
	
	@RequestMapping(path="homePage")
	public String homePg(){
		return "Home";
	}
	
	
	@RequestMapping(path="userPage")
	public String userPg(){
		return "SuccessfulUserLogin";
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
			return "Error";
		}
	}
	@ExceptionHandler({Exception.class})
	public String handleException()
	{
		return "Error";
	}
	
	
	
	
}
