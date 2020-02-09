package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_TeamSelection_i_j_k {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,k,N,count=0;
		
		N = sc.nextInt();
		int arr [] = new int[N];
		int brr [] = new int[N];
		
		for(i=0;i<N;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<N;i++)
		{
			brr[i] = sc.nextInt();
		}
		Arrays.sort(brr);
		
		for(i=0;i<N-1;i++)
		{
			for(j=i+1;j<N;j++)
			{
				// find k if arr[j]>arr[i]
				if(arr[j]>arr[i])
				{
					for(k=N-1;k>=0;k--)
					{
						if(brr[k]>arr[j])
						{
							count++;
						}
						else
						{
							break;
						}
					}
				}
				
			}
		}
		System.out.println(count);
		
		
		
	}

}
