package com.aerotops.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Scope(scopeName="prototype")
@Table(name="seat")
@Component
public class Seat implements Serializable{
	@Id
	@Column(name="seat_id")
	private int seatId;

	@Column(name="seat_name")
	private String seatName;

	@Column(name="seat_status")
	private String seatStatus;

	@Column(name="flight_id")
	private int flightId;

	@Column(name="class_id")
	private int classId;

	public Seat() {
		super();
	}

	public Seat(int seatId, String seatName, String seatStatus, int flightId, int classId) {
		super();
		this.seatId = seatId;
		this.seatName = seatName;
		this.seatStatus = seatStatus;
		this.flightId = flightId;
		this.classId = classId;
	}
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public String getSeatName() {
		return seatName;
	}
	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}
	public String getSeatStatus() {
		return seatStatus;
	}
	public void setSeatStatus(String seatStatus) {
		this.seatStatus = seatStatus;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatName=" + seatName + ", seatStatus=" + seatStatus + ", flightId="
				+ flightId + ", classId=" + classId + "]";
	}


}