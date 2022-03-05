package programs;

// write a program to check whether the given string is palindrome or not!
public class GivenStrngIsPali {

	public static void main(String[] args) {
		String s = "tyss"; // madam , amma
		String rev =""; //ssyt after execution
		for (int i = s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) { //equalIgnoreCase
			System.out.println("palidrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		}

}
