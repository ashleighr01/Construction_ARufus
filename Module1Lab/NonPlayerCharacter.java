package Module1Lab;
import java.security.SecureRandom;

public class NonPlayerCharacter extends GameCharacter {

	private boolean active;
	private String intelligenceType;
	
	//empty-argument constructor
	public NonPlayerCharacter() {
		super();
		this.setActive(false);
		this.setIntelligenceType("AVERAGE");
	}
	
	//preferred constructor
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		super.reportStructure();
		super.setUniqueID(uniqueID);
		this.personality = personality;
		this.setActive(active);
		this.setIntelligenceType(intelligenceType);
		
	}

	//getters & setters
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getIntelligenceType() {
		return intelligenceType;
	}

	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}
	
	//methods
	public String introduce() {
		return "Hello, my name is " + uniqueID;
	}
	
	public String exclaim() {
		String [] exclaim = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		SecureRandom word = new SecureRandom();
		int n = word.nextInt(exclaim.length);
		return exclaim[n];
	}
	
	public String reportStructure() {
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("UniqueID: "+getUniqueID()+"\n");
		sb.append("Personality: "+getPersonality()+"\n");
		sb.append("==================================\n");
		sb.append("Active: " + isActive() +"\n");
		sb.append("Intelligence: " + getIntelligenceType() + "\n");
		sb.append("==================================\n");
		
		return sb.toString();
		
	}
	
}
