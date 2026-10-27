package Day2;

public class CarMain {
	public static void main(String[] args) {
		Car simpleCar;//No music system
		simpleCar=new Car();

		//Printing description of simple car
		System.out.println(simpleCar.getDescription());
		//Printing power of an engine in simple car;
		
		//1.Using Explicit Reference
		Engine simpleEngie= simpleCar.getCurrentEngine();
		String simplePower=simpleEngie.getPower();
		System.out.println(simplePower);
		
		//2.Using Object Graph Navigation
		String power1=simpleCar.getCurrentEngine().getPower();
		System.out.println(power1);

		System.out.println("+===========+=========+=================+=========");
		
		Car premiumCar;//this car has music system
		Engine premiumEngine=new Engine("3300 CC","Diesel");
		MusicSystem premiumMusicSystem=new MusicSystem("Sony","Poly Tone");
		premiumCar=new Car("Toyota Innova",3333333,premiumEngine,premiumMusicSystem);
		
		//Printing description of premium car
		System.out.println(premiumCar.getDescription());
		
		//printing fuel
		System.out.println(premiumCar.getCurrentEngine().getFuel());
		
		//printing  sound effect of music system available in premium car
		//System.out.println(premiumCar.getCuurentMusicSystem().getSoundEffect()); Not recommended
		
		MusicSystem ms= simpleCar.getCuurentMusicSystem();
		if(ms!=null) {
			String soundEffect=ms.getSoundEffect();
			System.out.println(soundEffect);
		}
		else {
			System.out.println("Music System not available in this Car!");
		}
	}
}
