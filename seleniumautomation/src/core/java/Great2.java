package core.java;

import java.util.Scanner;

public class Great2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the 1st num");
		int a=sc.nextInt();
		System.out.println("enter 2nd num");
		int b=sc.nextInt();
		System.out.println("enter 3rd num");
		int c=sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater");
			}
			else {
				System.out.println("b is greater");
			}
		}
		else if(b>c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
		
	}

}
