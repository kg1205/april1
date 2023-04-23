package core.java;

import java.util.Scanner;

public class For_for_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int n=sc.nextInt();
		System.out.println("enter the 2nd num");
		int m=sc.nextInt();
		for(int i=n;i<=m;i++) {
			for(int j=n;j<=m;j++) {
				if(i==1&&j==2) {
					
					//break;
					continue;
				}
				System.out.println(i+ "   "+j);
			}
		}
	}

}
