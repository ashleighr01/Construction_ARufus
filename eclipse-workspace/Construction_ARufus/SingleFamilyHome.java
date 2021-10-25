/**
 * 
 * This is the base for the SingleFamilyHome that all other single family homes
 * will use
 * @author AshleighRufus
 * @version 1.0
 * Project 1
 * CS131-ON
 *
 */
public class SingleFamilyHome extends Residential {

	private boolean garage; //Existence of a garage
	
	/**
	 * Constructor used to instantiate each variable
	 */
	public SingleFamilyHome() {
		super();
		garage = false;
	} //end empty-argument constructor
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	} //end preferred constructor
	
	//Methods
	/**
	 * Statement used to draw the single family home out
	 */
	public void draw() {
		System.out.println("The drawing code for the single family home.");
	} //end draw
	
	/**
	 * @return string with all the information about the single family home
	 */
	public String displayData() {
		return "Project Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: " + totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup + "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of bathrooms: " + numBathrooms + "\nLaundry room? " + laundryRoom  + "\nGarage? " + garage;
	} //end displayData
	
	//Getters + Setters
	/**
	 * 
	 * @return response on if a garage is included with single family home
	 */
	public boolean hasGarage() {
		return garage;
	} //end hasGarage

	/**
	 * 
	 * @param garage value is set to garage
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	} //end setGarage

	
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	} //end toString
	
} //end SingleFamilyHome class
