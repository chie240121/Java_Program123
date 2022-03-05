package array_TY;
/**
 * print the 1st maximum element in array.
 * @author kajal
 *
 */
public class Print_The_1st_Maximum_Element_In_Array {

	public static void main(String[] args) {
		int[] arr1= {20,30,10,40,50};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i+1; j <arr1.length; j++) {
				if(arr1[i]>arr1[j]) { //condition to check which no. is greater
					int temp = arr1[i]; //use ref variable to store greater no.
					arr1[i]=arr1[j]; // swapping
					arr1[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr1.length; i++) { // this loop is  to print 
			System.out.println(arr1[i]);
		}
		System.out.println("maximum element of an array is " + arr1[arr1.length-1]);
	}
}
