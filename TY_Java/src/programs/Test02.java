package programs;
//print the string in  reverse order
public class Test02 {

	public static void main(String[] args) {
		String s = "KAJAL&RASHMI";
		for (int i = s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
