package tempo;
//print the string without using length variable & method
public class RevStrgWiOTLENGTHvar {

	public static void main(String[] args) {
		String s ="kajal";
	char[] ch = s.toCharArray();
		int count=0;
		for (char c : ch) {
			count++;
		}
		for (int i =  ch.length-1; i>=0; i--) {
			System.out.println(ch[i]);
		}
	}

}
