package com.aerotops.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.aerotops.model.Booking;
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

}
