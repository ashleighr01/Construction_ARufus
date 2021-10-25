/**
 * 
 * This is the base for the Building object that each type creates from
 * @author AshleighRufus
 * @version 1.0
 * Project 1
 * CS131-ON
 *
 */

public class Building {

	protected String projectName; //The name of the project
	protected String completeAddress; //Full address for specified project
	protected double totalSquareFeet; //Total square footage for project
	protected String occupancyGroup; //Group code
	protected String subgroup; //Specified code for the type of project
	
	/**
	 * The constructors will instantiate the instance variables
	 */
	//Constructors
	public Building() {
		
	}//end of empty-constructor
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	}//end of preferred constructor

	//Methods
	/**
	 * statement about drawing the building
	 */
	public void draw() {
		System.out.println("Drawing code for the building");
	}//end draw method
	
	/**
	 * 
	 * @return data for the project
	 */
	public String displayData() {
		return "Project Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: " + totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup;
	}//end displayData
	
	//Getters + Setters
	/**
	 * 
	 * @return the name of the project
	 */
	public String getProjectName() {
		return projectName;
	}//end getProjectName

	/**
	 * 
	 * @param projectName
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName
	
	/**
	 * 
	 * @return the complete address for the project
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress

	/**
	 * 
	 * @param completeAddress
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress

	/**
	 * 
	 * @return total square feet for project
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet

	/**
	 * 
	 * @param totalSquareFeet
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	/**
	 * 
	 * @return occupancy group code
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup

	/**
	 * 
	 * @param occupancyGroup
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup

	/**
	 * 
	 * @return subgroup code for project
	 */
	public String getSubgroup() {
		return subgroup;
	}//end getSubgroup

	/**
	 * 
	 * @param subgroup
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}//end setSubgroup



	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
	
	
}//end Building Class
