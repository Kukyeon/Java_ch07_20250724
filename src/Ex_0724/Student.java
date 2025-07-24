package Ex_0724;

public class Student extends Person {

	String school;

	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}

	@Override
	public void printPerson() {
		System.out.println("안녕하세요. 학교에다니는 " + name + "이고, 나이는 " + age + "살이고, " + school + "에 다니고 있습니다.");
		super.printPerson();
	}

	
	
	
}
