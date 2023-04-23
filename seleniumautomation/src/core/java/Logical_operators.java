package core.java;

public class Logical_operators {

	public static void main(String[] args) {
		int a=10,b=15;
		System.out.println((a<b)&&(b>a));
		System.out.println((b<a)&&(a<b));
		System.out.println((a>b)||(b>a));
		System.out.println((a<b)||(b<a));
		System.out.println(!(a==b));
		System.out.println(!(a>b));
	}

}
