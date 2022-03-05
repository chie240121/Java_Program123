package array_TY;
/**
 * print the second minimum element in given array.
 * @author kajal
 *
 */
public class Print_The_2nd_Minimum_Element_In_Array {

	public static void main(String[] args) {
		int[] arr = {60,40,30,50,10,20};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("second minimum element is: " + arr[1]);
	}

}
