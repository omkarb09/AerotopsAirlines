package com.aerotops.service;

import java.util.List;

import com.aerotops.model.Airports;
import com.aerotops.model.Booking;
import com.aerotops.model.Flight;
import com.aerotops.model.FlightClass;
import com.aerotops.model.Ticket;
import com.aerotops.model.User;

public interface AerotopsService {
	public boolean addUser(User user);
	public boolean addBooking(Booking booking);
	public boolean addTicket(Ticket ticket);
	
	public User findUser(String email);
	public double findFare(int flightId ,String classType);
	
	public boolean checkAvailableTickets(int flightId, int noOfTickets ,String classType);
	public boolean checkUserLogin(String email, String password);
	public List<User> findAllUsers();
	public List<Flight> findAllFlights(String from, String to);
	
	public List<Airports> findAllAirports();
	
	
	public boolean checkLogin(String username,String password);
	
	public boolean addFlight(Flight flight);
	public boolean addClass(FlightClass flightclass);

	public List<Flight> findAllFlights();
	public List<FlightClass> findAllCLass();

	public boolean cancelFlight(int flightId);
    public Flight findFlight(int flightID);
	
}
