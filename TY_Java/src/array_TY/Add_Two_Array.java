package array_TY;
/**
 * find the sum of two array with different length
 * @author kajal
 *
 */
public class Add_Two_Array {

	public static void main(String[] args) {
		int[]a = {1,2,3,};
		int[]b=  {4,5,6,8,9,10};
		int count=a.length; //4
		if(b.length>a.length) { //3>4
			count=b.length;
		}
		for (int i = 0; i < count; i++) {
			//0<4,1<4,2<4,3<4
			try {
			System.out.println(a[i]+b[i]);
			//1+4=5,2+5=7,3+6=9,4+
		}
			catch (Exception e) {
				if(b.length>a.length) {
					System.out.println(b[i]);
				}
				else {
					System.out.println(a[i]);
				}
			}
	}

	}
}
