package programs;
// Swap Integer Without Using Third Variable
public class SwapIntegerWithoutUsingThirdVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a=a+b; //30 
		b = a-b; //30(sum=a)-b =10
		a=a-b; //30(sum)-b=10
		System.out.println(a + "  " +  b);
		
	}

}
