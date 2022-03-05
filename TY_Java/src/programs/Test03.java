package programs;
//print the string without using length method
public class Test03 {

	public static void main(String[] args) {
		String string = "KAJAL";
		 char[] s = string.toCharArray();
			int count=0;
		for (char c : s) {
			count++;
		}
System.out.println(count);
	
for(int i = count-1;i>=0;i--) {
	System.out.println(s[i]);
	
	/*for(int i = 0;i<count;i++) {
		System.out.println(s[i]);*/
	//reverse order
}
}
}