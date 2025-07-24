package Ex_0724;

public class SportsCar extends Car{

	int weight;
	
	
	public SportsCar(int year, String name, int wheel, int weight) {
		super(year, name, wheel);
		this.weight = weight;
	}

	public void printCarInfo() {
		System.out.println("차량 정보:");
        System.out.println("연식 : " + year);
        System.out.println("이름 : " + name);
        System.out.println("바퀴 수 : " + wheel);
        System.out.println("무게 : " + weight + "kg");
	}

	
}
