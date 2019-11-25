package com.aerotops.dao;

import java.util.List;

import com.aerotops.model.Airports;
import com.aerotops.model.Booking;
import com.aerotops.model.Flight;
import com.aerotops.model.Ticket;
import com.aerotops.model.User;


public interface AerotopsDao {
	public int createUser(User user);
	public int createBooking(Booking booking);
	public int createTicket(Ticket ticket);
	
	public User readUser(String email);
	public List<User> readAllUsers();
	public int readUserLogin(String email, String password);
	public List<Flight> readAllFlights(String from, String to);
	public List<Airports> readAllAirports();
}
