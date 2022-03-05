 package programs;

import java.util.HashSet;


public class CheckTheSentenceIsPalindromeOrNot {

	public static void main(String[] args) {
		String s = "amma eye madam eye amma";
		//String[] str = s.split(" ");
		String k = "";
		for (int i = s.length()-1; i>=0; i--) 
		{
			
			k=k+s.charAt(i);
			//System.out.print(str[i] + " ");
			
		}
			//System.out.println(k);
			k.trim();
			if(s.equals(k)) {
				System.out.println( k + " is palindrome");
		}
		else {
			System.out.println(k + " is not palindrome");
		}
	}
		
	}


