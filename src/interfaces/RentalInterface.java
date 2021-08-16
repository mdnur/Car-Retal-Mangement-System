package interfaces;

import classes.Rentals;

public interface RentalInterface {
	public void insertRentals(Rentals rental);

	public void removeRentals(Rentals rental);

	public Rentals getRentals(int id);

	public void showAllRentals();
}
