package core.java;

import java.util.Scanner;

public class subhalekha {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num");
	int n=sc.nextInt();
	int rev=0;
	int temp=n;
	
	while(n>0) {
		int r=n%10;
		rev=rev*10+r;
		n=n/10;
		
	}
	System.out.println("reverse="+rev);
	System.out.println("temp="+temp);
	System.out.println("n=="+n);
	
	if(rev==temp) {
		System.out.println("given num is palindrome");
	}
	else {
		System.out.println("given num is not palindrome");
	}
	}
}
