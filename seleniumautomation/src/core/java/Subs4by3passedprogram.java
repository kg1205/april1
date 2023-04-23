package core.java;

import java.util.Scanner;

public class Subs4by3passedprogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st sub marks:");
		int m1=sc.nextInt();
		System.out.println("enter the 2nd sub marks:");
		int m2=sc.nextInt();
		System.out.println("enter the 3rd sub marks:");
		int m3=sc.nextInt();
		System.out.println("enter the 4th sub marks:");
		int m4=sc.nextInt();
		 
		int passcount=0;
		if(m1>=40) {
			passcount++;
		}
		if(m2>=40) {
			passcount++;
		}
		if(m3>=40) {
			passcount++;
		}
		if(m4>=40) {
			passcount++;
		}
		if(passcount>=3) {
			System.out.println("student passed ");
		}
		else {
			System.out.println("student failed");
		}
		if(passcount>3) {
			System.out.println("passed in 4 subs");
		}
		if(passcount>2) {
			System.out.println("passed in 3 or 4 subs");
		}
		
	}

}
