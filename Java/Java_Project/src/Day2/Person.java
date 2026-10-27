package Day2;

public class Person {
	private String name;
	private int age;
	public static int personCount;
	private static int person_count;

	public static int getPerson_Count() {
		return person_count;
	}
	public Person() {
		name="Vikings";
		age=2335;
		personCount++;
		person_count++;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		personCount++;
		person_count++;
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		personCount++;
		person_count++;
	}
	//Getters and setter Implementation
}
