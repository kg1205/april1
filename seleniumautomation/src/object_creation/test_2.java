package object_creation;

public class test_2 {
		//class methods with arguments
	public static void main(String[] args) {
		sample2 s1=new sample2();
		sample2 s2=new sample2();
		sample2 s3=new sample2();
		
		s1.setdata(12, 15);
		s2.setdata(54, 15);
		s3.setdata(75, 63);
		
		System.out.println("first object details are");
		s1.display();
		System.out.println("second object details are");
		s2.display();
		System.out.println("third object details are");
		s3.display();
		
	}

}
