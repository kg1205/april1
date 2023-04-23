package object_creation;

public class overload1 {
	public void display() {
		System.out.println("no args");
	}
	public void display(int x) {
		System.out.println("one args");
	}
	public void display(int x,int y) {
		System.out.println("two args");
	}
	public void display(int x,int y, int z) {
		System.out.println("three args");
	}

	public static void main(String[] args) {
		overload1 o=new overload1();
		o.display();
		o.display(12);
		o.display(12, 45);
		o.display(14, 454, 656);
	}

}
