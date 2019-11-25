package com.aerotops.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aerotops.model.Booking;
import com.aerotops.model.User;
import com.aerotops.service.AerotopsService;

@Controller
public class AeroTopsBookingController {
	
	@Autowired
	private AerotopsService service;
	
	@Autowired
	private User user;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(path="bookingPage")
	public String bookingPage()
	{
		return "Booking";
	}
	
	//Booking Functionality committed
	@RequestMapping(path="addBooking.do", method=RequestMethod.POST)
	public String addBooking(Booking booking,@RequestParam("totalTickets") String totalTickets)
	{
		booking.setClassId(1);
		booking.setFlightId(4001);
		booking.setBookingDate(new Date());
		booking.setNoOfTickets(Integer.parseInt(totalTickets));
		//booking.setNoOfTickets(totalTickets);
		
		String email=(String)session.getAttribute("email");
		user=service.findUser(email);
		session.setAttribute("user",user);
		booking.setUser(user);
		
		session.setAttribute("booking", booking);
		
		//calling service method
		boolean result=service.addBooking(booking);
		if(result)
		{
			return "addTicket.do";
		}
		else
		{
			return "error";
		}
		
	}
}
