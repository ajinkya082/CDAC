package Day2;

public class PersonMain {

	static {
		System.out.println("Person Static block is get loaded "+(10+50));
		
	}
	
	public static void main(String[] args) {
		System.out.println("Execution begins");
		Person p1=new Person();
		Person p2=new Person("Tom",250);
		Person p3=new Person(233,"Jerry");

		System.out.println("current persons:"+Person.personCount);
		System.out.println("current persons:"+Person.getPerson_Count());
		new Person();
		new Person(22,"A");
		System.out.println("current persons:"+Person.personCount);
		for(int i=1;i<=10;i++) {
			new Person();
		}
		System.out.println("current persons:"+Person.personCount);
		System.out.println("final count of Persons: "+ Person.getPerson_Count());
	}

}
