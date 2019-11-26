package com.aerotops.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aerotops.model.Booking;
import com.aerotops.service.AerotopsService;

@Controller
public class AeroTopsFareController {
	@Autowired
	private Booking booking;
	
	@Autowired
	private AerotopsService service;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(path="calculateFare.do")
	public String calculateFare()
	{
		booking=(Booking) session.getAttribute("booking");
		
		String classType=(String) session.getAttribute("classType");
		
		double fare=service.findFare(booking.getFlightId(), classType);
		fare=booking.getNoOfTickets()*fare;
		session.setAttribute("fare", fare);

		return "TicketsAvailable";
	}
}