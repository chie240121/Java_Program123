package programs;
 //  0 1 1 2 3 5 8 13 .........!!
// print first 5 numbers fibnoccai numbers including default no.s that is 0 and 1!
public class PrintFirstFiveFibnoccaiNumberIncludingDefalutValues {

	public static void main(String[] args) {
		// 0 and 1 is the default fibnoccai numbers
		int  a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i<3; i++) {
			int c = a+b; 
			System.out.println(c); 
			a=b; 
			b=c;  
			
}
	}

}
