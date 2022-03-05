package assignmnt;
// // Swap the two strings Without Using Third Variable
public class Swap_The_Two_Strings_Without_Using_Third_Variable {

	public static void main(String[] args) {
		
		 String a ="kajal"; String b = "sharma";
		  
		  a=a+b;         //kajalsharma 
		  b=a.substring(0, a.length()-b.length());
		  a=a.substring(b.length());
		 // a=a.substring(5, a.length());    
		 // a=a.substring(5);
		 
		 
		  System.out.println();
		  System.out.println(" after swaping====>  " + a + "  " + b);
		 
		
		/*
		 * String a ="kajal"; String b ="sharma"; String c =a; a=b; b=c;
		 * System.out.println(a + "       " + b);
		 */
	}

}
