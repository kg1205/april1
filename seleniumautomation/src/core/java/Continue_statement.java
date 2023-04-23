package core.java;

import java.util.Scanner;

public class Continue_statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int n = sc.nextInt();
		System.out.println("enter the 2nd num");
		int m = sc.nextInt();

		for (int i = n; i <= m; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

	}

}
