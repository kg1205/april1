package core.java;

public class Strings {

	public static void main(String[] args) {
		/*
		 * //char ch[]= {'g','a','n','e','s','h'};
		 * 
		 * String s1 = "hyderabd"; System.out.println(s1); String s2=new String(ch,0,5);
		 * System.out.println(s2);
		 * 
		 * char n=s1.charAt(2); System.out.println(n);
		 */
		
		String s1="hello";
		String s2="Hello";
		String s3="chilo";
		String s4="bello";
		
		System.out.println(s1.compareTo(s2));//when comparitg 2same words with different cases it desplays o/p=32
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareToIgnoreCase(s2));//when case is different we ave use compareToIgnoreCase this acse
	}

}
