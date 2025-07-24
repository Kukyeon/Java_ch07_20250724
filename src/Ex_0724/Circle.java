package Ex_0724;

public class Circle extends Shape {

	double radius;
	double Pi;
	
	public Circle(double radius, double Pi) {
		super();
		this.radius = radius;
		this.Pi = Pi;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (radius*radius)*Pi;
	}

	
	
	
}
