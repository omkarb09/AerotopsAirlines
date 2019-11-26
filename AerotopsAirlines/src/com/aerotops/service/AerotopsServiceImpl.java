package com.aerotops.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aerotops.dao.AerotopsDao;
import com.aerotops.model.Airports;
import com.aerotops.model.Booking;
import com.aerotops.model.Flight;
import com.aerotops.model.FlightClass;
import com.aerotops.model.Ticket;
import com.aerotops.model.User;

@Service("service")
public class AerotopsServiceImpl implements AerotopsService
{
	@Autowired
	private AerotopsDao dao;
	
	@Autowired
	private User user;
	
	
	@Autowired
	private Flight flight;
	
	@Override
	@Transactional
	public boolean addUser(User user) {
		int result=getDao().createUser(user);
		if(result==1)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	@Override
	public List<User> findAllUsers() {
		
		return null;
	}

	@Override
	public User findUser(String email) {
		user=getDao().readUser(email);
		return user;
	}
	

	@Override
	@Transactional
	public boolean addBooking(Booking booking) {
		int result=getDao().createBooking(booking);
		if(result==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean checkUserLogin(String email, String password) 
	{
		int result=getDao().readUserLogin(email, password);
		if(result == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public List<Flight> findAllFlights(String from, String to) {
		List<Flight> list = getDao().readAllFlights(from,to);
		return list;
		
	}

	
	public AerotopsDao getDao() {
		return dao;
	}

	public void setDao(AerotopsDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Airports> findAllAirports() {
		List<Airports>list = getDao().readAllAirports();
		return list;
	}

	@Override
	@Transactional
	public boolean addTicket(Ticket ticket) {
		int result=getDao().createTicket(ticket);
		if(result==1)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	@Override
	public boolean checkAvailableTickets(int flightId, int noOfTickets, String classType) {
		int result=getDao().readAvailableTickets(flightId, noOfTickets, classType);
		if(result == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public double findFare(int flightId, String classType) {
		double fare=getDao().readFare(flightId, classType);
		return fare;
	}


	@Override
	public boolean checkLogin(String username, String password) 
	{
		int result=dao.readLogin(username, password);
		if(result == 1){
			return true;
		}else{
			return false;
		}
		
	}
	
	
	@Override
	@Transactional
    public boolean addFlight(Flight flight) {
		int result = getDao().createFlight(flight);
		if(result==1)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	
	@Override
	@Transactional
	public boolean addClass(FlightClass flightclass) {
		int result = getDao().createClass(flightclass);
		if(result==1)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	@Override
	public List<Flight> findAllFlights() {
		List<Flight> list = getDao().readAllFlights();
		return list;
	}
	
	
	@Override
	@Transactional
	public boolean cancelFlight(int flightId) {
		int result= getDao().deleteFLight(flightId);
		if(result==1)
		{
			return true;
		}
		else{
			return false;

		}
	}
	@Override
	public List<FlightClass> findAllCLass() {
		List<FlightClass> list = getDao().readAllClass();
		return list;
	}
	@Override
	public Flight findFlight(int flightID) {
		flight	=getDao().readFlight(flightID);
			return flight;
	
	}
	
	

}
