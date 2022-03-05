package tempo;

import java.util.LinkedHashSet;

// remove duplicates character in given string and print in insertion order 

public class P5 {

	public static void main(String[] args) {
		String s = "elephanta";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			System.out.print(ch);
		}
	}

}
