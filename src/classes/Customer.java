package classes;

import java.util.Date;

import abstructs.Person;

public class Customer extends Person {
	private int id;
	private Date dateOfJoin;
	private int carRentNumber;
	private int TotalCarReturn;
	private Rentals rentals[] = new Rentals[10];

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public int getCarRentNumber() {
		return carRentNumber;
	}

	public void setCarRentNumber(int carRentNumber) {
		this.carRentNumber = carRentNumber;
	}

	public int getTotalCarReturn() {
		return TotalCarReturn;
	}

	public void setTotalCarReturn(int totalCarReturn) {
		TotalCarReturn = totalCarReturn;
	}
	public void showAllRentals() {
		for (Rentals rental : rentals) {
			if (rental != null) {
				System.out.println("**********************************");
				System.out.println("Rentals Name: " + rental.getRentDate());
				System.out.println("Rentals NID: " + rental.getId());
				System.out.println("----------------------------------");

				System.out.println("----------------------------------");
			}
		}
	}
}
