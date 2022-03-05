package array_TY;
/**
 * print all the elements of array in dsc order.
 * @author kajal
 *
 */
public class Print_All_The_Elements_Of_Array_In_Dsc_Order {

	public static void main(String[] args) {
		int [] arr1= {60,40,30,10,50};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i+1; j< arr1.length; j++) {
				if(arr1[i]<arr1[j]) {
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
					
				}
			}
		}
for (int elements : arr1) {
	System.out.println(elements);
}
	}

}
