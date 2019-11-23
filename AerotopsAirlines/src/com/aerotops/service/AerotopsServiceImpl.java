package com.aerotops.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aerotops.dao.AerotopsDao;
import com.aerotops.model.Booking;
import com.aerotops.model.Flight;
import com.aerotops.model.User;

@Service("service")
public class AerotopsServiceImpl implements AerotopsService
{
	@Autowired
	private AerotopsDao dao;
	
	@Override
	@Transactional
	public boolean addUser(User user) {
		int result=dao.createUser(user);
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

	public AerotopsDao getDao() {
		return dao;
	}

	public void setDao(AerotopsDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public boolean addBooking(Booking booking) {
		int result=dao.createBooking(booking);
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
		int result=dao.readUserLogin(email, password);
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
	
	

}
