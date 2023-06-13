package core.java;

import java.util.Scanner;

public class SumOfNumbers1_10 {

	public static void main(String[] args) {
		int esum=0;
		int osum=0;
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				esum=esum+i;
			}
			else {
				osum=osum+i;
			}
		}
		System.out.println("even sum value  "+esum);
		System.out.println("odd sum value  "+osum);
		
	}

}
