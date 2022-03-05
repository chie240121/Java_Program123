package programs;

public class Reverse_The_Given_String_WRT_Words {

	public static void main(String[] args) {
		String s = "welcome to india welcome to mandya";
		String[] str = s.split(" ");
		for (int i = str.length-1; i>=0; i--) {
			System.out.print(str[i] + " ");
		}
	}

}
