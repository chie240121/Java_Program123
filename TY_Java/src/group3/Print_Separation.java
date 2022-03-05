package group3;
//ab1@2c$
public class Print_Separation {

	public static void main(String[] args) {
		String s = "ab1@2c$";
		String Alpha="";
		String num = "";
		String spcl_Char="";
		
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z') {
				Alpha= Alpha + s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				num =num+ s.charAt(i);
			}
			else {
				spcl_Char=spcl_Char+s.charAt(i);
			}
		}
		System.out.print(Alpha + "  " + num + "  " + spcl_Char);
		
	}

}
