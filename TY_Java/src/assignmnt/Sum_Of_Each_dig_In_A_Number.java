package assignmnt;
// Sum Of Each digit In a Number
public class Sum_Of_Each_dig_In_A_Number {

	public static void main(String[] args) {
		int n =125;
		int sum=0;
		while(n>0) { //123,12,1
			int last_Num=n%10; //3,2,1
			sum=sum+last_Num; //3, 3+2=5, 5+1=6
			n=n/10; //12,1,0
		}
		System.out.println("the sum of digits present ina numbers is " + sum);
	}

}
