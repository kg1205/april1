package core.java;

import java.util.Scanner;

public class MArksGreaterOrEqual40 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks in 1st sub:");
		int m1=sc.nextInt();
		System.out.println("enter the marks in 2nd sub:");
		int m2=sc.nextInt();
		System.out.println("enter the marks in 3rd sub");
		int m3=sc.nextInt();
		
		//USING NESTED IF CONDITION
		
		/*if(m1>=40) {
			if(m2>=40) {
				if(m3>=40) {
					System.out.println("pass");
				}
				else {
					System.out.println("fail");
				
				}}
				else {
					System.out.println("fail");
				}
			}else {
				System.out.println("fail");
		}*/
		
		//USING &&(AND) OPERATOR
		
		/*if(m1>=40 && m2>=40 && m3>=40) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}*/
		
		//USING LADDER IF CONDITION
		
		if(m1<40) {
			System.out.println("fail");
		}
		else if(m2<40) {
			System.out.println("fail");
		}
		else if(m3<40) {
			System.out.println("fail");
		}
		else {
			System.out.println("pass");
		}
	}

}
