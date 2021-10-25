/**
 * 
 * This is the base for the Business object that each type of business project to be
 * created from
 * @author AshleighRufus
 * @version 1.0
 * Project 1
 * CS131-ON
 *
 */
public class Business extends Building {

	protected int numRentableUnits; //number of units that can be rented
	
	/**
	 * The constructors will instantiate the instance variable for the class
	 */
	//Constructor
	public Business () {
		super();
		numRentableUnits = 0;
	}//end of empty-argument constructor
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	}//end of preferred constructor	

	//Getters + Setters
	/**
	 * 
	 * @return number of rentable units
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits

	/**
	 * 
	 * @param numRentableUnits
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString
	
	
}//end Business Class
