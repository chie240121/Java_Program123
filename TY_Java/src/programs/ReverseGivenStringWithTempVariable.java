 package programs;
//how to reverse a string using third variable 
public class ReverseGivenStringWithTempVariable {

	public static void main(String[] args) {
		String s = "kajal";
		String rev = ""; //no space bcz empty is variable //s,ss,ssy,ssyt
		for (int i = s.length()-1; i>=0; i--) 
		{		//i=3,2,1,0
			//System.out.println(s.charAt(i));
			rev=rev+s.charAt(i);//0+s,s+s,ss+y,ssy+t	
		}
		System.out.println(rev);
		
	}

}
