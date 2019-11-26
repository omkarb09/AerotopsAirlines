package com.aerotops.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aerotops.model.Booking;
import com.aerotops.service.AerotopsService;

public class AeroTopsSeatSelectionController {
	@Autowired
	private Booking booking;
	
	@Autowired
	private AerotopsService service;
	
	@Autowired
	HttpSession session;
	//Seat Selection done
	@RequestMapping(path="seatSelectionPage")
	public String seatSelectionPage()
	{
		return "SeatSelection";
	}
	
	@ExceptionHandler({Exception.class})
	public String handleException()
	{
		return "Error";
	}
}
