package Ex_0724;

public class Animal {

	
	int age;
	String name;
	
	
	public Animal(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	public void bark() {
		System.out.println(name + " 의 나이는 " + age +  " 살이고 울음소리는");
	}
	
	
}
