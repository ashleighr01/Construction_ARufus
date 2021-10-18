package Module1Lab2;

public class BasketballTeam extends SportsTeam {
	
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	public BasketballTeam() {
		super();
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
	}
	
	public double fieldGoalPercentage() {
		return fieldGoals/fieldGoalsAttempted;
	}
	
	public double freeThrowPercentage() {
		return freeThrows/freeThrowsAttempted;
	}
	
	public void setStats (int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		this.wins = wins;
		this.losses = losses;
		this.fieldGoals = fieldGoals;
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		this.freeThrows = freeThrows;
		this.freeThrowsAttempted = freeThrowsAttempted;
	}

	@Override
	public double[] getStats() {
		// TODO Auto-generated method stub
		double [] stats = {getWinPercentage(), fieldGoalPercentage(), freeThrowPercentage()};
		return stats;
	}
}
