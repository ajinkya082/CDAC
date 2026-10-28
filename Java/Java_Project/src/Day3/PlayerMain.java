package Day3;

public class PlayerMain {
	public static void main(String[] args) {
		CricketPlayer crPlayer =new CricketPlayer();	
		crPlayer.setName("Rohit Sharma");
		crPlayer.setAge(39);
		crPlayer.setRuns(12120);
		crPlayer.setBattingAvg(50.25f);
		
		System.out.println(crPlayer.getName()+" " + crPlayer.getRuns() );
		System.out.println("===========================================");
		
		CricketPlayer cp=new CricketPlayer("Virat",36,15109,52.6f);
//		System.out.println(cp.getName()+" " + cp.getRuns() );
	}
}
