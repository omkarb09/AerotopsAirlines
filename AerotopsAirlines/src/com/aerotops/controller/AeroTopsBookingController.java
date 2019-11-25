package com.aerotops.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.aerotops.model.Booking;
import com.aerotops.model.Flight;
import com.aerotops.model.User;
import com.aerotops.service.AerotopsService;
//This is booking controller
@Controller
public class AeroTopsBookingController {
	
	@Autowired
	private AerotopsService service;
	
	@Autowired
	private User user;
	
	@Autowired
	private Flight flight;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(path="bookingPage")
	public String bookingPage()
	{
		return "Booking";
	}
	
	//Booking Functionality committed
	@RequestMapping(path="addBooking.do", method=RequestMethod.POST)
	public String addBooking(Booking booking,@RequestParam("totalTickets") String totalTickets,@RequestParam("classType") String classType)
	{
		booking.setClassId(49);
		booking.setFlightId(5028);
		
		/*flight= service.findFlight(booking.getFlightId());
		System.out.println(flight);
		session.setAttribute("flight", flight);*/

		booking.setBookingDate(new Date());
		booking.setNoOfTickets(Integer.parseInt(totalTickets));
		//booking.setNoOfTickets(totalTickets);
		
		String email=(String)session.getAttribute("email");
		user=service.findUser(email);
		session.setAttribute("user",user);
		booking.setUser(user);
		
		session.setAttribute("booking", booking);
		session.setAttribute("classType", classType);
		
		//calling service method
		boolean result=service.addBooking(booking);
		if(result)
		{
			return "redirect:checkTickets.do";
			//return "addTicket.do";
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
