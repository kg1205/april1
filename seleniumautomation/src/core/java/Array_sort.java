package core.java;

import java.util.Arrays;

public class Array_sort {

	public static void main(String[] args) {
		/*
		 * int a[]= {51,45,78,55,65,95,75,25,36}; System.out.println("before sorting:");
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); } Arrays.sort(a);
		 * System.out.println("after sorting:"); for(int i=0;i<a.length;i++) {
		 * System.out.println(a[i]);
		 * 
		 * 
		 * }
		 */
		/*
		 * String a[]= {"gani","mani","chinni","minni"};
		 * System.out.println("before sorting:"); for(int i=0;i<a.length;i++) {
		 * System.out.println(a[i]);
		 * 
		 * } Arrays.sort(a); System.out.println("after sorting:"); for(int
		 * i=0;i<a.length;i++) { System.out.println(a[i]);
		 * 
		 * }
		 */
		char ch[]= {'d','e','h','j','q','n','b','i'};
		System.out.println("before sorting:");
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		Arrays.sort(ch);
		System.out.println("after sorting:");
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		}

}
