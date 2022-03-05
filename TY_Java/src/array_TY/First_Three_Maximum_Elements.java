package array_TY;
/**
 * find the first three maximum elements
 * @author kajal
 *
 */
public class First_Three_Maximum_Elements {
	public static void main(String[] args) {
		int[] arr1= {20,30,10,40,50};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i+1; j <arr1.length; j++) {
				if(arr1[i]<arr1[j]) { //condition to check which no. is greater
					int temp = arr1[i]; //use ref variable to store greater no.
					arr1[i]=arr1[j]; // swapping
					arr1[j]=temp;
				}
			}
		}
		System.out.println("first three maximum elements");
		for (int i =0; i<3; i++) { // this loop is  to print 
			System.out.println(arr1[i]);
		}
		
	}
}
