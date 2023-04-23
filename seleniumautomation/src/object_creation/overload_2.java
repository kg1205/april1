package object_creation;

public class overload_2 {

	// overloading method with object creation

	/*
	 * int a; int b; int c;
	 * 
	 * public void setdata() { a = 0; b = 0; c = 0; }
	 * 
	 * public void setdata(int x) { a = x; b = 0; c = 0;
	 * 
	 * }
	 * 
	 * public void setdata(int x, int y) { a = x; b = y; c = 0; }
	 * 
	 * public void setdata(int x, int y, int z) { a = x; b = y; c = z; }
	 * 
	 * public void gani() { System.out.println("a=" + a + "\t" + "b=" + b + "\t" +
	 * "c=" + c); }
	 * 
	 * public static void main(String[] args) { overload_2 o = new overload_2();
	 * overload_2 o1 = new overload_2(); overload_2 o2 = new overload_2();
	 * overload_2 o3 = new overload_2(); o.setdata();
	 * 
	 * System.out.println("first element"); o.gani(); o1.setdata(12);
	 * System.out.println("second element"); o1.gani(); o2.setdata(52, 65);
	 * 
	 * System.out.println("third element"); o2.gani(); o3.setdata(25, 65, 45);
	 * 
	 * System.out.println("fourth element"); o3.gani();
	 */

	// overloading method with arguments passing in constructors.

	int a;
	float b;
	char ch;

	public void setdata() {
		a = 0;
		b = 0;
		ch = 'a';
	}

	public void setdata(int x) {
		a = x;
		b = 0;
		ch = 'a';
	}

	public void setdata(int x, float y) {
		a = x;
		b = y;
		ch = 'a';
	}

	public void setdata(int x, float y, char v) {
		a = x;
		b = y;
		ch = v;
	}

	public void display() {
		System.out.println("a=" + a + "\t" + "b=" + b + "\t" + "ch=" + ch);
	}

	public static void main(String[] args) {
		overload_2 s1 = new overload_2();
		s1.setdata();
		s1.display();
		s1.setdata(12);
		s1.display();
		s1.setdata(12, 25.6f);
		s1.display();
		s1.setdata(12, 26.5f, 'g');
		s1.display();

	}

}
