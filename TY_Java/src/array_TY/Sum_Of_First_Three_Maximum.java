package array_TY;
/**
 * print the sum of first three maximum numbers in given array.
 * @author kajal
 *
 */
public class Sum_Of_First_Three_Maximum {

	public static void main(String[] args) {
		int [] arr = {3,6,1,2,5,4};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int sum =0;
		for (int i = 0; i < 3; i++) {
			sum=sum+arr[i];
			System.out.println(arr[i]);
			
		}
		System.out.println("sum of first three maximum elemenyts: " + sum);
	}

}
