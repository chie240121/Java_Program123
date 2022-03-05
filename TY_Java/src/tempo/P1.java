package tempo;

import java.util.HashSet;

// print the No Of occurrence Of Each Char in given string
public class P1 {

	public static void main(String[] args) {
		String s = "koyal";
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
		}
	System.out.println(set);
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i <s.length(); i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
		System.out.println(ch + " = " + count);
		}
	}


}
