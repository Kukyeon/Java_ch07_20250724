package Ex_0724;

public class Truck extends Car {

	int weight;
	
	
	public Truck(int year, String name, int wheel, int weight) {
		super(year, name, wheel);
		this.weight = weight;
	}

	public void printTruckInfo() {
		System.out.println("트럭 정보:");
        System.out.println("연식: " + year);
        System.out.println("이름: " + name);
        System.out.println("바퀴 수: " + wheel);
        System.out.println("무게: " + weight + "kg");
	}

	
}
