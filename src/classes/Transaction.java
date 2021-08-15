package classes;

import java.util.Date;

import abstructs.Vehicle;

public class Transaction {
	private int id;
	private Rentals rentalsID;
	private Vehicle carID;
	private Customer customerID;
	private Date transDate;
	private boolean paymentStatus;
	private double payingAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Rentals getRentalsID() {
		return rentalsID;
	}

	public void setRentalsID(Rentals rentalsID) {
		this.rentalsID = rentalsID;
	}

	public Vehicle getCarID() {
		return carID;
	}

	public void setCarID(Vehicle carID) {
		this.carID = carID;
	}

	public Customer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Customer customerID) {
		this.customerID = customerID;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public boolean isPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public double getPayingAmount() {
		return payingAmount;
	}

	public void setPayingAmount(double payingAmount) {
		this.payingAmount = payingAmount;
	}
	
}
