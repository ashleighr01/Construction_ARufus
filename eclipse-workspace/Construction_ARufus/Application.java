/**
 * 
 * This is the Application object that will put the objects into practice
 * @author AshleighRufus
 * @version 1.0
 * Project 1
 * CS131-ON
 *
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Building Class
		Building b1 = new Building();
		b1.setProjectName("Building");
		b1.setCompleteAddress("123 Wood Dr. | Los Angeles, CA 90201");
		b1.setTotalSquareFeet(5265.10);
		b1.setOccupancyGroup("Business");
		b1.setSubgroup("B");
		b1.draw();
		
		System.out.println(b1);
		System.out.println(b1.displayData());
		System.out.println(b1.toString());
		System.out.println("\n");
		
		//Residential Class
		Residential r1 = new Residential();
		r1.setProjectName("Residential");
		r1.setCompleteAddress("227 Peach St. | Atlanta, GA 88372");
		r1.setTotalSquareFeet(621.62);
		r1.setOccupancyGroup("Residential");
		r1.setSubgroup("R1");
		r1.setNumBedrooms(7);
		r1.setNumBathrooms(12);
		r1.setLaundryRoom(true);
		r1.draw();
		
		System.out.println(r1);
		System.out.println(r1.toString());
		System.out.println("\n");
		
		//Business Class
		Business business = new Business();
		business.setProjectName("Fields Shops");
		business.setCompleteAddress("123 Easy Drive | Louisville, KY 40201");
		business.setTotalSquareFeet(44453.86);
		business.setOccupancyGroup("Business");
		business.setSubgroup("B");
		business.setNumRentableUnits(120);
		business.draw();
		
		System.out.println(business);
		System.out.println(business.toString());
		System.out.println("\n");
		
		//Single Family Home
		SingleFamilyHome robertson = new SingleFamilyHome();
		robertson.setProjectName("Robertson House");
		robertson.setCompleteAddress("123 Test Ave. | Wilbur, NJ 23142");
		robertson.setTotalSquareFeet(2314.21);
		robertson.setOccupancyGroup("Residential");
		robertson.setSubgroup("R1");
		robertson.setNumBedrooms(4);
		robertson.setNumBathrooms(3);
		robertson.setLaundryRoom(true);
		robertson.setGarage(true);
		robertson.draw();
		
		System.out.println(robertson);
		System.out.println(robertson.displayData());
		System.out.println(robertson.toString());
		System.out.println("\n");
		
		//Apartment
		Apartment riverview = new Apartment();
		riverview.setProjectName("Riverview Apartments");
		riverview.setCompleteAddress("444 Spring Way | Philly, PA 33243");
		riverview.setTotalSquareFeet(44382.0);
		riverview.setOccupancyGroup("Residential");
		riverview.setSubgroup("R3");
		riverview.setNumBedrooms(55);
		riverview.setNumBathrooms(60);
		riverview.setLaundryRoom(true);
		riverview.setAvgUnitSize(845.75);
		riverview.setNumRentableUnits(110);
		riverview.setParkingAvailable(true);
		riverview.draw();
		
		System.out.println(riverview);
		System.out.println(riverview.displayData());
		System.out.println(riverview.toString());
		System.out.println("\n");
		
		//Mall
		Mall jefferson = new Mall();
		jefferson.setProjectName("Jefferson Mall");
		jefferson.setCompleteAddress("600 Jefferson Ave. | Williamsburg, VA 84743");
		jefferson.setTotalSquareFeet(25321);
		jefferson.setOccupancyGroup("Business");
		jefferson.setSubgroup("B");
		jefferson.setNumRentableUnits(75);
		jefferson.setNumRentedUnits(63);
		jefferson.setMedianUnitSize(845.50);
		jefferson.setNumParkingSpaces(1300);
		jefferson.draw();
		
		System.out.println(jefferson);
		System.out.println(jefferson.displayData());
		System.out.println(jefferson.toString());
	} //end of main

} //end of Application class
