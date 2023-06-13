package core.java;

public class sumOfEven_Odd_From1_10 {

	public static void main(String[] args) {
		/*
		 * int i = 1; int sum = 0; while (i <= 10) { sum = sum + i;
		 * System.out.println(sum); i++; }
		 */
	int i=1;
	int esum=0;
	int osum=0;
	while(i<=10) {
		if(i%2==0) {
			esum=esum+i;
		}
		else {
			osum=osum+i;
		}
		i++;
		System.out.println(esum);
		//System.out.println(osum);
	}
	
	}

}
