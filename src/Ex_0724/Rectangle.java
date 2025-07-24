package Ex_0724;

public class Rectangle extends Shape{

	double width;
	double height;
	
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
	
	
}
