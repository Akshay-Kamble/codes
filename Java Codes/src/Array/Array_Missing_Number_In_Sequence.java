package Array;

import java.util.Scanner;
/*For any sequence :

Let 'a' be the first number
'b' - last number

sum1 = (a-1)a/2;
sum2 = b(b+1)/2;
finalSum = sum2-sum1;

 subtract all input numbers from finalSum.
 Got the answer
*/ 

public class Array_Missing_Number_In_Sequence {

	public static void main(String[] args) {
		int N,i,sum,k;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		sum = N*(N+1)/2;
		
		for(i=1;i<N;i++)	// run N-1 times
		{
			k = sc.nextInt();
			sum = sum - k;
		}
		System.out.println("Missing Number : "+sum);
	}

}



/*sample input
 TestCase 1
 10 
 1 2 3 4 6 7 8 9 10
 Ans : 5
 case 2
 15
 1 3 4 5 6 7 8 9 10 11 12 13 14 15
 Ans : 2
 case 3
 15
 1 2 3 4 5 6 7 8 9 10 11 12 13 14
 Ans : 15
 
 
 */