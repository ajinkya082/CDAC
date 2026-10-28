package Day3;

 public class Circle extends Shape {

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a circle using some compass");
	}

	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		System.out.println("finding the area using formula:PI R SQUARE");
	}

}

class SemiCircle extends Circle{
	
}
