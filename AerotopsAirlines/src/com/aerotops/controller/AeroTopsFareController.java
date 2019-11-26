package com.aerotops.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aerotops.model.Booking;
import com.aerotops.model.DynamicSeats;
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
	private DynamicSeats dynamicSeats;
	
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(path="calculateFare.do")
	public String calculateFare()
	{
		double dynamicFare;
		booking=(Booking) session.getAttribute("booking");
		
		String classType=(String) session.getAttribute("classType");
		
		double baseFare=service.findFare(booking.getFlightId(), classType);
		System.out.println("before "+baseFare);
		
		int classId= service.findClassId(booking.getFlightId(), classType);
		int availSeats=service.findAvailableSeats(booking.getFlightId(),classId);
		int maxSeats=service.findMaximumSeats(booking.getFlightId(), classId);
		String baggage=booking.getBaggage();
		String refund= booking.getRefundable();
		
		List<DynamicSeats> dynamicSeatA=service.findDynamicSeat("A");
		int percenatgeSeatsA = dynamicSeatA.get(0).getPercentageSeats();
		int percenatgeAmountSeatsA = dynamicSeatA.get(0).getPercenatgeAmountSeats();
		
		List<DynamicSeats> dynamicSeatB=service.findDynamicSeat("B");
		int percenatgeSeatsB = dynamicSeatB.get(0).getPercentageSeats();
		int percenatgeAmountSeatsB = dynamicSeatB.get(0).getPercenatgeAmountSeats();
		
		List<DynamicSeats> dynamicSeatC=service.findDynamicSeat("C");
		int percenatgeSeatsC = dynamicSeatC.get(0).getPercentageSeats();
		int percenatgeAmountSeatsC = dynamicSeatC.get(0).getPercenatgeAmountSeats();
		
		 
		if(baggage.equals("false") && refund.equals("false"))
		{
			
			baseFare=baseFare-2000.00;
		}
		else if((baggage.equals("true") &&refund.equals("false"))||((baggage.equals("false") && refund.equals("true"))))
		{
			baseFare=baseFare-1000.00;
		}
		else 
		{
			baseFare=baseFare+0.00;
		}
			
		
		if(availSeats>( (maxSeats*percenatgeSeatsA)/100))
		{
			dynamicFare=((baseFare*percenatgeAmountSeatsA)/100);
			System.out.println(dynamicFare);
			baseFare=baseFare+dynamicFare;
		}
		else if(availSeats>((maxSeats*percenatgeSeatsB)/100)) {
			dynamicFare=((baseFare*percenatgeAmountSeatsB)/100);
			System.out.println(dynamicFare);
			baseFare=baseFare+dynamicFare;

		}
		else if(availSeats>((maxSeats*percenatgeSeatsC)/100)) {
			dynamicFare=((baseFare*percenatgeAmountSeatsC)/100);
			System.out.println(dynamicFare);
			baseFare=baseFare+dynamicFare;

		}
		System.out.println("After "+baseFare );
		baseFare=booking.getNoOfTickets()*baseFare;
		session.setAttribute("fare", baseFare);
		

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
	/*@ExceptionHandler({Exception.class})
	public String handleException()
	{
		return "Error";
	}*/
}
