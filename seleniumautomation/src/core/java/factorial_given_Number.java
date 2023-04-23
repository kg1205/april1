package core.java;

import java.util.Scanner;

public class factorial_given_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int fact=1;
		while(n>=1) {
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
	}

}
