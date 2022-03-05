package assignmnt;
// print your name 100 times without using loop
public class PrintNameHundredTimesW_OUsingLoop {

	public static void main(String[] args) {
		String name = "kajal";
		String rep = ".";
		//System.out.println("kajal\n".repeat(100));
		rep=rep.replaceAll(".","..........");
		rep=rep.replaceAll(".", "..........");
		rep=rep.replaceAll("." , name +"\n");
		System.out.println(rep);
	}

}
