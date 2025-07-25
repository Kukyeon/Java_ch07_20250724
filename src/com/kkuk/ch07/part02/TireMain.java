package com.kkuk.ch07.part02;

public class TireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tire tire;
		
		tire = new KumhoTire(); //자동 형변환 / upcasting
		//tire.tireCompanyKumho(); -> 자식필드인 금호는 사용불가
		//Tire tire2 = new Tire();
		KumhoTire kumhoTire;
		kumhoTire = (KumhoTire) tire; // 강제형변환 / downcating
		
	    kumhoTire.tireName = " 한국 "; // 위의 강제형변환으로 인해 부모 필드 사용가능
		
		
//	    | 구분      | 업캐스팅                 |   다운캐스팅           |
//	    | -------- | ------------    -----  |     --------------- |
//	    | 방향      | 자식 → 부모              |    부모 → 자식         |
//	    | 캐스팅 필요 | ❌ (자동)               | ✅ (명시적)         |
//	    | 안전성     | 안전                    | 위험 (실행 중 오류 가능) |
//	    | 사용 이유  | 다형성 활용, 코드 유연성 증가 | 자식 클래스의 기능 사용   |

		
		
		
		
		
		
		System.out.println("------------------");
		
	}

}
