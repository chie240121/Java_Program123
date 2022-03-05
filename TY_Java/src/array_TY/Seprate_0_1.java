package array_TY;
/**
 * Separate all the zeros and numbers  in given array.
 * @author kajal
 *
 */ // int a []={1,0,1,0,0,1,0} ------> 111 0000
// int a[]= {3,0,1,0,0,2,0}---------> 3 1 2 0 0 0 0
public class Seprate_0_1 {

	public static void main(String[] args) {
		int a[] = {3,0,1,0,2,0};
		int b[]=new int[a.length]; //6
		int m=0; //0,1,2,3
		int n=b.length-1; //5,4,3
		for (int i = 0; i<a.length ; i++) {
			//0<6,1<6,2<6,3<6
			if(a[i]==0) { // 3==0,0==0,1==0
				b[n]=a[i]; //b[5]=0 ,b[4]=0
				n--;
			}
			else {
				b[m]=a[i];//b[0]=3 , b[1]=1 ,b[2]=2
				m++;
			}
			
		}
		for (int i = 0; i<b.length; i++) {
			System.out.print(b[i] + " " );
		}
		
	}

}
