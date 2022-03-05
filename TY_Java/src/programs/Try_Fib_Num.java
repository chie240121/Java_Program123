package programs;

public class Try_Fib_Num {

	public static void main(String[] args) {
		int a=0;
		int b =1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 60; i++) {
		int	c=a+b;
		if(c<55) {
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
