package com.kkuk.ch07.part01;

public class Dog extends Animal {

	String dogTail;
	
	public Dog(String dogTail) {
		super();
		this.dogTail = dogTail;
	}
	

	 public Dog() {
		super(); // 부모 클래스의 생성자 호출
		// TODO Auto-generated constructor stub
	}




	public Dog(String name, int age, String sound, int legCount) {
		super(name, age, sound, legCount);
		// TODO Auto-generated constructor stub
	}








	public Dog(String sound, int legCount) {
		super(sound, legCount);
		// TODO Auto-generated constructor stub
	}














	public void dogrun() {
		System.out.println("강아지 달리긔");
	}
	
	
	
	
	
}
