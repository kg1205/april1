package core.java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;

		while(n>0) {
			int r=n%10;//12345%10 =>(r=3)
			 rev=rev*10+r;//0=0*10+3==>rev=3
			 n=n/10;//12345/10==>n=12
		}

		System.out.println("reverse =" + rev);
		System.out.println("temp =" + temp);
		System.out.println("n =" + n);

		if (rev == temp) {
			System.out.println("given is palindrome");
		} else {
			System.out.println("given not palindrome");
		}
	}

}
