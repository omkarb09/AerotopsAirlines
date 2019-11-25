package com.aerotops.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aerotops.model.Booking;
import com.aerotops.service.AerotopsService;

@Controller
public class AeroTopsCheckSeatsController {
	
	@Autowired
	private AerotopsService service;
	
	@Autowired
	private Booking booking;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(path="checkTickets.do")
	public String checkAvailableTickets()
	{
		booking=(Booking) session.getAttribute("booking");
		
		String classType=(String) session.getAttribute("classType");
		
		boolean result=service.checkAvailableTickets(booking.getFlightId(), booking.getNoOfTickets(), classType);
		if(result)
		{
			return "redirect:calculateFare.do";
		}
		else
		{
			return "NotEnoughTickets";
		}

	}
	@ExceptionHandler({Exception.class})
	public String handleException()
	{
		return "Error";
	}
}
