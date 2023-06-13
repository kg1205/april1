package core.java;

import java.util.Scanner;

public class SumOfDigitsOfGivenNUmber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;

		while(n>0) {
			int r=n%10;//r=12%10==>r=2//r=1%10==>r=
			sum=sum+r;//sum=0+2==>2
			n=n/10;//n=12/10==>n=1
			
		}
		System.out.println(sum);
	}

}
