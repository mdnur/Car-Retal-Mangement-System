package interfaces;

import abstructs.Vehicle;

public interface VehicleInterface {
	public void insertVehicle(Vehicle vehicle);

	public void removeVehicle(Vehicle vehicle);

	public Vehicle getVehicle(int id);

	public void showAllVehicles();
}
