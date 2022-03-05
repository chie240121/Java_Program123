package programs;

import java.util.LinkedHashSet;

// remove duplicates character in given string and print in insertion order
// HELLO ---> HELO
public class Remove_The_Duplicates {

	public static void main(String[] args) {
		String s = "hello"; // helo
		
		//store each character of string in set
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
		}
		//System.out.print(set);
		
		//print each character of set
		for (Character ch : set) {
			
				System.out.print(ch);
			}
		}
		
	}

