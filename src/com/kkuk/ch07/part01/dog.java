package com.kkuk.ch07.part01;

public class dog extends Animal {

	String dogTail;
	
	
	
	
	
	
	
	
	public dog(String dogTail) {
		super();
		this.dogTail = dogTail;
	}










	 public dog() {
		super();
		// TODO Auto-generated constructor stub
	}




	public dog(String name, int age, String sound, int legCount) {
		super(name, age, sound, legCount);
		// TODO Auto-generated constructor stub
	}








	public dog(String sound, int legCount) {
		super(sound, legCount);
		// TODO Auto-generated constructor stub
	}








	public dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}








	public void dogrun() {
		System.out.println("강아지 달리긔");
	}
	
	
	
	
	
}
