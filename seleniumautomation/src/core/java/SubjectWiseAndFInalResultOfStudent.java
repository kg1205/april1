package core.java;

import java.util.Scanner;

public class SubjectWiseAndFInalResultOfStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st sub marks");
		int m1=sc.nextInt();
		System.out.println("enter the 2nd sub marks ");
		int m2=sc.nextInt();
		System.out.println("enter the 3rd sub marks");
		int m3=sc.nextInt();
		
		int passcode=0;
		if(m1>=40) {
			passcode++;
			System.out.println("sub1 is passed");
		}
		else {
			System.out.println("sub1 failed");
		}
		if(m2>=40) {
			passcode++;
			System.out.println("sub 2 is passed");
		}
		else {
			System.out.println("sub2 failed");
		}
		if(m3>=40) {
			passcode++;
			System.out.println("sub3 is passed ");
		}
		else {
			System.out.println("sub3 failed");
		}
		if(passcode>=3) {
			System.out.println("all subs passed");
		}
		else {
			System.out.println("failed");
		}
	}
	
}
