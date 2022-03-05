package programs;
// print the string without using length variable & method
public class ReverseStringWithoutUsingLengthVariable {

	public static void main(String[] args) {
		String s ="kajal";
		char[] ch = s.toCharArray();
		int count = 0 ;
		for (char c : ch) {
			count++;
		}
		System.out.println(s.length() + " ====  "+ count);
		for (int i = count-1; i>=0; i--) {
		System.out.println(ch[i]);	
		}
	}

}
