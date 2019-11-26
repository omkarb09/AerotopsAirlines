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

@Component
@Scope(scopeName="prototype")
@Entity
@Table(name="class")
@SequenceGenerator(name="seq",sequenceName="classid_seq", initialValue=1, allocationSize=1)
public class  FlightClass implements Serializable {
     //owner entity
	@Id
	@Column(name="class_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int classId;
	
	@Column(name="class_type")
	private String classType;
	
	@Column(name="base_fare")
	private double baseFare;
	
	@Column(name="max_seats")
	private int maxseats;
	
	@Column(name="available_seats")
	private int availseats;
	
	@ManyToOne
	@JoinColumn(name="Flight_Id")
	private Flight flight;

	public FlightClass() {
		super();
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

	public int getMaxseats() {
		return maxseats;
	}

	public void setMaxseats(int maxseats) {
		this.maxseats = maxseats;
	}

	public int getAvailseats() {
		return availseats;
	}

	public void setAvailseats(int availseats) {
		this.availseats = availseats;
	}

	public FlightClass(int classId, String classType, double baseFare, int maxseats, int availseats) {
		super();
		this.classId = classId;
		this.classType = classType;
		this.baseFare = baseFare;
		this.maxseats = maxseats;
		this.availseats = availseats;
	}

	@Override
	public String toString() {
		return "FlightClass [classId=" + classId + ", classType=" + classType + ", baseFare=" + baseFare + ", maxseats="
				+ maxseats + ", availseats=" + availseats + "Flight=" + flight + "]";
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	
	
	
}
	