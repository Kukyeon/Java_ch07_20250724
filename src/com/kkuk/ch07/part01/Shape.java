package com.kkuk.ch07.part01;

public class Shape { // 부모 클래스 

	int width;
	int height;
	String color; // 도형면의 색갈
	
	
	public double area() { // 도형의 면적 계산 메소드 , 메소드오버라이딩 부모꺼 
		int area = width * height;
		return area;
	}
	
}
