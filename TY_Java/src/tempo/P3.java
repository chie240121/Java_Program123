package tempo;

import java.util.HashSet;

//Print Only Duplicates In A Given String
public class P3 {

	public static void main(String[] args) {
		String s = "elephanta";
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i <s.length(); i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			if(count>=2) {
				System.out.println(ch + " = " + count);
			}
		}
	}

}
