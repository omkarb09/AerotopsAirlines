package com.aerotops.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aerotops.model.Booking;
import com.aerotops.model.Passenger;
import com.aerotops.model.Seat;
import com.aerotops.model.Ticket;
import com.aerotops.model.Transaction;
import com.aerotops.model.User;
import com.aerotops.service.AerotopsService;

@Controller
public class AeroTopsTicketController
{
	@Autowired
	private AerotopsService service;
	
	@Autowired
	private User user;
	
	@Autowired
	private Ticket ticket;
	
	@Autowired
	private Transaction transaction;
	
	@Autowired
	private Passenger passenger;
	
	@Autowired
	private Booking booking;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(path="addPassenger")
	public String addPassengerPage()
	{
		return "Passenger";
	}
	
	@RequestMapping(path="addTransaction")
	public String addTransactionPage()
	{
		return "Transaction";
	}
	@RequestMapping(path="addPassenger.do",method=RequestMethod.GET)
	public String seatSelectionPage(@RequestParam(value="1",required=false)String name1,
			@RequestParam(value="2",required=false)String name2,
			@RequestParam(value="3",required=false)String name3,
			@RequestParam(value="4",required=false)String name4,
			@RequestParam(value="5",required=false)String name5,
			@RequestParam(value="6",required=false)String name6,
			@RequestParam(value="7",required=false)String name7,
			@RequestParam(value="8",required=false)String name8,
			@RequestParam(value="9",required=false)String name9)
	{
		List<String> passengernm = new ArrayList<>();
		if(name1!=null)
			passengernm.add(name1);
		if(name2!=null)
			passengernm.add(name2);
		if(name3!=null)
			passengernm.add(name3);
		if(name4!=null)
			passengernm.add(name4);
		if(name5!=null)
			passengernm.add(name5);
		if(name6!=null)
			passengernm.add(name6);
		if(name7!=null)
			passengernm.add(name7);
		if(name8!=null)
			passengernm.add(name8);
		if(name9!=null)
			passengernm.add(name9);
		session.setAttribute("passengernm", passengernm);
	
		System.out.println(passengernm);
	
		return "Transaction";
	}
	@RequestMapping(path="addTransaction.do")
	public String addTransaction(@RequestParam("userAcc") String userAccount)
	{
		
		user=service.findUser((String)session.getAttribute("email"));
		transaction.setUserId(user.getUserId());
		transaction.setDateOfTransaction(new Date());
		transaction.setTimeOfTransaction(new Timestamp(System.currentTimeMillis()));
		transaction.setPaymentFrom(userAccount);
		transaction.setPaymentTo("150144007890");
		transaction.setAmount((double)session.getAttribute("fare"));

		boolean result=service.addTransaction(transaction);
		if(result)
		{
			return "redirect:addBookingAfterTran.do";
		}
		else 
		{
			return "Error";
		}
	}
	
	@RequestMapping(path="addBookingAfterTran.do")
	public String addBookingAfterT()
	{
		booking=(Booking) session.getAttribute("booking");
		boolean result=service.addBooking(booking);
		if(result)
		{
			return "redirect:addTicketAfterTran.do";
		}
		else
		{
			return "Error";
		}
	}
	
	@RequestMapping(path="addTicketAfterTran.do")
	public String addTicketAfterT()
	{
		booking=(Booking)session.getAttribute("booking");
		double fare = (double) session.getAttribute("fare");
		user=service.findUser((String)session.getAttribute("email"));
		fare=fare/booking.getNoOfTickets();
		
		List<String> seats = (List<String>)session.getAttribute("selSeats");
		
		
		boolean result=true;
		for(int i=0;i<booking.getNoOfTickets();i++)
		{
			ticket.setTotalFare(fare);
			//ticket.setBooking(booking);
			ticket.setTicketStatus("true");
			ticket.setUserId(user.getUserId());
			ticket.setFlightId(booking.getFlightId());
			ticket.setSeatName(seats.get(i));
			ticket.setClassType((String)session.getAttribute("classType"));
			service.addTicket(ticket);
			
		}
		
		if(result)
		{
			return "redirect:addPassengerAfterTran.do";
		}
		else
		{
			return "Error";
		}
	}
	
	@RequestMapping(path="addPassengerAfterTran.do")
	public String addPassengerAfterT()
	{
		booking=(Booking)session.getAttribute("booking");
		
		user=service.findUser((String)session.getAttribute("email"));
		
		
		List<String> name = (List<String>)session.getAttribute("passengernm");
		
		
		boolean result=true;
		for(int i=0;i<booking.getNoOfTickets();i++)
		{
			passenger.setName(name.get(i));
			service.addPassenger(passenger);
			
		}
		
		if(result)
		{
			return "Home";
		}
		else
		{
			return "Error";
		}
	}
	/*@ExceptionHandler({Exception.class})
	public String handleException()
	{
		return "Error";
	}*/
}
