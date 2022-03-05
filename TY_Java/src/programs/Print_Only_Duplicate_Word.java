package programs;

import java.util.HashSet;

/**
 * print only duplicates words
 * @author kajal
 *
 */
// welcome to india to----> to=2
public class Print_Only_Duplicate_Word {

	public static void main(String[] args) {
		String s = "welcome to india welcome to mandya";
		String[] str = s.split(" ");
		
		
		//Step:1 Store each word of string in set
				HashSet<String> set = new HashSet<String>();
				for (int i =str.length-1; i>=0; i--) {
					set.add(str[i]);
				}
				System.out.println(set);
				
				//Step:2 compare each word of set with all the words given in original set
				for (String word : set) {
					int count=0;
					for (int i = 0; i < str.length; i++) {
						if(word.equals(str[i])) {
							//Step:3 increment the count if the word is repeated
							count++;
						}
					}
					// Step:4 print the words  
					if(count>=2)
					System.out.println(word + " occurred " + count + " times ");
				}
				
			
			
			}

		}
