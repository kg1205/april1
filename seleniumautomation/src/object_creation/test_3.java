package object_creation;

public class test_3 {

	public static void main(String[] args) {
		sample3 s1=new sample3();
		sample3 s2=new sample3(12, "gani", 25.500f, 24);
//		sample3 s3=new sample3();
		
		/*
		 * s1.setdata(12, "gani", 25.500f, 24); s2.setdata(24, "mani", 24.66f, 25);
		 * s3.setdata(36, "fani", 25.800f, 26);
		 */
		
		s1.display();
		s2.display();
//		s3.display();
	}

}
