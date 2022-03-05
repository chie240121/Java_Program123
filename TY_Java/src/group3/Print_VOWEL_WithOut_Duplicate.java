package group3;

import java.util.HashSet;

public class Print_VOWEL_WithOut_Duplicate {

	public static void main(String[] args) {
		String s = "India";
		s=s.toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) { // i n d a
			int count=0;
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
				System.out.println(ch + " " + count);
			}
		}

	}

}
