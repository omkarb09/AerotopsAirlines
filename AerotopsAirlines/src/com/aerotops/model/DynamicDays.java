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
@Table(name="dynamic_days")

	
public class DynamicDays implements Serializable{

	@Id
	@Column(name="dynamic_code_days")
	private String codeDays ;
	
	@Column(name="days_before_flight")
	private int daysBeforeFlight ;
	
	@Column(name="percentage_of_days_amount")
	private int percenatgeAmountDays ;

	public DynamicDays() {
		super();
	}

	public DynamicDays(String codeDays, int daysBeforeFlight, int percenatgeAmountDays) {
		super();
		this.codeDays = codeDays;
		this.daysBeforeFlight = daysBeforeFlight;
		this.percenatgeAmountDays = percenatgeAmountDays;
	}

	public String getCodeDays() {
		return codeDays;
	}

	public void setCodeDays(String codeDays) {
		this.codeDays = codeDays;
	}

	public int getDaysBeforeFlight() {
		return daysBeforeFlight;
	}

	public void setDaysBeforeFlight(int daysBeforeFlight) {
		this.daysBeforeFlight = daysBeforeFlight;
	}

	public int getPercenatgeAmountDays() {
		return percenatgeAmountDays;
	}

	public void setPercenatgeAmountDays(int percenatgeAmountDays) {
		this.percenatgeAmountDays = percenatgeAmountDays;
	}

	@Override
	public String toString() {
		return "DynamicDays [codeDays=" + codeDays + ", daysBeforeFlight=" + daysBeforeFlight
				+ ", percenatgeAmountDays=" + percenatgeAmountDays + "]";
	}

}
