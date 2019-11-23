package com.aerotops.service;

import java.util.List;

import com.aerotops.model.Booking;
import com.aerotops.model.User;

public interface AerotopsService {
	public boolean addUser(User user);
	public boolean addBooking(Booking booking);
	public boolean checkUserLogin(String email, String password);
	public List<User> findAllUsers();
}
