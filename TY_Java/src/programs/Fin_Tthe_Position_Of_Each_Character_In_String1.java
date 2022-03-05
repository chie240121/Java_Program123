package programs;

import java.util.LinkedHashSet;

public class Fin_Tthe_Position_Of_Each_Character_In_String1 {

	public static void main(String[] args) {
		String s = "Tester";
		s=s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		System.out.println(set);
		
		for (Character ch : set) {
			for (int i =0; i<s.length(); i++) {
				if(ch==s.charAt(i)) { 
					//System.out.println("position of " + ch + " is " + (i+1));
					System.out.println(ch + " = " + (i+1) );
					break;
				}
			}
			
			
		}
	}

}