package group1;

import java.util.HashSet;
import java.util.Iterator;

//  Print Only Duplicates In A Given String
//HELLO ---->L=2
public class Print_Only_Duplicates_In_A_Given_String {

	public static void main(String[] args) {
		//Step: 1 create any set collection and store each character of given string in set
		String s = "hello";
		HashSet<Character> set = new HashSet<Character>();
		
		//Step: 2 compare each character of set with all the character of original string
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));	
		}
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i <s.length(); i++) {
				if(ch==s.charAt(i)) {
					
					//Step: 3 if character is matching so, increment the count
					count++;
				}
			}
			//Step: 4 Print if the character occurred more than 1 time 
			if(count>=2) {
				System.out.println(ch + " occured " + count + " times ");
			}
		}

	}

}
