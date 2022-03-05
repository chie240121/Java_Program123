package programs;
import java.util.LinkedHashSet;

// print only the unique chars  also maintained the insertion order
//HELLO ----> H=1,    E=1, O=1 === (heo)
public class Print_Only_Unique_Chars {

	public static void main(String[] args) {
		String s = "hello"; // heo
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
		}

		for (Character ch : set) {
			int count =0;
			for (int i = 0; i <s.length(); i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(ch);
			}
		}
		
	}

}
