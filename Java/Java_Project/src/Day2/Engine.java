package Day2;

public class Engine {

	private String power;
	private String fuel;
	public Engine() {
		power="1200 CC";
		fuel="Petrol";
	}
	public Engine(String power, String fuel) {
		this.power = power;
		this.fuel = fuel;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

   
}
