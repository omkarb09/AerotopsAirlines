package com.aerotops.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aerotops.model.Airports;
import com.aerotops.model.Booking;
import com.aerotops.model.Flight;
import com.aerotops.model.Ticket;
import com.aerotops.model.User;

@Repository
public class AerotopsDaoImpl implements AerotopsDao
{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public int createUser(User user) {
		entityManager.clear();
		System.out.println(user);
		entityManager.merge(user);
		
		return 1;
	}
	
	@Override
	public User readUser(String email) {
		String jpql= "select u from User u where u.email=:email";
		
		TypedQuery<User> tquery=entityManager.createQuery(jpql, User.class);
		
		//Query query = entityManager.createQuery(jpql);
		tquery.setParameter("email", email);
		
		List<User> list=tquery.getResultList();
		
		return list.get(0);
	}

	
	@Override
	public List<User> readAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createBooking(Booking booking) {
		entityManager.clear();
		System.out.println(booking);
		entityManager.merge(booking);
		return 1;
	}

	@Override
	public int readUserLogin(String email, String password) {
		String jpql= "select u from User u where u.email=:eml AND u.password=:pass";
		
		TypedQuery<User> tquery=entityManager.createQuery(jpql, User.class);
		
		//Query query = entityManager.createQuery(jpql);
		tquery.setParameter("eml", email);
		tquery.setParameter("pass",password);
		List<User> list=tquery.getResultList();
		return list.size();
	}
	
	@Override
	public List<Flight> readAllFlights(String from, String to) {
		String jpql = "select v from Flight v where v.from=:src AND v.to=:dst";
		TypedQuery<Flight> tquery = entityManager.createQuery(jpql, Flight.class);
		tquery.setParameter("src", from);
		tquery.setParameter("dst", to);
		List<Flight> list = tquery.getResultList();
		return list;
		
	}

	@Override
	public List<Airports> readAllAirports() {
		String jpql = "from Airports";
		TypedQuery<Airports> tquery = entityManager.createQuery(jpql, Airports.class);
		List<Airports> list = tquery.getResultList();
		return list;
	}

	@Override
	@Transactional
	public int createTicket(Ticket ticket) 
	{
		entityManager.clear();
		System.out.println(ticket);
		entityManager.merge(ticket);
		
		return 1;
	}


	

	
	
	

}
