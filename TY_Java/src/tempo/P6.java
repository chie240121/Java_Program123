package tempo;

import java.util.LinkedHashSet;

// Remove duplicates words and print the string sentence
public class P6 {

	public static void main(String[] args) {
		String s = "Mom Is God LOVE n god love mom love";
		s=s.toLowerCase();
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		for (String word : set) {
			System.out.print(word + " ");
		}
	}

}
