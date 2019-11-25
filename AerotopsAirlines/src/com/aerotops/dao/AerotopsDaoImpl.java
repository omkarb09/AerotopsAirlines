package com.aerotops.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aerotops.model.Admin;
import com.aerotops.model.Airports;
import com.aerotops.model.Booking;
import com.aerotops.model.Flight;
import com.aerotops.model.FlightClass;
import com.aerotops.model.Seat;
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

	@Override
	public int readAvailableTickets(int flightId, int noOfTickets, String classType) {

		//System.out.println(flightId);
		//System.out.println(classType);
		String jpql = "select v from FlightClass v Inner Join v.flight a where a.flightId=:id AND v.classType=:classT";
		TypedQuery<FlightClass> tquery = entityManager.createQuery(jpql, FlightClass.class);
		tquery.setParameter("id", flightId);
		tquery.setParameter("classT", classType);
		FlightClass fclass= tquery.getSingleResult();
		if(fclass.getAvailseats()>=noOfTickets)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public double readFare(int flightId, String classType) {
		String jpql = "select v from FlightClass v Inner Join v.flight a where a.flightId=:id AND v.classType=:classT";
		TypedQuery<FlightClass> tquery = entityManager.createQuery(jpql, FlightClass.class);
		tquery.setParameter("id", flightId);
		tquery.setParameter("classT", classType);
		FlightClass fclass= tquery.getSingleResult();
		return fclass.getBaseFare();
	}

	
	
	 public int readLogin(String username, String password) {
			
			String jpql= "select a from Admin a where a.username=:unm AND a.password=:pass";
			TypedQuery<Admin> tquery=entityManager.createQuery(jpql, Admin.class);
			
			Query query = entityManager.createQuery(jpql);
			tquery.setParameter("unm", username);
			tquery.setParameter("pass",password);
			List<Admin> list=tquery.getResultList();
			return list.size();
		}


		@Override
		public int createFlight(Flight flight) {
			entityManager.persist(flight);		
			return 1;
		}

		@Override
		public int createClass(FlightClass flightClass) {
			entityManager.persist(flightClass);		
			return 1;
			
		}


		@Override
		public List<Flight> readAllFlights() {
			String jpql = "From Flight";
			TypedQuery<Flight> tquery = entityManager.createQuery(jpql, Flight.class);
			List<Flight> list = tquery.getResultList();
			return list;
		}


		@Override
		public int deleteFLight(int flightId) {
		String jpql="Update Flight f Set f.flightStatus='Cancelled' where  f.flightId=:fid";
		Query query=entityManager.createQuery(jpql);
		query.setParameter("fid", flightId);
		int result = query.executeUpdate();
		return result;
		}


		@Override
		public List<FlightClass> readAllClass() {
			String jpql = "From FlightClass";
			TypedQuery<FlightClass> tquery = entityManager.createQuery(jpql, FlightClass.class);
			List<FlightClass> list = tquery.getResultList();
			return list;
		}

		@Override
		public Flight readFlight(int flightID) {
			
				String jpql= "select f from Flight f where f.flightId=:fId";
				TypedQuery<Flight> tquery=entityManager.createQuery(jpql, Flight.class);
				tquery.setParameter("fId", flightID);
				
				List<Flight> list =tquery.getResultList();
				
				return list.get(0);

			}

		@Override
		public int readClassId(int flightId, String classType) {
			String jpql = "select v from FlightClass v Inner Join v.flight a where a.flightId=:id AND v.classType=:classT";
			TypedQuery<FlightClass> tquery = entityManager.createQuery(jpql, FlightClass.class);
			tquery.setParameter("id", flightId);
			tquery.setParameter("classT", classType);
			FlightClass fclass= tquery.getSingleResult();
			return fclass.getClassId();
		}

		@Override
		public List<Seat> readAllSeats(int flightId, int classId) {
			String jpql = "select v from Seat v where v.flightId=:fid AND v.classId=:cid AND v.seatStatus=:status";
			TypedQuery<Seat> tquery = entityManager.createQuery(jpql, Seat.class);
			tquery.setParameter("fid", flightId);
			tquery.setParameter("cid", classId);
			tquery.setParameter("status", "A");
			List<Seat> list = tquery.getResultList();
			return list;
		}

		
}
