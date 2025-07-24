package Ex_0724;

public class Dog extends Animal {

	
	

	public Dog(int age, String name) {
		super(age, name);
	}

	@Override
	public void bark() {
		System.out.println(name + " 의 나이는 " + age +  " 살이고 강아지는 멍멍");
		super.bark();
	}

	
	
	
	
}
