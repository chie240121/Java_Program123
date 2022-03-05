package tempo;

import java.util.LinkedHashSet;

//  print only duplicates words
public class P4 {

	public static void main(String[] args) {
		String s = "mom is god n god loves mom love";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		for (String word : set) {
			int count = 0;
			for (int i = 0; i < str.length; i++) {
				if(word.equals(str[i])) {
					count++;
				}
			}
			if(count>=2) {
				System.out.println(word + " = " + count);
			}
		}
	}

}
