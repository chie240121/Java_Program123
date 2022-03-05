package group1;
import java.util.HashSet;
// print the No Of occurrence Of Each Char in given string 
//HELLO H--->1, E--->1, L--->2 , O--->1
public class No_Of_Occurnce_Of_Each_Char {

	public static void main(String[] args) {
		
		
		
		//Step: 1 create any set collection and store each character of given string in set
		String s = "hello";
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		//Step: 2 compare each character of set with all the character of original string
		for (Character ch : set) { //helo "ch" will hold each iteration or character, Character is the wrapper class 
			int count = 0; //local to for-each loop , global to for loop  ,1
			for (int i = 0; i <s.length(); i++) {
				if(ch==s.charAt(i)) { // ch=h==h
					
				//Step: 3 if character is matching so, increment the count
					count++;
				}
			}
			
			//Step: 4 Print both character and count(no. of occurrence)
			//System.out.println(ch + " is present " + count + " times");
			System.out.println("occurrance of " + ch + " is " + count  + " times");
		}
	}

}
