package Day3;

public class Training {
	private String moduleName;
	private int duration;//Hrs
	public Training() {
		moduleName="OOPS using Java";
		duration=60;
	}
	public Training(String moduleName, int duration) {
		super();
		this.moduleName = moduleName;
		this.duration = duration;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void conduct() {
		
	}
	public String getDetails() {
		String details=moduleName+","+duration;
		return details;
	}
	
}
