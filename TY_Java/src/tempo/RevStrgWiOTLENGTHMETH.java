package tempo;

public class RevStrgWiOTLENGTHMETH {

	public static void main(String[] args) {
		String s = "kajal";
		char [] ch = s.toCharArray();
		
		for (int i = ch.length-1; i>=0 ; i--) {
			System.out.println(ch[i]);
		}
	}
	
}
