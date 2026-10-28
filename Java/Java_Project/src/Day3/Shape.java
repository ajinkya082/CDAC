package Day3;

public abstract class Shape {
	public abstract void draw();
	public abstract void findArea();
	public final void erase() {
		System.out.println("Erasing a shape using an eraser");
	}
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
}
