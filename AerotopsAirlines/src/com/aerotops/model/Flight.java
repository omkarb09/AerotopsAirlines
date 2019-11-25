package com.aerotops.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
@Entity
@Table(name="flight")
public class Flight implements Serializable{
//inverse entity
	@Id
	@Column(name="flight_id")
	private int flightId;
	
	@Column(name="from_source")
	private String from;
	
	@Column(name="to_destination")
	private String to;
	
	
    @Column(name="departure_time")
    private String departureTime;

	@Column(name="arrival_time")
	private String arrivalTime;
	
	
	@Column(name="date_of_departure")
	@DateTimeFormat(pattern = "yyyy-MM-dd", iso=ISO.DATE)
	@Temporal(TemporalType.DATE)
	private Date dateOfDeparture;
	
	@Column(name="date_of_arrival")
	@DateTimeFormat(pattern = "yyyy-MM-dd", iso=ISO.DATE)
	@Temporal(TemporalType.DATE)
	private Date dateOfArrival;
	
	@Column(name="flight_status")
	private String flightStatus;
	
	/*@OneToMany(mappedBy="flight", cascade=CascadeType.ALL)
	private Set<FlightClass> flightclass = new HashSet<>();*/


	public Flight() {
		super();
	}


	public Flight(int flightId, String from, String to, String departureTime, String arrivalTime, Date dateOfDeparture,
			Date dateOfArrival, String flightStatus) {
		super();
		this.flightId = flightId;
		this.from = from;
		this.to = to;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.dateOfDeparture = dateOfDeparture;
		this.dateOfArrival = dateOfArrival;
		this.flightStatus = flightStatus;
	}


	public int getFlightId() {
		return flightId;
	}


	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}


	public String getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}


	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}


	public Date getDateOfArrival() {
		return dateOfArrival;
	}


	public void setDateOfArrival(Date dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}


	public String getFlightStatus() {
		return flightStatus;
	}


	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}


	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", from=" + from + ", to=" + to + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + ", dateOfDeparture=" + dateOfDeparture + ", dateOfArrival="
				+ dateOfArrival + ", flightStatus=" + flightStatus + "]";
	}


	/*public Set<FlightClass> getFlightclass() {
		return flightclass;
	}


	public void setFlightclass(Set<FlightClass> flightclass) {
		this.flightclass = flightclass;
	}*/
	
	

	}