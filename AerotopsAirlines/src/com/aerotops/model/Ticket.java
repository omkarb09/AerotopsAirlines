package com.aerotops.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Scope(scopeName="prototype")
@Table(name="ticket")
@Component
@SequenceGenerator(name="seq",sequenceName="ticketid_seq", initialValue=100, allocationSize=1)
//Ticket Entity
public class Ticket implements Serializable
{
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Column(name="pnr_no")
	private int pnrNo;
	@Column(name="total_fare")
	private double totalFare;
	@Column(name="ticket_status")
	private String ticketStatus;
	@Column(name="user_id")
	private int userId;
	@Column(name="flight_id")
	private int flightId;
	@Column(name="seat_name")
	private String seatName;
	@Column(name="class_type")
	private String classType;
	

	@ManyToOne
	@JoinColumn(name="booking_id")
	private Booking booking;
	
	@OneToOne(mappedBy="ticket")
	private Passenger passenger;
	
	public Ticket() {
		super();
	}

	public int getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(int pnrNo) {
		this.pnrNo = pnrNo;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getSeatName() {
		return seatName;
	}

	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	@Override
	public String toString() {
		return "Ticket [pnrNo=" + pnrNo + ", totalFare=" + totalFare + ", ticketStatus=" + ticketStatus + ", userId="
				+ userId + ", flightId=" + flightId + ", seatName=" + seatName + ", classType=" + classType
				+ ", booking=" + booking + ", passenger=" + passenger + "]";
	}

	
	
	
	
	
	
}
