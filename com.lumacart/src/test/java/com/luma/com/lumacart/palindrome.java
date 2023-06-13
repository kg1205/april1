package com.luma.com.lumacart;

public class palindrome {
	public static void main(String[] args) {
		String str;
		String reverse = "";
		
		str="madam";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse)) {
			System.out.println(reverse+" is palindrome");
		}
		else {
			System.out.println(reverse+" is not palindrome");
		}
	}
}
