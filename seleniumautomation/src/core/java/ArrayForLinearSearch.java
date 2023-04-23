package core.java;

import java.util.Scanner;

public class ArrayForLinearSearch {

	public static void main(String[] args) {

		/*
		 * int a[] = { 1, 14, 12, 54, 55, 75, 84, 86, 52, 66, 63, 69 }; Scanner sc = new
		 * Scanner(System.in); System.out.println("enter the your number"); int n =
		 * sc.nextInt(); boolean flag = false; for (int i = 0; i < a.length; i++) { if
		 * (n == a[i]) { flag = true; System.out.println("your number found at:" + i);
		 * 
		 * }
		 * 
		 * } if (!flag) { System.out.println("your num not found"); }
		 */

		/*
		 * int a[]=new int[5]; a[0]=1; a[1]=1; a[2]=1; a[3]=1; a[4]=1;
		 */

		int a[] = { 12, 14, 12, 54, 55, 75, 84, 86, 12, 12, 12 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input num:");
		int n = sc.nextInt();
		int count = 0;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				count++;
				flag = true;
				System.out.println("num found at :" + i);
			}
		}
		if (!flag) {
			System.out.println("num not found");
		}
		System.out.println("given num found " + count + "times");

		/*
		 * String[] a = { "gani", "mani", "gini", "tarani" }; Scanner sc = new
		 * Scanner(System.in); System.out.println("enter the name :"); String str =
		 * sc.next(); System.out.println(str); boolean flag = false; for (int i = 0; i <
		 * a.length; i++) { if (str.equalsIgnoreCase(a[i])) { flag = true;
		 * System.out.println("name found at position :::" + i); break;
		 * 
		 * } } if (!flag) { System.out.println("name not found"); }
		 */
	}

}
