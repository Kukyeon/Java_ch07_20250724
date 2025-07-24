package com.kkuk.ch07.part01;

public class Shape { // 부모 클래스 

	int width;
	int height;
	String color; // 도형면의 색갈
	
	
	public int area() { // 도형의 면적 계산 메소드
		int area = width * height;
		return area;
	}
	
}
