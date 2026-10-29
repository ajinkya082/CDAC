package Object_class_methods;

public class ToStringMain {

	public static void main(String[] args) {
		Planet myPlanet=new Planet();
		
//		int data=200;
//		System.out.println(data);
		
		//implicit call to toString method
		System.out.println(myPlanet);
		//explicit call
		System.out.println(myPlanet.toString());
		
//		System.out.println(myPlanet.getName());
//		System.out.println(myPlanet.getMoons());
	}

}
