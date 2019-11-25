package com.aerotops.service;

import java.util.List;

import com.aerotops.model.Airports;
import com.aerotops.model.Booking;
import com.aerotops.model.Flight;
import com.aerotops.model.Ticket;
import com.aerotops.model.User;

public interface AerotopsService {
	public boolean addUser(User user);
	public boolean addBooking(Booking booking);
	public boolean addTicket(Ticket ticket);
	
	public User findUser(String email);
	public boolean checkUserLogin(String email, String password);
	public List<User> findAllUsers();
	public List<Flight> findAllFlights(String from, String to);
	
	public List<Airports> findAllAirports();
	
	
}
