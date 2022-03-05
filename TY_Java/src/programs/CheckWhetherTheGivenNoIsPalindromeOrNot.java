package programs;
// Check Whether The Given No Is Palindrome Or Not
public class CheckWhetherTheGivenNoIsPalindromeOrNot {

	public static void main(String[] args) {
		int n = 121;
		int temp=n;
		int rev=0;
		while(temp>0) {
			int last_Digit = temp%10;
			rev=rev*10+last_Digit;
			temp=temp/10;
		}
		
		if(n==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
