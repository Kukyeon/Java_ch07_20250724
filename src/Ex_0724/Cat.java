package Ex_0724;

public class Cat extends Animal{

	public Cat(int age, String name) {
		super(age, name);
	}

	@Override
	public void bark() {
		System.out.println(name + " 의 나이는 " + age +  " 살이고 고양이는 야옹야옹");
		super.bark();
	}

	

	
}
