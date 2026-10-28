package Day3;

public class TrainingMain {

	public static void main(String[] args) {
		
		OfflineTraining offline= new OfflineTraining();
		offline.conduct();
		System.out.println("=============================================");
		
		OnlineTraining online=new OnlineTraining("SQL",30,"https://meet.google.com/98544");
		online.conduct();
		System.out.println("=============================================");
		System.out.println(offline.getDetails());
		System.out.println(online.getDetails());
//		Training myTraining=new OfflineTraining();
//		myTraining.conduct();
//		System.out.println("=============================================");
//		Training yourTraining=new OnlineTraining();
//		yourTraining.conduct();
	}

}
