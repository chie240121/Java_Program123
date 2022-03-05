package tempo;

import java.util.LinkedHashSet;

// print only unique words in the string sentence
public class P0 {

	public static void main(String[] args) {
		String s ="welcome to dilli welcome to ghar";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		for (String word : set) {
			int count =0;
			for (int i = 0; i < str.length; i++) {
				if(word.equals(str[i])) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(word);
			}
		}
 	}

}
