package com.kkuk.ch07.part02;

public class Car { 
	
	//필드에
	String carName;
	int maxSpeed;
	int year;
	int carPrice;
	
	
//	Tire forntTire = new KumhoTire();  // 앞바퀴 - 금호
//	Tire rearTire = new HankookTire();  // 뒷바퀴 - 한국
	
	Tire forntTire;   // 앞바퀴
	Tire rearTire;	 // 뒷바퀴
	
	// 매개변수의 인수로 금호타이어객체가 들어오면->금호 , 
	// 한국타이어객체가 들어오면->한국  이런식으로 출력하는 메소드 ↙
	//타이어의 이름을 출력한다 생각하고....
	public void tireprintln(Tire tire) { 
		tire.tireName();
	}
	
	
}
