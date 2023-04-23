package object_creation;

public class sample4 {
	int studentnum;
	int studentid;
	float studentfee;
	String studentname;
	
	sample4(int stnum,int stid, float stfee, String stname){
		studentnum=stnum;
		studentid=stid;
		studentfee=stfee;
		studentname=stname;
	}
	
	public sample4() {
		System.out.println("111");
	}
	public void display() {
		System.out.println("stnum"+studentnum);
		System.out.println("stid"+studentid);
		System.out.println("stfee"+studentfee);
		System.out.println("stname"+studentname);
	}
}
