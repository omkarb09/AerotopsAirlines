package com.aerotops.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

@Entity
@Scope(scopeName="prototype")
@Table(name="booking")
@Component
@SequenceGenerator(name="seq",sequenceName="bookingid_seq", initialValue=1000, allocationSize=1)
public class Booking implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Column(name="booking_id")
	private int bookingId;
	
	@Column(name="no_of_tickets")
	private int noOfTickets;
	
	@Column(name="trip_type")
	private String tripType;
	
	@Column(name="refundable")
	private String refundable;
	
	@Column(name="baggage")
	private String baggage;
	
	@Column(name="departure_from")
	private String departureFrom;
	
	@Column(name="arrival_to")
	private String arrivalTo;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso=ISO.DATE)
	@Column(name="booking_date")
	private Date bookingDate;
	
	@Column(name="class_id")
	private int classId;
	
	@Column(name="flight_id")
	private int flightId;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy="booking", cascade=CascadeType.ALL)
	private Set<Ticket> tickets = new HashSet<>();

	public Booking() {
		super();
	}

	public Booking(int bookingId, int noOfTickets, String tripType, String refundable, String baggage,
			String departureFrom, String arrivalTo, Date bookingDate, int classId, int flightId) {
		super();
		this.bookingId = bookingId;
		this.noOfTickets = noOfTickets;
		this.tripType = tripType;
		this.refundable = refundable;
		this.baggage = baggage;
		this.departureFrom = departureFrom;
		this.arrivalTo = arrivalTo;
		this.bookingDate = bookingDate;
		this.classId = classId;
		this.flightId = flightId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public String getRefundable() {
		return refundable;
	}

	public void setRefundable(String refundable) {
		this.refundable = refundable;
	}

	public String getBaggage() {
		return baggage;
	}

	public void setBaggage(String baggage) {
		this.baggage = baggage;
	}

	public String getDepartureFrom() {
		return departureFrom;
	}

	public void setDepartureFrom(String departureFrom) {
		this.departureFrom = departureFrom;
	}

	public String getArrivalTo() {
		return arrivalTo;
	}

	public void setArrivalTo(String arrivalTo) {
		this.arrivalTo = arrivalTo;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", noOfTickets=" + noOfTickets + ", tripType=" + tripType
				+ ", refundable=" + refundable + ", baggage=" + baggage + ", departureFrom=" + departureFrom
				+ ", arrivalTo=" + arrivalTo + ", bookingDate=" + bookingDate + ", classId=" + classId
				+ ", flightId=" + flightId + ", user=" + user + "]";
	}
	
	

	
}
