package com.kkuk.ch07.part01;

public class Triangle extends Shape{

	@Override //annotation
	public double area() {
		double area = width * height * 0.5;
		return area;
	}
	
//	public double area() { // 메소드 오버라이딩 자식
//						// 부모의 내용을 받아와서 내용만 재정의 / 살짝 수정하는눠낌 ( * 0.5 ) 내용추가함;;
//		double area = width * height * 0.5;
//		return area;
//		
//	}
	
	
	
	
	
	
	
	
}
