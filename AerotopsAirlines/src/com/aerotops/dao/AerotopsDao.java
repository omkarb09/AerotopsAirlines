package com.aerotops.dao;

import java.util.List;

import com.aerotops.model.Booking;
import com.aerotops.model.User;


public interface AerotopsDao {
	public int createUser(User user);
	public int createBooking(Booking booking);
	public List<User> readAllUsers();
	public int readUserLogin(String email, String password);
}
