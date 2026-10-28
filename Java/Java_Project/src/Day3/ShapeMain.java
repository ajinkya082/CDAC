package Day3;

public class ShapeMain {

	public static void main(String[] args) {
		Shape sh;
		sh=new Rectangle();
		sh.draw();
		sh.findArea();
		sh.erase();
		System.out.println("=================================");
		sh=new Circle();
		sh.draw();
		sh.findArea();
		sh.erase();
	}

}
