package com.aerotops.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Entity
@Scope(scopeName="prototype")
@Table(name="passenger")
@Component
@SequenceGenerator(name="seq",sequenceName="passengerid_seq", initialValue=100, allocationSize=1)
public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Column(name="passenger_id")
	private int passengerId;
	
	@Column(name="name")
	private String name;

	@OneToOne
	@JoinColumn(name="pnr_no")
	private Ticket ticket;

	public Passenger() {
		super();
	}

	public Passenger(int passengerId, String name) {
		super();
		this.passengerId = passengerId;
		this.name = name;
		
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", name=" + name + ", ticket=" + ticket + "]";
	}

	
	
}
