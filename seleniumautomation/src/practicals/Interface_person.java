package practicals;

interface Person {
	public void drink();

	public void eat();

}

class Software implements Person {
	public void drink() {
		System.out.println("beer");
	}

	public void eat() {
		System.out.println("biryani");

	}
}

class Student implements Person {
	public void drink() {
		System.out.println("water");
	}

	public void eat() {
		System.out.println("rice");
	}
}

public class Interface_person {

	public static void main(String[] args) {
		Person p1 = new Software();
		p1.drink();
		p1.eat();
		Person p2 = new Student();
		p2.drink();
		p2.eat();

	}

}
