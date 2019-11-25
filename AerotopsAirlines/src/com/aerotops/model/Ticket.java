package com.aerotops.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Scope(scopeName="prototype")
@Table(name="ticket")
@Component
@SequenceGenerator(name="seq",sequenceName="ticketid_seq", initialValue=100, allocationSize=1)
public class Ticket implements Serializable
{
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Column(name="pnr_no")
	private long pnrNo;
	@Column(name="total_fare")
	private long totalFare;
	@Column(name="ticket_status")
	private String ticketStatus;
	@Column(name="user_id")
	private long userId;
	@Column(name="flight_id")
	private long flightId;
	@Column(name="seat_id")
	private long seatId;
	@Column(name="class_id")
	private long classId;
	
	/*@Column(name="booking_id")
	private long bookingId;*/
	
	@ManyToOne
	@JoinColumn(name="booking_id")
	private Booking booking;
	
	public Ticket() {
		super();
	}
	
	public Ticket(long pnrNo, long totalFare, String ticketStatus, long userId, long flightId, long seatId,
			long classId, long bookingId) {
		super();
		this.pnrNo = pnrNo;
		this.totalFare = totalFare;
		this.ticketStatus = ticketStatus;
		this.userId = userId;
		this.flightId = flightId;
		this.seatId = seatId;
		this.classId = classId;
		
	}
	
	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public long getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}
	public long getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(long totalFare) {
		this.totalFare = totalFare;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	public long getSeatId() {
		return seatId;
	}
	public void setSeatId(long seatId) {
		this.seatId = seatId;
	}
	public long getClassId() {
		return classId;
	}
	public void setClassId(long classId) {
		this.classId = classId;
	}
	

	@Override
	public String toString() {
		return "Ticket [pnrNo=" + pnrNo + ", totalFare=" + totalFare + ", ticketStatus=" + ticketStatus + ", userId="
				+ userId + ", flightId=" + flightId + ", seatId=" + seatId + ", classId=" + classId + "]";
	}
	
	
	
}
