/**
 * 
 * This is the base for the Apartment object that
 * each apartment will use for creation
 * @author AshleighRufus
 * @version 1.0
 * Project 1
 * CS131-ON
 *
 */
public class Apartment extends Residential {

	private int numRentableUnits; //Number of units that can be rented
	private double avgUnitSize; //Average size for these units
	private boolean parkingAvailable; //Existence of parking
	
	/**
	 * Constructor used to instantiate each variable 
	 */
	public Apartment() {
		super();
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = true;
	} //end of empty-argument constructor
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	} //end of preferred constructor
		
	//Methods
	/**
	 * Statement for drawing code of the apartment
	 */
	public void draw() {
		System.out.println("Drawing code for apartment.");
	} //end of draw
	
	/**
	 * @return string with all the information of the apartment
	 */
	public String displayData() {
		return "Project Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: " + totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup + "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of bathrooms: " + numBathrooms + "\nLaundry room? " + laundryRoom + "\nNumber of rentable units: " + numRentableUnits + "\nAverage unit size: " + avgUnitSize + "\nParking available? " + parkingAvailable;
	} //end of displayData
	
	//Getters + Setters
	/**
	 * 
	 * @return number of rentable units
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	} //end of getNumRentableUnits

	/**
	 * 
	 * @param numRentableUnits value set to numRentableUnits
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	} //end of setNumRentableUnits

	/**
	 * 
	 * @return average unit size
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	} //end of getAvgUnitSize

	/**
	 * 
	 * @param avgUnitSize value set to avgUnitSize
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	} //end setAvgUnitSize

	/**
	 * 
	 * @return response on if parking is available or not
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	} //end of isParkingAvailable

	/**
	 * 
	 * @param parkingAvailable value set to parkingAvailable
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	} //end of setParkingAvailable

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	} //end of toString
	
} //end of Apartment class
