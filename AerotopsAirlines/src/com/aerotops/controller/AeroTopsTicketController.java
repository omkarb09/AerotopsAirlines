package com.aerotops.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aerotops.model.Booking;
import com.aerotops.model.Ticket;
import com.aerotops.model.User;
import com.aerotops.service.AerotopsService;

@Controller
public class AeroTopsTicketController
{
	@Autowired
	private AerotopsService service;
	
	@Autowired
	private Ticket ticket;
	
	@Autowired
	private Booking booking;
	
	@Autowired
	HttpSession session;
	
	
	@RequestMapping(path="addTicket.do")
	public String addTicket(Ticket ticket)
	{
		
		
		
		booking=(Booking) session.getAttribute("booking");
		ticket.setBooking(booking);
		
		
		boolean result=service.addTicket(ticket);
		
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
