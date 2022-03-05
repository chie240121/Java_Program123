package group2;

import java.util.LinkedHashSet;

/**
 * Remove duplicates words and print the string sentence
 * @author kajal
 *
 */
//welcome to india welcome to mandya ------>welcome to india mandya
public class Remove_Duplicate_Words {

	public static void main(String[] args) {
		String s ="welcome to india welcome to mandya";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		for (String word : set) {
				System.out.print(word+ " ");
			}
	}

}
