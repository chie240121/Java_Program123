package array_TY;

import java.util.Iterator;

/**
 * print the sum of first three minimum numbers in given array
 * @author kajal
 *
 */
public class Sum_Of_First_Three_Minimum {

	public static void main(String[] args) {
		int [] arr = {5,4,1,3,2};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//  1,2,3,4,5
		int sum=0; //1
		for (int i = 0; i < 3; i++) { //0<3,1<3,2<3
			sum=sum+arr[i];  //0+10, 1+2,3+3
			System.out.println(arr[i]); 
		}
		System.out.println("sum of first three minimum elements: " + sum);
	}

}
