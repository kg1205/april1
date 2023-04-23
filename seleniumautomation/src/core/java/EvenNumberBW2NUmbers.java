package core.java;

import java.util.Scanner;

public class EvenNumberBW2NUmbers {

	public static void main(String[] args) {

		// while loop

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		System.out.println("enter the 2nd number");
		int m = sc.nextInt();
		/*//doing in while loop
		 * while (n <= m) { if (n % 2 == 0) { System.out.println("even numbers bwn 1-6:"
		 * + n); } n++; }
		 */
		//doing in for loop
				
		for(int i=n;i<=m;i++) {
			if(i%2==0) {
			System.out.println("even num ="+i);
		}else {
			System.out.println("odd mnumbers="+i);
		}
		}
		
	}

}
