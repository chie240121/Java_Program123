package programs;
// // print first 5 numbers fibnoccai numbers excluding default no.s that is 0 and 1!
public class PrintFirstFiveFibnoccaiNumberExcludingDefalutValues {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		for (int i = 0; i < 5; i++) {
			int c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
			
		}
	}

}
