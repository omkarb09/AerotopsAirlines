package com.aerotops.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
@Entity
@Table(name="dynamic_seats")
public class DynamicSeats implements Serializable {
	@Id
	@Column(name="dynamic_code_seats")
	private String codeSeats ;
	
	@Column(name="percentage_of_seats")
	private int percentageSeats ;
	
	@Column(name="percentage_of_seats_amount")
	private int percenatgeAmountSeats ;

	public String getCodeSeats() {
		return codeSeats;
	}

	public void setCodeSeats(String codeSeats) {
		this.codeSeats = codeSeats;
	}

	public int getPercentageSeats() {
		return percentageSeats;
	}

	public void setPercentageSeats(int percentageSeats) {
		this.percentageSeats = percentageSeats;
	}

	public int getPercenatgeAmountSeats() {
		return percenatgeAmountSeats;
	}

	public void setPercenatgeAmountSeats(int percenatgeAmountSeats) {
		this.percenatgeAmountSeats = percenatgeAmountSeats;
	}

	public DynamicSeats(String codeSeats, int percentageSeats, int percenatgeAmountSeats) {
		super();
		this.codeSeats = codeSeats;
		this.percentageSeats = percentageSeats;
		this.percenatgeAmountSeats = percenatgeAmountSeats;
	}

	public DynamicSeats() {
		super();
	}

	@Override
	public String toString() {
		return "DynamicSeats [codeSeats=" + codeSeats + ", percentageSeats=" + percentageSeats
				+ ", percenatgeAmountSeats=" + percenatgeAmountSeats + "]";
	}
	
	
	
}
