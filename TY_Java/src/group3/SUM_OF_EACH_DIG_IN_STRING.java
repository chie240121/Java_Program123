package group3;
// String s = ab12@3*5
public class SUM_OF_EACH_DIG_IN_STRING {

	public static void main(String[] args) {
		String s ="a10b25$c32";
		int sum=0;//1
		for (int i = 0; i <s.length(); i++) {
			//0<6,1<6
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				//97>=48 and 97<=57 , 49>=48 and 49<=57
				int n = s.charAt(i)-48; //49-48=1
				sum=sum+n;// 0+1
			}
		}
		System.out.println(sum);

	}

}





