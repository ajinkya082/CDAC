package Day2;

public class Car {
	private String description;
	private int onRoadPrice;
	private Engine currentEngine;
	private MusicSystem cuurentMusicSystem;
	
	
	public Car() {
		//By default this car does not have music system
		description="Tata Sieera";
		onRoadPrice=1000000;
		currentEngine=new Engine();
		//Not Initializing currentMusicSystem as this car does not have music system
	}


	public Car(String description, int onRoadPrice, Engine currentEngine, MusicSystem cuurentMusicSystem) {
		this.description = description;
		this.onRoadPrice = onRoadPrice;
		this.currentEngine = currentEngine;
		this.cuurentMusicSystem = cuurentMusicSystem;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getOnRoadPrice() {
		return onRoadPrice;
	}


	public void setOnRoadPrice(int onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}


	public Engine getCurrentEngine() {
		return currentEngine;
	}


	public void setCurrentEngine(Engine currentEngine) {
		this.currentEngine = currentEngine;
	}


	public MusicSystem getCuurentMusicSystem() {
		return cuurentMusicSystem;
	}


	public void setCuurentMusicSystem(MusicSystem cuurentMusicSystem) {
		this.cuurentMusicSystem = cuurentMusicSystem;
	}
	
}
