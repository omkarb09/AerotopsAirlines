package com.aerotops.dao;

import java.util.List;

import com.aerotops.model.Airports;
import com.aerotops.model.Booking;
import com.aerotops.model.DynamicDays;
import com.aerotops.model.DynamicSeats;
import com.aerotops.model.Flight;
import com.aerotops.model.FlightClass;
import com.aerotops.model.Seat;
import com.aerotops.model.Ticket;
import com.aerotops.model.User;


public interface AerotopsDao {
	public int createUser(User user);
	public int createBooking(Booking booking);
	public int createTicket(Ticket ticket);
	
	public User readUser(String email);
	public double readFare(int flightId ,String classType);
	public int readClassId(int flightId ,String classType);
	public List<Seat> readAllSeats(int flightId ,int classId);
	public List<User> readAllUsers();
	
	public int readAvailableTickets(int flightId, int noOfTickets ,String classType);
	public int readUserLogin(String email, String password);
	public List<Flight> readAllFlights(String from, String to);
	public List<Airports> readAllAirports();
	
	public List<DynamicSeats> readDynamicSeat(String codeSeats);
	public List<DynamicDays> readDynamicDay(String codeDays);
	public int readAvailableSeats(int flightId ,int classId);
	public int readMaximumSeats(int flightId ,int classId);
    
	
    
	public int readLogin(String username,String password);
	
	public int createFlight(Flight flight);
	public int createClass(FlightClass flightClass);

	 public int deleteFLight(int flightId);
	public List<FlightClass> readAllClass();

	public List<Flight> readAllFlights();
	public Flight readFlight(int flightID);

}
