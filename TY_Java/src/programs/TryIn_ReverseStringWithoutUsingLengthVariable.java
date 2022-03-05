package programs;

public class TryIn_ReverseStringWithoutUsingLengthVariable {

	public static void main(String[] args) {
		String s = "kajal";
		char[] ch = s.toCharArray();
		int count = 0;
		for (char c : ch) {
			count++;
		}
		System.out.println(count);
		for (int i = count-1; i>=0; i--) {
			System.out.println(ch[i]);
		}
	}

}
