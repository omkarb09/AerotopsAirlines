package com.aerotops.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Entity
@Scope(scopeName="prototype")
@Table(name="transaction")
@Component
@SequenceGenerator(name="seq",sequenceName="transactionid_seq", initialValue=1000, allocationSize=1)
//Transaction Entity
public class Transaction {
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Column(name="transaction_id")
	private int transactionId;
	
	@Column(name="date_of_transaction")
	private Date dateOfTransaction;
	
	@Column(name="time_of_transaction")
	private Timestamp timeOfTransaction;
	
	@Column(name="payment_from")
	private String paymentFrom;
	
	@Column(name="payment_to")
	private String paymentTo;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="user_id")
	private int userId;

	public Transaction() {
		super();
	}

	public Transaction(int transactionId, Date dateOfTransaction, Timestamp timeOfTransaction, String paymentFrom,
			String paymentTo, double amount, int userId) {
		super();
		this.transactionId = transactionId;
		this.dateOfTransaction = dateOfTransaction;
		this.timeOfTransaction = timeOfTransaction;
		this.paymentFrom = paymentFrom;
		this.paymentTo = paymentTo;
		this.amount = amount;
		this.userId = userId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Date getDateOfTransaction() {
		return dateOfTransaction;
	}

	public void setDateOfTransaction(Date dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}

	public Timestamp getTimeOfTransaction() {
		return timeOfTransaction;
	}

	public void setTimeOfTransaction(Timestamp timeOfTransaction) {
		this.timeOfTransaction = timeOfTransaction;
	}

	public String getPaymentFrom() {
		return paymentFrom;
	}

	public void setPaymentFrom(String paymentFrom) {
		this.paymentFrom = paymentFrom;
	}

	public String getPaymentTo() {
		return paymentTo;
	}

	public void setPaymentTo(String paymentTo) {
		this.paymentTo = paymentTo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", dateOfTransaction=" + dateOfTransaction
				+ ", timeOfTransaction=" + timeOfTransaction + ", paymentFrom=" + paymentFrom + ", paymentTo="
				+ paymentTo + ", amount=" + amount + ", userId=" + userId + "]";
	}
	
	
	
}
