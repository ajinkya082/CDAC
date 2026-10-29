package Object_class_methods;

public class EqualsMain {

	public static void main(String[] args) {
//		int data=100;
//		int anotherData=100;
//		System.out.println(data==anotherData);
		Planet bigestPlanet=new Planet("Jupiter" , 60);
		Planet largestPlanet=new Planet("Jupiter" , 60);
//		Planet largestPlanet=bigestPlanet;
		System.out.println(bigestPlanet.equals(largestPlanet));
//		System.out.println(bigestPlanet==largestPlanet);
	}

}
