package Array;

import java.util.Scanner;

public class Reverse_Given_Array {

	public static void main(String[] args) {
		int N,i,temp;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int arr[] = new int[N];
		
		for(i=0;i<N;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		// reversing
		int j=N-1;
		i=0;
		while(i<j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
		for(i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
	}

}
