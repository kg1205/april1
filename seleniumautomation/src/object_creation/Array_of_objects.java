package object_creation;

import java.util.Scanner;

public class Array_of_objects {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee[] emp=new Employee[4];		//creating array of references
		for(int i=0;i<emp.length;i++) {
			System.out.println("enter emp datails");
			System.out.println("enter emp id");
			int id=sc.nextInt();
			System.out.println("enter emp name");
			String name=sc.next();
			System.out.println("enter emp salary");
			double salary=sc.nextDouble();
			System.out.println("enter emp team");
			String team=sc.next();
			System.out.println("gender of emp");
			String gender=sc.next();
			emp[i]=new Employee();
			
			
			
		}
		
	}

}
