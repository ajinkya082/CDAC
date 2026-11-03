package collection_framework;

public class SocialMedia implements Comparable<SocialMedia> {
	private String name;
	private int popularity;
	public SocialMedia() {
		// TODO Auto-generated constructor stub
		name="Instagram";
		popularity=10;
	}
	public SocialMedia(String name, int popularity) {
		this.name = name;
		this.popularity = popularity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopularity() {
		return popularity;
	}
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
	@Override
	public int compareTo(SocialMedia media2) {
		//Default sorting algorithm => Name wise descending
		String firstName=name;
		String secondName=media2.name;
		int comparison=secondName.compareTo(firstName);//Descending sorting order
		return comparison;
	}
	@Override
	public String toString() {
		return "SocialMedia [name=" + name + ", popularity=" + popularity + "]";
	}
}
	
