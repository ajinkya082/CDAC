package Day3;

public class CricketPlayer extends Player{
	private int runs;
	private float battingAvg;
	public CricketPlayer() {
		super();//this call is implicit.
		System.out.println("Inside CricketPlayer()");
	}
	
	public CricketPlayer(String name, int age, int runs, float battingAvg) {
		super(name, age);
		this.runs = runs;
		this.battingAvg = battingAvg;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public float getBattingAvg() {
		return battingAvg;
	}
	public void setBattingAvg(float battingAvg) {
		this.battingAvg = battingAvg;
	}
}
