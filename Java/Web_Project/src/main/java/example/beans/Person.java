package example.beans;

public class Person {
	
	private String name;
	private int height;
	private float weight;
	
	public Person() {
		System.out.println("Inside Person()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		System.out.println("Getting height");
		return height;
	}

	public void setHeight(int height) {
		System.out.println("Setting height");
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}
