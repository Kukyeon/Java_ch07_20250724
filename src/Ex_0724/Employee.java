package Ex_0724;

public class Employee extends Person {

	String company;

	public Employee(String name, int age, String company) {
		super(name, age);
		this.company = company;
	}
	
	@Override
	public void printPerson() {
		System.out.println("안녕하세요. 회사 근무중인 " + name + "이고, 나이는 " + age + "살이고, " + company + " 회사에 다닙니다.");
		super.printPerson();
	}
	
	
}
