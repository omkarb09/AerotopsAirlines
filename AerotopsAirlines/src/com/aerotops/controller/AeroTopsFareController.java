package com.aerotops.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aerotops.model.Booking;
import com.aerotops.model.Flight;
import com.aerotops.model.Seat;
import com.aerotops.service.AerotopsService;

@Controller
public class AeroTopsFareController {
	@Autowired
	private Booking booking;
	
	@Autowired
	private Flight flight;
	
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
	
	@RequestMapping(path="getSeats.do")
	public String getSeats()
	{
		String classType=(String) session.getAttribute("classType");
		int classId= service.findClassId(booking.getFlightId(), classType);
		List<Seat> seats=service.findAllSeats(booking.getFlightId(), classId);
		String cId= seats.get(0).getClassId()+"";
		String noOfSeats=booking.getNoOfTickets()+"";
		session.setAttribute("noOfSeats", noOfSeats);
		session.setAttribute("seat", seats);
		session.setAttribute("cId", cId);
		return "SeatSelection";
	}
	
	/*@RequestMapping(path="seatSelection")
	public String seatSelection()
	{
		return "SeatSelection";
	}*/
	@ExceptionHandler({Exception.class})
	public String handleException()
	{
		return "Error";
	}
}
