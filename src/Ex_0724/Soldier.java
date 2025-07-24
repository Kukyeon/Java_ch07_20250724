package Ex_0724;

public class Soldier extends Person {

	String rank;

	public Soldier(String name, int age, String rank) {
		super(name, age);
		this.rank = rank;
	}

	@Override
	public void printPerson() {
		System.out.println("안녕하세요. 군대 복무중인 " + name + "이고, 나이는 " + age + "살이고, " + rank + " 계급입니다.");
		super.printPerson();
	}

	
	
}
