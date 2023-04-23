package object_creation;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEno(12);
		e.seteName("ganesh");
		e.setSal(1326543.511);
		System.out.println(e.getEno());
		System.out.println(e.geteName());
		System.out.println(e.getSal());
	}

}
