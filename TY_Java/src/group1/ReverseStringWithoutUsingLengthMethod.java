package group1;
// Reverse String Without Using Length method
public class ReverseStringWithoutUsingLengthMethod {

	public static void main(String[] args) {
		String s = "kajalSharma";
	char[] ch = s.toCharArray();
	for (int i = ch.length-1; i>=0; i--) {
	System.out.println(ch[i]);
}
	}

}
