package classes;

import java.util.Date;

import abstructs.Vehicle;
import interfaces.CustomerInterface;
import interfaces.RentalInterface;
import interfaces.VehicleInterface;

public class Manager implements CustomerInterface,RentalInterface,VehicleInterface{
	private Customer[] customers = new Customer[100];
	private Vehicle vehicles[] = new Vehicle[100];
	private Rentals rentals[] = new Rentals[100];
	private Transaction transactions[] = new Transaction[100];

	public void insertCustomer(Customer customer) {
		int flag = 0;
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] == null) {
				customers[i] = customer;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Customer Inserted");
		} else {
			System.out.println("Can Not Insert");
		}
	}

	public void removeCustomer(Customer customer) {
		int flag = 0;
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] == customer) {
				customers[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Customer Removed");
		} else {
			System.out.println("Can Not Remove");
		}
	}

	public void showAllCustomers() {
		for (Customer customer : customers) {
			if (customer != null) {
				System.out.println("**********************************");
				System.out.println("Customer ID: " + customer.getId());
				System.out.println("Customer Name: " + customer.getName());
				System.out.println("Customer Email: " + customer.getEmail());
				System.out.println("Customer Mobile: " + customer.getMobile());
				System.out.println("Customer gender: " + customer.getGender());
				System.out.println("Customer date of birth: " + customer.getDob());
				System.out.println("Customer date of join: " + customer.getDateOfJoin());
				System.out.println("----------------------------------");

				System.out.println("----------------------------------");
			}
		}
	}

	public Customer getCustomer(int id) {
		Customer customer = null;

		for (int i = 0; i < customers.length; i++) {
			if (customers[i] != null) {
				if (customers[i].getId() == id) {
					customer = customers[i];
					break;
				}
			}
		}
		if (customer != null) {
			System.out.println("Customer Found");
		} else {
			System.out.println("Customer Not Found");
		}
		return customer;
	}

	// For car

	public void insertVehicle(Vehicle vehicle) {
		int flag = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] == null) {
				vehicles[i] = vehicle;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Vehicle Inserted");
		} else {
			System.out.println("Can Not Insert");
		}
	}

	public void removeVehicle(Vehicle vehicle) {
		int flag = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] == vehicle) {
				vehicles[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Vehicle Removed");
		} else {
			System.out.println("Can Not Remove");
		}
	}

	public void showAllVehicles() {
		for (Vehicle vehicle : vehicles) {

			
			if (vehicle != null) {
				System.out.println("**********************************");
				System.out.println("Vehicles Id: " + vehicle.getId());
				System.out.println("Vehicles name: " + vehicle.getName());
				System.out.println("Vehicles Year: " + vehicle.getYear());
				System.out.println("Vehicles make: " + vehicle.getMake());
				System.out.println("Vehicles vehicleStatus: " + vehicle.getVehicleStatus());
				System.out.println("Vehicles vehicle Type: " + vehicle.getVehicleType());
				System.out.println("Vehicles vehicle Seat: " + vehicle.getSeat());
				System.out.println("Vehicles vehicle rentPrice: " + vehicle.getRentPrice());
				
				
				System.out.println("----------------------------------");

				System.out.println("----------------------------------");
			}
		}
	}

	public Vehicle getVehicle(int id) {
		Vehicle vehicle = null;

		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] != null) {
				if (vehicles[i].getId() == id) {
					vehicle = vehicles[i];
					break;
				}
			}
		}
		if (vehicle != null) {
			System.out.println("Vehicles Found");
		} else {
			System.out.println("Vehicles Not Found");
		}
		return vehicle;
	}

	// For Rentals

	public void insertRentals(Rentals rental) {
		int flag = 0;
		for (int i = 0; i < rentals.length; i++) {
			if (rentals[i] == null) {
				rentals[i] = rental;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Rentals Inserted");
		} else {
			System.out.println("Can Not Insert");
		}
	}

	public void removeRentals(Rentals rental) {
		int flag = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (rentals[i] == rental) {
				rentals[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Rentals Removed");
		} else {
			System.out.println("Can Not Remove");
		}
	}

	public void showAllRentals() {
		for (Rentals rental : rentals) {
			
			if (rental != null) {
				System.out.println("**********************************");
				System.out.println("Rentals ID: " + rental.getId());
				System.out.println("Rentals vehicle ID: " + rental.getVehicleID().getId());
				System.out.println("Rentals Customer ID: " + rental.getCustomerID().getId());
				System.out.println("Rentals Rent Date: " + rental.getRentDate());
				System.out.println("Rentals Rent Return Date: " + rental.getReturnDate());
				
				
				
				System.out.println("----------------------------------");

				System.out.println("----------------------------------");
			}
		}
	}

	public Rentals getRentals(int id) {
		Rentals vehicle = null;

		for (int i = 0; i < rentals.length; i++) {
			if (rentals[i] != null) {
				if (rentals[i].getId() == id) {
					vehicle = rentals[i];
					break;
				}
			}
		}
		if (vehicle != null) {
			System.out.println("Rentalss Found");
		} else {
			System.out.println("Rentalss Not Found");
		}
		return vehicle;
	}
	
	public void insertTransaction(Transaction transaction) {
		int flag = 0;
		for (int i = 0; i < transactions.length; i++) {
			if (transactions[i] == null) {
				transactions[i] = transaction;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Customer Inserted");
		} else {
			System.out.println("Can Not Insert");
		}
	}
	
	public void showAllTransaction() {
		for (Transaction transaction : transactions) {
			

			if (transaction != null) {
				System.out.println("**********************************");
				System.out.println("Transaction ID: " + transaction.getId());
				System.out.println("Transaction Retals ID: " + transaction.getRentalsID().getId());
				System.out.println("Transaction car Id: " + transaction.getCarID().getId());
				System.out.println("Transaction customer ID: " + transaction.getCustomerID().getId());
				System.out.println("Transaction transactions date: " + transaction.getTransDate());
				System.out.println("Transaction payment Status: " + transaction.isPaymentStatus());
				System.out.println("Transaction Paying amount: " + transaction.getPayingAmount());
				
				System.out.println("----------------------------------");

				System.out.println("----------------------------------");
			}
		}
	}

	public void searchCustomer(Customer customer) {
		
		System.out.println("**********************************");
		System.out.println("Customer ID: " + customer.getId());
		System.out.println("Customer Name: " + customer.getName());
		System.out.println("Customer Email: " + customer.getEmail());
		System.out.println("Customer Mobile: " + customer.getMobile());
		System.out.println("Customer gender: " + customer.getGender());
		System.out.println("Customer date of birth: " + customer.getDob());
		System.out.println("Customer date of join: " + customer.getDateOfJoin());
		System.out.println("----------------------------------");

		System.out.println("----------------------------------");
	}







}
