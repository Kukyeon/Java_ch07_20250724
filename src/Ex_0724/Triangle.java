package Ex_0724;

public class Triangle extends Shape{
 
	double wide;
	double height;
	
	
	public Triangle(double wide, double height) {
		super();
		this.wide = wide;
		this.height = height;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (wide * height) * 0.5;
	}
	
}
