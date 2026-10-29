package inner_classes;

public class InnerClassesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer.StaticInner si=new Outer.StaticInner();
//		Outer.Nested ne=new Outer.Nested();
		System.out.println("===============================Static Inner Class===============================");
		si.print();
		System.out.println("===============================Nested Class===============================");
		Outer oc=new Outer();
//		Outer.Nested ns=new Outer().new Nested();
		Outer.Nested ns=oc.new Nested();
		ns.display();
		System.out.println("===============================Local Class===============================");
		oc.showGreeting();
	}

}
