package Ex_0724;

public class Person {

	String name;
	int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void printPerson() {
        System.out.println("안녕하세요. 제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
	
	}	
}
