package com.kkuk.ch07.part02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double a; // 8byte
		int b = 10; // 4byte
		a = b; // 자동 형번환
		b = (int) a; // 강제형번환
		
//		String c = "100";
//		int d = Integer.parseInt(c); // 문자열을 정수로 변환
//		
		
		Person person = new Person();
		Student student = new Student();
		Soldier soldier = new Soldier();
		
		person = student;  // 부모클레스는 자식클레스를 다 받을수있다 , / 자동형변환
		soldier = (Soldier)person;  // 자식클레스에서 부모클레스를 받으려면 강제형변환
		//soldier = ()student; // 자식클레스끼리는 강제형변환이안됨 구조 자체가 다름
		
		Person person2 = new Student(); // 부모는 자식꺼 받을수있음
		person2 = new Soldier(); // 자식을 받아주고있던 부모가 다른 자식으로 바꿔서 받을수도있음;
		
		System.out.println("------------------");
		
		
		Car myCar = new Car();
		
		myCar.carName = "소나타";
		myCar.year = 2010;
		
		myCar.forntTire = new KumhoTire(); // 부모자식관계를 이용해서 car에 선언된 tire부모객체를 사용해서 자식까지 사용
		myCar.rearTire = new HankookTire(); // 이후에 다른 자식이 생겼을때 다양하게 수정가능 / 필드의 다양성
		
		
	}

}
