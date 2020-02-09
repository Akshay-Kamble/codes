package Array;
import java.util.Scanner;

public class Array_MIN_Number_Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T,N,i,j,min,count;
		
		T = sc.nextInt();
		for(i=0;i<T;i++)
		{
			N = sc.nextInt();
			int arr[] = new int[N];
			min = Integer.MAX_VALUE;
			count=0;
			for(j=0;j<N;j++)
			{
				arr[j]=sc.nextInt();
				if(arr[j]<min) {
					min = arr[j];
					count =1;
				} else if(arr[j]==min) {
					count ++;
				}
					
			}
			
			if(count%2==1)
				System.out.println("Lucky");
			else
				{
					System.out.println("Unlucky");
				}
		}
	}

}
