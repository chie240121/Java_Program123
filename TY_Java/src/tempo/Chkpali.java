package tempo;

public class Chkpali {
public static void main(String[] args) {
String k = "kajak";
String rev = "";
for (int i = k.length()-1;i>=0;i--) {
	rev=rev+k.charAt(i);
}
	
if(rev.equals(k)) {
	System.out.println("is palindrom");
}
else {
	System.out.println(" not palindrome");
}
	
}
}