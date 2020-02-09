package Array;
import java.util.Scanner;

public class Array_GreaterThanRightSide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,N, higherValue=Integer.MIN_VALUE;
		
		N = sc.nextInt();
		int arr [] = new int[N];
		int greater[] = new int[N];
		
		for(i=0;i<N;i++)
		{
			arr[i] = sc.nextInt();
		}

		for(i=N-1;i>=0;i--)
		{
			if(arr[i]>higherValue)
			{
				higherValue = arr[i];				
			}
			greater[i]=higherValue;
		}
		for(i=0;i<N;i++)
		{
			if(arr[i]>=greater[i])
			{
				System.out.print(arr[i]+" ");
			}
		}
					
	}

}
