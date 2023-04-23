package core.java;

public class Break_loop {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			if (i >= 5) {

				break;
			}

		}
		System.out.println("loop terminated");

		/*
		 * int i = 0; while (i <= 10) { if (i == 5) { System.out.println(i); break;
		 * //continue; } i++; }
		 */

		System.out.println("break terminated");

	}

}
