package tempo;

import java.util.LinkedHashSet;

// Find number of occurrence of each word in the given string sentence
public class P8 {

	public static void main(String[] args) {
		String s = "welcome to delhi welcome to delhi ghar";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
			
		}
		for (String word : set) {
			int count=0;
			for (int i = 0; i < str.length; i++) {
				if(word.equals(str[i])) {
					count++;
				}
			}
			System.out.println(word + " = " + count);
		}
		
	}

}
