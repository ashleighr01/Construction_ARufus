package Module1Lab2;

public abstract class SportsTeam {

	//instance variables
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	
	//empty-argument constructor
	public SportsTeam() {
	
		teamName = "";
		teamMascot = "";
		headCoach = "";
		wins = 0;
		losses = 0;
	}
	
	//preferred constructor
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		this.teamName = "0";
		this.teamMascot = "0";
		this.headCoach = "0";
	}
	
	//methods
	public double getWinPercentage() {
		return wins/(wins + losses);
	}
	
	public abstract double[] getStats();
}
