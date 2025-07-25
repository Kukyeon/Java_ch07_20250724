package com.kkuk.ch07.part02.test;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* ----------------업케스팅 UpCating---------------- */
		
		
		Animal animal = new Dog(); // Up Casting 자동형변환
		animal.name = "멍멍이는 멍멍이";
		//animal.age = 4; 아직 Down Casting 강제형변환 안됨 자식클래스 필드접근불가 / 에러발생
		
		animal.sound();// 멍멍이 사운드 부모꺼 메소드 오버라이딩한거라서 실행가능
		
		
		/* ----------------업케스팅 UpCating---------------- */
		
		System.out.println("----------------------------------------");
		
		/* ----------------다운케스팅 Down Casting---------------- */
		
		
		Dog dog;
		dog = (Dog) animal; // DownCating 다운캐스팅 강제형변환
		dog.age = 4;
		dog.name = "멍멍이는 멍멍ㅇ이이이이";
		dog.sound(); // 부모꺼 오버라이딩 한 자기 메소드 울음소리
		
		
		/* ----------------다운케스팅 Down Casting---------------- */
		
		System.out.println("----------------------------------------");
	
		Animal animal2 = new Animal(); // 인스턴스화 진행 -> 실제 객체가 Animal 클레스로 만들어짐
		//Dog dog2 = (Dog) new Animal(); //Class Cast Exception 에러발생
		
		
		/* ----------------업, 다운케스팅 UpCating , DownCasting---------------- */
		/* ----------------업캐스팅과 다운캐스팅을 사용한 자식 접근 연습---------------- */
		
		Animal animal3 = new Cat(); // 업케스팅 UpCating
		//animal3.eat(); 자식클래스 메서드 접근불가 / 에러발생
		Cat cat = (Cat) animal3;
		cat.eat(); // 자식 메소드 접근 가능
		
		System.out.println("----------------------------------------");
		
		Dog dog3;
		// 다운 캐스팅 할때 instanceof 연산자로 확인 후 다운캐스팅을 하게되면 안전하게 가능
		if(animal instanceof Dog) { // 조건식에서 true가 나옴
			dog3 = (Dog) animal;    //  Animal이 Dog클레스로 만든 객체를 참조하고있다는것을확인
			dog3.sound();
			
		/* ----------------업, 다운케스팅 UpCating , DownCasting---------------- */	
		}
	}

}
