package programs;

public class SUM_OF_EACH_aspchChar_IN_STRING {

	public static void main(String[] args) {
		String s ="%10b25$c32";
		int sum =0;
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)>=' ' && s.charAt(i)<='/' && s.charAt(i)<=':' && s.charAt(i)<='~') {
				int n = s.charAt(i);
				sum=sum+n;
			}
		}
		System.out.println(sum);

	}

}
