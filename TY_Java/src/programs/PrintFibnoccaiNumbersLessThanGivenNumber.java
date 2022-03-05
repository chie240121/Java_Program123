package programs;
// print fibnocaai numbers less than 25 excluding 0 & 1 
public class PrintFibnoccaiNumbersLessThanGivenNumber {

	public static void main(String[] args) {
		int a = 0;
		int b =1;
		
		for (int i = 0; i < 25; i++) {
			int c=a+b;
			if(c<25) {
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
