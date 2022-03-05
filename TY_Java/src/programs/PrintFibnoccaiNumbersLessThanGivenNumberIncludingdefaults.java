package programs;
// print fibnoccai numbers less than 40 including defaults |
public class PrintFibnoccaiNumbersLessThanGivenNumberIncludingdefaults {

	public static void main(String[] args) {
		int a =0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 40; i++) {
			int c=a+b;
			if(c<40) {
			System.out.println(c);
			a=b;
			b=c;
		}
			else {
				break;
			}
	}
	}
}

// 0 1 1 2 3 5 8..