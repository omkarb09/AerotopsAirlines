package com.aerotops.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
@Entity
@Table(name="class")
public class FlightClass {
	@Id
	@Column(name="class_id")
	private int classId;
	
	@Column(name="class_type")
	private String classType;
	
	@Column(name="base_fare")
	private double baseFare;
	
	@Column(name="max_seats")
	private int maxSeats;
	
	@Column(name="available_seats")
	private int availabeSeats;
	
	@Column(name="flight_id")
	private int flightId;
	/*@ManyToOne
	@JoinColumn(name="flight_id")
	private Flight flight;*/

	public FlightClass() {
		super();
	}

	public FlightClass(int classId, String classType, double baseFare, int maxSeats, int availabeSeats, int flightId) {
		super();
		this.classId = classId;
		this.classType = classType;
		this.baseFare = baseFare;
		this.maxSeats = maxSeats;
		this.availabeSeats = availabeSeats;
		this.flightId = flightId;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public double getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(double baseFare) {
		this.baseFare = baseFare;
	}

	public int getMaxSeats() {
		return maxSeats;
	}

	public void setMaxSeats(int maxSeats) {
		this.maxSeats = maxSeats;
	}

	public int getAvailabeSeats() {
		return availabeSeats;
	}

	public void setAvailabeSeats(int availabeSeats) {
		this.availabeSeats = availabeSeats;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	@Override
	public String toString() {
		return "FlightClass [classId=" + classId + ", classType=" + classType + ", baseFare=" + baseFare + ", maxSeats="
				+ maxSeats + ", availabeSeats=" + availabeSeats + ", flightId=" + flightId + "]";
	}
	
	
	
	
	
}
