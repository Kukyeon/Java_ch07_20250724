package Ex_0724;

public class Tiger extends Animal{

	public Tiger(int age, String name) {
		super(age, name);
	}

	@Override
	public void bark() {
		System.out.println(name + " 의 나이는 " + age +  " 살이고 호랑이는 어흥어흥");
		super.bark();
	}

	
	
}
