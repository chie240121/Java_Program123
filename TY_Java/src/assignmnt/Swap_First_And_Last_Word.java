package assignmnt;
/**
 * Swap first and last words of the sentence
 * @author kajal
 *
  */
public class Swap_First_And_Last_Word {

	public static void main(String[] args) {
		String s = "welcome to tyss company";
		String[] str = s.split(" ");
		String temp_Variable=str[0]; //welcome
		str[0]=str[str.length-1]; // //company
		str[str.length-1]=temp_Variable; //welcome
		
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
		

	}

}
