/**
 * 
 * This is the base for each mall that is created
 * @author AshleighRufus
 * @version 1.0
 * Project 1
 * CS131-ON
 *
 */
public class Mall extends Business {

	private int numRentedUnits; //number of units that are currently rented 
	private double medianUnitSize; //median of all unit sizes within building
	private int numParkingSpaces; //number of parking spaces included with building
	
	/**
	 * Constructors used to instantiate each variable
	 */
	public Mall() {
		super();
		numRentedUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
	}//end of empty-argument constructor
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	}//end of preferred constructor
	
	//Methods 
	/**
	 * Will print a statement about drawing the mall
	 */
	public void draw() {
		System.out.println("The drawing code for the mall");
	}//end of draw
	
	/**
	 * @return a string with all the information about the Mall
	 */
	public String displayData() {
		return "Project Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: " + totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup + "\nNumber of units rented: " + numRentedUnits + "\nMedian of all unit sizes: " + medianUnitSize + "\nNumber of parking spaces: " + numParkingSpaces;
	}//end of displayData
	
	//Getters + Setters
	/**
	 * 
	 * @return number of rented units
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end of getNumRentedUnits

	/**
	 * 
	 * @param numRentedUnits value is set to number of rented units
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end of setNumRentedUnits

	/**
	 * 
	 * @return the median of unit sizes
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end of getMedianUnitSize

	/**
	 * 
	 * @param medianUnitSize value set to the median of unit sizes
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end of setMedianUnitSize

	/**
	 * 
	 * @return number of parking spaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end of numParkingSpaces

	/**
	 * 
	 * @param numParkingSpaces value set to the number parking spaces
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end of setNumParkingSpaces



	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end of toString

}//end of Mall Class
