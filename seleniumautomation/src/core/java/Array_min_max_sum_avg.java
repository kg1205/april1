
package core.java;

import java.util.Scanner;

public class Array_min_max_sum_avg {

	public static void main(String[] args) {

		int a[] = { 11, 45, 95, -45, -35, 36 };
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		float avg = (float) sum / a.length;
		System.out.println("count of nums" + a.length);
		System.out.println("max num" + max);
		System.out.println("min num" + min);
		System.out.println("sum of nums" + sum);
		System.out.println("avg of nums" + avg);

		// just for understanding

		/*
		 * int a[] = { 1, 2, 3 }; int b[] = new int[5]; b[0] = 15; b[1] = 12; b[2] =
		 * 156; b[3] = 142; b[4] = 121; for (int i = 0; i < a.length; i++) {
		 * System.out.println(a[i]); }
		 * System.out.println("___________________________________-"); for (int j = 0; j
		 * < b.length; j++) { System.out.println(b[j]); }
		 * 
		 * // using system input
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("given num of inputs to arrays:"); int n = sc.nextInt();
		 * int a[] = new int[n]; for (int i = 0; i < a.length; i++) {
		 * System.out.println("enter the element:"); a[i] = sc.nextInt(); } int sum = 0;
		 * int max = a[0]; int min = a[0]; for (int i = 1; i < a.length; i++) {
		 * 
		 * sum = sum + a[i]; if (a[i] > max) { max = a[i];
		 * 
		 * } if (a[i] < min) { min = a[i]; }
		 * 
		 * } float avg = (float) sum / a.length;
		 * System.out.println("number of elements:" + a.length);
		 * System.out.println("sum" + sum); System.out.println("max" + max);
		 * System.out.println("min" + min); System.out.println("avg" + avg);
		 * 
		 * // using while loop with system input Scanner sc = new Scanner(System.in);
		 * System.out.println("enter the num of inputs to array:"); int n =
		 * sc.nextInt(); int a[] = new int[n]; int i = 0; while (i < a.length) {
		 * System.out.println("enter the input values:");
		 * 
		 * a[i] = sc.nextInt(); i++; } int sum = 0; int max = a[0]; int min = a[0]; int
		 * j = 1; while (j < a.length) {
		 * 
		 * if (a[j] > max) { max = a[j]; } if (a[j] < min) { min = a[j]; } sum = sum +
		 * a[j]; j++; }
		 * 
		 * float avg = (float) sum / a.length; System.out.println("number of elements:"
		 * + a.length); System.out.println("sum" + sum); System.out.println("max" +
		 * max); System.out.println("min" + min); System.out.println("avg" + avg);
		 */
	}

}
