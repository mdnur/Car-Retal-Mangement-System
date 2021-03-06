import classes.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import abstructs.Vehicle;

public class Start
{
	private static SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String args[]) throws ParseException
	{
		System.out.println("Welcome to Sample Car Rental Mangemnet System");
		boolean choice = true;
		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();
		
		while(choice)
		{
			System.out.println("Here are Some Options for You: \n");
			System.out.println("	1. Vehicle Management");
			System.out.println("	2. Customer Management");
			System.out.println("	3. Rental Management");
			System.out.println("	4. Customer Transactions");
			System.out.println("	5. Exit the Application\n");
			System.out.print("What do you want to do? : ");
			
			int first = sc.nextInt();
			
			switch(first)
			{
				case 1:
					
					System.out.println("You have selected Employee Management");
					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Add New Vehicle");
					System.out.println("	2. Remove Vehicle");
					System.out.println("	3. Search Vehicle");
					System.out.println("	4. See all Vehicle");
					System.out.println("	5. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second1 = sc.nextInt();
					
					switch(second1)
					{
						case 1:

							System.out.println("You have Selected to Add a new Vehicle\n");
							System.out.print("Enter Vehicle Id: ");
							
							int vehicleID = sc.nextInt();
							System.out.print("Enter Vehicle Name: ");
							
							String name = sc.next();
							System.out.print("Enter Vehicle Make: ");
							String make = sc.next();

							System.out.print("Enter Vehicle Model: ");
							String model = sc.next();
							
							System.out.print("Enter Vehicle year release: ");
							int year = sc.nextInt();
							
							System.out.print("Enter Vehicle rent price: ");
							double rentPrice = sc.nextDouble();
							
							System.out.print("Enter Vehicle type If it is Car(1) just enter 1 if Van(2) just enter 2 : ");
							int type = sc.nextInt();
							if(type == 1) {
								Vehicle vehicle = new Car();
								vehicle.setId(vehicleID);
								vehicle.setName(name);
								vehicle.setMake(make);
								vehicle.setModel(model);
								vehicle.setYear(year);
								vehicle.setRentPrice(rentPrice);
								
								manager.insertVehicle(vehicle);
								break;
							}else if(type == 2){
								Vehicle vehicle = new Van();
								vehicle.setId(vehicleID);
								vehicle.setName(name);
								vehicle.setMake(make);
								vehicle.setModel(model);
								vehicle.setYear(year);
								vehicle.setRentPrice(rentPrice);
								break;
							}else{
								System.out.println("please enter correct input");
							}
							
							
							
							break;
							
						case 2:
							
							System.out.println("You have Selected to remove an existing Vehicle");
							System.out.print("Enter Vehicle Id: ");
							
							manager.removeVehicle(manager.getVehicle(sc.nextInt()));
							
							break;
							
						case 3:
							
							System.out.println("You have Selected to remove an existing Vehicle");
							System.out.print("Enter Vehicle Id: ");
							Vehicle vehicle = manager.getVehicle(sc.nextInt());
							if(vehicle != null){
								manager.searchVehicle(vehicle);
							}
							
							
							break;
							
						case 4:
							
							System.out.println("You have Selected to see all Vehicle");
							
							manager.showAllVehicles();
							
							
							break;
						
						case 5:
							
							System.out.println("You have Selected to Go Back");
							break;
							
							
						default:
							
							System.out.println("Invalid Input");
							break;
					}
					
					break;
					
				case 2:
				
					System.out.println("You have selected Customer Management");
					
					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Create New Customer");
					System.out.println("	2. Remove Existing Customer");
					System.out.println("	3. See all Customers");
					System.out.println("	4. Search a Customers");
					System.out.println("	5. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second2 = sc.nextInt();
					
					switch(second2)
					{
						case 1:

							System.out.print("Enter Customer id: ");
							int id = sc.nextInt();
							System.out.print("Enter Customer Name: ");
							String name1 = sc.next();
							
							System.out.print("Enter Customer Email: ");
							String email = sc.next();
							
							System.out.print("Enter Customer Mobile: ");
							String mobile = sc.next();
							
							System.out.print("Enter Customer gender('male or female': ");
							String gender = sc.next();
							
							System.out.print("Enter Customer Date of birth(dd/MM/yyyy): ");
							String dob = sc.next();
							
							System.out.print("Enter Customer Date of Join(dd/MM/yyyy): ");
							String doJ = sc.next();
							
							Customer c = new Customer();
							c.setId(id);
							c.setName(name1);
							c.setEmail(email);
							c.setMobile(mobile);
							c.setGender(gender);
							c.setDob(sdformat.parse(dob));
							c.setDateOfJoin(sdformat.parse(doJ));
							
							manager.insertCustomer(c);
							break;
							
						case 2:
						
							System.out.print("Enter Customer id: ");
							int cusid = sc.nextInt();
							
							manager.removeCustomer(manager.getCustomer(cusid));
							break;
						
						case 3:
						
							manager.showAllCustomers();
							break;
						
						case 4:
						
							System.out.print("Enter Customer id: ");
							int cusids = sc.nextInt();
							Customer cus3= manager.getCustomer(cusids);
							if(cus3 != null) {
								manager.searchCustomer(cus3);
							}{
								System.out.println("customer not found");
							}
							
							break;
							
						case 5:
							
							System.out.println("Going Back . . .");
							break;
							
						default:
						
							System.out.println("Invalid Input");
							break;
					}
					
					break;
				
				case 3:
					
					System.out.println("You have selected Rental Management");
					
					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Rent Car ");
					System.out.println("	2. Remove Existing Renting car  of a Customer");
					System.out.println("	3. Search Renting Car");
					System.out.println("	4. See all Renting car of a Customer");
					System.out.println("	5. See all Renting Vehicle");
					System.out.println("	6. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second3 = sc.nextInt();
					
					switch(second3)
					{
						case 1: 

							System.out.print("Enter Rental id: ");
							int rentalID = sc.nextInt();
							
							System.out.print("Enter Customer id: ");
							int cusID = sc.nextInt();
							
							System.out.print("Enter Vehicle ID: ");
							int vehicleID = sc.nextInt();
							
							System.out.print("Enter Renting Date (dd/mm/yyyy): ");
							String rentDate = sc.next();
							
							System.out.print("Enter Renting Return Date (dd/mm/yyyy): ");
							String returnDate = sc.next();
							
							
							Customer cus1 = manager.getCustomer(cusID);
							Vehicle vehicle1 = manager.getVehicle(vehicleID);
							
							if(vehicle1 != null &&  cus1 != null) {
								Rentals rental = new Rentals();
								rental.setId(rentalID);
								rental.setCustomerID(cus1);
								rental.setVehicleID(vehicle1);
								rental.setRentDate(sdformat.parse(rentDate));
								rental.setReturnDate(sdformat.parse(returnDate));
								System.out.println("Rent is done");
								break;
							}else {
								System.out.println("Vehicle id or customer id is not correct, try again");
							}
						
							break;
							
						case 2:
						
							System.out.print("Enter Rental id: ");
							int rentalID1 = sc.nextInt();
							
							Rentals rental1 = manager.getRentals(rentalID1);
							
							
							if(rental1 != null) {
								manager.removeRentals(rental1);
								System.out.println("rental id of "+rentalID1 +" is deleted");
							}else {
								System.out.println("rental id of "+rentalID1 +" is not deleted");
							}
							
							break;
						case 3:
						
								System.out.print("Enter Rental id: ");
								int rentalID11 = sc.nextInt();
								
								Rentals rental12 = manager.getRentals(rentalID11);
								
								
								if(rental12 != null) {
									System.out.println("Result from the search");
									manager.searchRental(rental12);
									
								}else {
									System.out.println("rental id of "+rentalID11 +" is not found");
								}
						
							
							break;
							
						case 4:
						
							System.out.print("Enter Customer ID: ");
							int nid3 = sc.nextInt();
							
							manager.getCustomer(nid3).showAllRentals();
							break;
							
						case 5:
							
							manager.showAllRentals();
							break;
							
						case 6:
						
							System.out.println("Going Back . . .");
							break;
							
						default:
						
							System.out.println("Invalid Input");
							break;
					}
					
					break;
					
				case 4:
				
					System.out.println("You have selected Customer  Transactions");
					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Pay the rent");
					System.out.println("	2. Show Transaction History");
					System.out.println("	3. Search Transaction ");
					System.out.println("	4. Delete Transaction ");
					System.out.println("	5. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second4 = sc.nextInt();
					
					switch(second4)
					{
						case 1:

							System.out.print("Enter Transaction id: ");
							int tid = sc.nextInt();
							
							System.out.print("Enter Customer id: ");
							int nid1 = sc.nextInt();
							
							System.out.print("Enter Rental id: ");
							int rentalID = sc.nextInt();
							
							System.out.print("Enter Vehicle id: ");
							int vehi = sc.nextInt();
							
							System.out.print("Enter Transactions Date : ");
							String transdate = sc.next();
							
							Rentals rental1 = manager.getRentals(rentalID);
							Customer cus1 = manager.getCustomer(nid1);
							Vehicle vehi1 = manager.getVehicle(vehi);
							
							if(rental1 != null &&  cus1 != null && vehi1 != null) {
								Transaction trans = new Transaction();
								trans.setId(tid);
								trans.setRentalsID(rental1);
								trans.setCarID(vehi1);
								trans.setCustomerID(cus1);
								trans.setTransDate(sdformat.parse(transdate));
								trans.setPaymentStatus(true);
								trans.setPayingAmount(vehi1.getRentPrice());
								
								
								System.out.println("Rent is done");
								break;
							}else {
								System.out.println("Vehicle id or customer id or Transaction id is not corrent, try again");
							}
							
						
							break;
							
						case 2:
						
							manager.showAllTransaction();
							
							
							break;
						
						case 3:
								
								System.out.print("Enter Transaction id: ");
								int rentalID11 = sc.nextInt();
								
								Transaction trans1 = manager.getTransaction(rentalID11);
								
								
								if(trans1 != null) {
									System.out.println("Result from the search");
									manager.searchTransaction(trans1);
									
								}else {
									System.out.println("Transaction id of "+rentalID11 +" is not found");
								}
				
							break;
						case 4:
								
								System.out.print("Enter Transaction id: ");
								int trans3 = sc.nextInt();
								
								Transaction trans5 = manager.getTransaction(trans3);
								
								
								if(trans5 != null) {
									manager.removeTransaction(trans5);
									System.out.println("Transaction id of "+trans3 +" is deleted");
								}else {
									System.out.println("Transaction id of "+trans3 +" is not deleted");
								}	
								
				
							break;
						case 5:
						
							System.out.println("You have Selected to Go Back");
							break;
							
						default:
						
							System.out.println("Invalid Input");
							break;
					}
					
					
					break;
					
				case 5:
					
					System.out.println("You have selected to exit the application");
					System.out.println("Thank you for using Car rent management System");
					choice = false;
					sc.close();
					break;
					
				default:
				
					System.out.println("Invalid Input");
					break;
			}
		}
		
	}
}
