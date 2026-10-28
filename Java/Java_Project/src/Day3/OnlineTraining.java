package Day3;

public class OnlineTraining extends Training {
	private String meetingLink;

	public OnlineTraining() {
	     meetingLink="https://www.google.com//4s58erd/85Id:Pass-33";
	}

	public OnlineTraining(String moduleName, int duration, String meetingLink) {
		super(moduleName, duration);
		this.meetingLink = meetingLink;
	}

	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}
	
	public void conduct() {
		String currentModule=this.getModuleName();
		int currentDuration=this.getDuration();
		System.out.println("Conducting the training on "+currentModule);
		System.out.println(" for "+currentDuration + " hours ");
		System.out.println("using the link: "  + meetingLink);
	}
	public String getDetails() {
		
		return super.getDetails()+","+meetingLink;
	}
}
