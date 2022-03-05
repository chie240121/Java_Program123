package group3;

import java.util.HashSet;

// India-------->i i a
public class Print_VOWEL_With_Duplicate {

//	public static void main(String[] args) {
//		String s ="India";
//		s=s.toLowerCase(); // india
//		HashSet<Character> set = new HashSet<Character>();
//		for (int i = 0; i <s.length(); i++) {
//			set.add(s.charAt(i));
//		}
//		for (Character ch : set) { // inda
//			int count=0;
//			for (int i = 0; i <s.length(); i++) {
//				if(ch==s.charAt(i)) {
//					
//					count++;
//				}
//				
//				
//			}
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//				System.out.println(ch + " = " + count);
//	}
//		}
//
//	}
	public static void main(String[] args) {
		String s = "India";
		s=s.toLowerCase();
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				System.out.println(s.charAt(i));
			}
		}
	}
	}

