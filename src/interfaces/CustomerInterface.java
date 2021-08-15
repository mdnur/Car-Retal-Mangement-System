package interfaces;

import classes.Customer;

public interface CustomerInterface {
	public void insertCustomer(Customer customer);

	public void removeCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void showAllCustomers();
}