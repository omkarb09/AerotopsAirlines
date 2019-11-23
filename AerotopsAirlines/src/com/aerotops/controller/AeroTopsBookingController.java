package com.aerotops.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aerotops.model.Booking;
import com.aerotops.service.AerotopsService;

@Controller
public class AeroTopsBookingController {
	@Autowired
	private Booking booking;
	
	@Autowired
	private AerotopsService service;
	
	@RequestMapping(path="bookingPage")
	public String bookingPage()
	{
		return "Booking";
	}
	
	//Booking Functionality  Code
	@RequestMapping(path="addBooking.do", method=RequestMethod.POST)
	public String addBooking(Booking booking,@RequestParam("totalTickets") String totalTickets)
	{
		booking.setClassId(1);
		booking.setFlightId(4001);
		booking.setBookingDate(new Date());
		booking.setNoOfTickets(Integer.parseInt(totalTickets));
		//booking.setNoOfTickets(totalTickets);
		
		boolean result=service.addBooking(booking);
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
