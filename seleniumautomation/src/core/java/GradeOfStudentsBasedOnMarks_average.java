package core.java;

import java.util.Scanner;

public class GradeOfStudentsBasedOnMarks_average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st number");
		int m1=sc.nextInt();
		System.out.println("enter the 2nd number:");
		int m2=sc.nextInt();
		System.out.println("enter the 2nd number:");
		int m3=sc.nextInt();
		
		if(m1>=40&&m2>=40&&m3>=40) {    //its needed when all the marks above 40(mentioned)
			int avg=(m1+m2+m3)/3;       //we can go direct average method 
			if(avg>=90) {
				System.out.println("passed in A Grade");
			}
			else if(avg>=80) {
				System.out.println("passed in B grade");
			}
			else if(avg>=70) {
				System.out.println("passed in C Grade");
			}
			else if(avg>=60) {
				System.out.println("passed in D Grade");
			}
			else {
				System.out.println("failed");
			}
		}
	}

}
