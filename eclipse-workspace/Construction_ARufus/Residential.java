/**
 * 
 * This is the base for the Residential objects that other residential 
 * projects will be based on
 * @author AshleighRufus
 * @version 1.0
 * Project 1
 * CS131-ON
 *
 */
public class Residential extends Building {

	protected int numBedrooms; //Number of bedrooms in the building
	protected int numBathrooms; //Number of bathrooms in the building
	protected boolean laundryRoom; //Existence of a laundry room
	
	/**
	 * The constructors will instantiate variables
	 */
	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = true;
	}//end empty-argument constructor
	
	public Residential (String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	}//end preferred constructor

	//Getters + Setters
	/**
	 * 
	 * @return number of bedrooms in the building
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms

	/**
	 * 
	 * @param numBedrooms value will be set
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms

	/**
	 * 
	 * @return number of bathrooms in the building
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms

	/**
	 * 
	 * @param numBathrooms value will be set
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms

	/**
	 * 
	 * @return response on if the building has a laundry room
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom

	/**
	 * 
	 * @param laundryRoom the boolean of laundryRoom will be set
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom

	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
	}//end toString
	
}//end Residential Class
