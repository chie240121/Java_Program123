package group3;

public class SUM_OF_EACH_alphabets_IN_STRING {

	public static void main(String[] args) {
		String s ="a10b25$c32";
		int sum = 0;
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				int n =s.charAt(i); 
				sum=sum+n;
			}
		}
			System.out.println(sum);
	}

}
