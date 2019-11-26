package com.aerotops.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aerotops.model.Admin;
import com.aerotops.model.Flight;
import com.aerotops.model.FlightClass;
import com.aerotops.service.AerotopsService;

@Controller
public class AerotopsAdminController {

	@Autowired
	private AerotopsService service;
	
	
	@Autowired
	private Admin admin;
	
	@Autowired
	private Flight flight;
	
	@Autowired
	private FlightClass flightclassBC,flightclassFC,flightclassEC;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(path="AdminPage")
	public String AdminPage(){
		return "AdminLogin";
	}
	
	//
	@RequestMapping(path="validateLogin", method=RequestMethod.GET)
	public String validateLogin(@RequestParam("uname") String username, @RequestParam("pwd") String password,HttpServletRequest request)
		{
		request.getSession(true);
	
	    boolean result = service.checkLogin(username,password );
		if(result){
			
			session.setAttribute("uname", username);
			return "AdminHome";
		}
		else{
			return "error";
		}

	}
	
	
	@RequestMapping(path="logoutPage", method=RequestMethod.GET)
	public String logoutPage(HttpServletRequest request){
		HttpSession session = request.getSession(false);
		session.invalidate();
		return "Logout";
		
	}
	
	@RequestMapping(path="addFlightPage", method=RequestMethod.GET)
	public String addFlightPage(){
		return "AddFlight";
	}
	
	@RequestMapping(path="addFlight.do", method=RequestMethod.POST)
	public String addFlight(Flight flight) 	    
	{	
		boolean result = service.addFlight(flight);
		
		if(result){
			session.setAttribute("flight",flight);
		
			return "redirect:addClassPage";
		}
		return "Error";
	}
	
	@RequestMapping(path="addClassPage", method=RequestMethod.GET)
	public String addClassPage(){
		return "AddClass";
	}
	
	@RequestMapping(path="addClass.do", method=RequestMethod.POST)
	public String addClass(@RequestParam("classTypeFC") String classTypeFC,
			@RequestParam("classTypeBC") String classTypeBC,
			@RequestParam("classTypeEC") String classTypeEC,
			
			@RequestParam("baseFareFC") Double baseFareFC,
			@RequestParam("baseFareBC") Double baseFareBC,
			@RequestParam("baseFareEC") Double baseFareEC,
			
			@RequestParam("maxseatsFC") int maxseatsFC,
			@RequestParam("maxseatsBC") int maxseatsBC,
			@RequestParam("maxseatsEC") int maxseatsEC,
			
			@RequestParam("availseatsFC") int availseatsFC,
			@RequestParam("availseatsBC") int availseatsBC,
			@RequestParam("availseatsEC") int availseatsEC	

			) 	    
	{	
		

		Flight flight=(Flight)session.getAttribute("flight");
		
		int flightId = flight.getFlightId();
		flight=service.findFlight(flightId);
		
		session.setAttribute("flight",flight);
		flightclassFC.setFlight(flight);
		flightclassBC.setFlight(flight);
		flightclassEC.setFlight(flight);

		
		session.setAttribute("flightclass",flightclassFC);
		session.setAttribute("flightclass",flightclassBC);
		session.setAttribute("flightclass",flightclassEC);
		
		flightclassFC.setClassType(classTypeFC);
		flightclassFC.setBaseFare(baseFareFC);
		flightclassFC.setAvailseats(availseatsFC);
		flightclassFC.setMaxseats(maxseatsFC);
		
		boolean result = service.addClass(flightclassFC);
		
		
		 flightclassBC.setClassType(classTypeBC);
		flightclassBC.setBaseFare(baseFareBC);
		flightclassBC.setAvailseats(availseatsBC);
		flightclassBC.setMaxseats(maxseatsBC);
		
		boolean result1 = service.addClass(flightclassBC);

		flightclassEC.setClassType(classTypeEC);
		flightclassEC.setBaseFare(baseFareEC);
		flightclassEC.setAvailseats(availseatsEC);
		flightclassEC.setMaxseats(maxseatsEC);
		
		boolean result2 = service.addClass(flightclassEC);
		
		if(result && result1 && result2){
			return "redirect:viewClass.do";
		}
		return "Error";
	}
	
	
	
	@RequestMapping(path="cancelFlightPage", method=RequestMethod.GET)
	public String cancelFlightPage(){
		return "CancelFlight";
	}
	
	@RequestMapping(path="cancelFlight.do", method=RequestMethod.POST)
	public String cancelFlight(@RequestParam("flightId") int flightId)	    
	{	
		boolean result = service.cancelFlight(flightId);
		if(result){
			return "redirect:viewFlight.do";
		}
		return "Error";
	}	
	
	@RequestMapping(path="viewFlight.do", method=RequestMethod.GET)
	public String viewFlight(Model model){
		List<Flight> list = service.findAllFlights();
		model.addAttribute("flightlist", list);
		return "ViewFlight";
	}
	
	@RequestMapping(path="viewClass.do", method=RequestMethod.GET)
	public String viewClass(Model model){
		List<FlightClass> list = service.findAllCLass();
		model.addAttribute("flightclasslist", list);
		return "ViewClass";
	}
	
}

