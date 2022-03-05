package tempo;

public class NoisPali {

		
	public static void main(String[] args) {
		int n = 1231;
		int rev=0;
		int temp=n;
		while(temp>0) {
			int last_Dig=temp%10;
			rev=rev*10+last_Dig;
			temp=temp/10;
		}
		if(n==rev) {
			System.out.println(n + " is palindrome ");
		}
		else {
			System.out.println(n + " is nott palindrome ");
		}
	}

}
