package array_TY;
/**
 * find the maximum length element of the array 
 * @author kajal
 * 
 */
public class Find_Max_Length_Ele {

	public static void main(String[] args) {
		String[] strArr = { "hello" , "all" , "welcome" , "to" , "~~~~~~~" , "java" , "......."};
		String max_Ele = strArr[0];
		for (int i = 0; i < strArr.length; i++) {
			if(max_Ele.length()<strArr[i].length()) { //
				max_Ele=strArr[i];
				
			}
		}
		for (int i = 0; i < strArr.length; i++) {
			if(max_Ele.length()==strArr[i].length()) {
				System.out.println(strArr[i]);
			}
		}
		//System.out.println(max_Ele);
		/*
		 * String[] strArr = { "hello" , "all" , "welcome" , "to" , "java" , "......."};
		 * for (int i = 0; i < strArr.length; i++) { for (int j = i+1; j <
		 * strArr.length; j++) { if(strArr[i].length()>strArr[j].length()) { String temp
		 * = strArr[i]; strArr[i]=strArr[j]; strArr[j]=temp; } } } for (int i = 0; i <
		 * strArr.length; i++) { System.out.println(strArr[i]); }
		 */
	}

}
