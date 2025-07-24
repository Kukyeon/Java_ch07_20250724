package Ex_0724;

public class Bus extends Car{

	int weight;
	String color;
	
	public Bus(int year, String name, int wheel, int weight, String color) {
		super(year, name, wheel);
		this.weight = weight;
		this.color = color;
	}

	public void printBusInfo() {
		System.out.println("버스 정보:");
        System.out.println("연식 : " + year);
        System.out.println("이름 : " + name);
        System.out.println("바퀴 수 : " + wheel);
        System.out.println("무게 : " + weight + "kg");
        System.out.println("색갈 : " + color);
	}

	
}
