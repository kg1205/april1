package object_creation;

public class sample3 {
	int studentid;
	String studentname;
	float studentfee;
	int studentage;
	sample3(){
		System.out.println("1111111111");
	}
	sample3(int stid,String stname,float stfee,int stuage){
		System.out.println("222222222222");
		studentid=stid;
		studentname=stname;
		studentfee=stfee;
		studentage=stuage;
	}

	/*
	 * public void setdata(int stid,String stname,float stfee,int stuage) {
	 * studentid=stid; studentname=stname; studentfee=stfee; studentage=stuage; }
	 */
	public void display() {
		System.out.println("studnet details are:");
		System.out.println("studentid:::" +studentid);
		System.out.println("studentname::" +studentname);
		System.out.println("studentfee::" +studentfee);
		System.out.println("studentage::" +studentage);
		
	}
}
