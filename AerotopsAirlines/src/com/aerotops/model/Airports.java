package com.aerotops.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Airport")
@Scope(scopeName="prototype")
//Airports Entity
public class Airports 
{
	@Id
	@Column(name="code")
	private String code;
	
	@Column(name="city")
	private String city;

	public Airports() {
		super();
	}

	public Airports(String code, String city) {
		super();
		this.code = code;
		this.city = city;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Airports [code=" + code + ", city=" + city + "]";
	}
	
	
}
