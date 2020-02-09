package Array;
import java.util.Scanner;

public class Array_Semi_Histogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T,N,i,j,max,value,count;
		
		T = sc.nextInt();
	
		for(i=0;i<T;i++)
		{
			N = sc.nextInt();
			
			max = Integer.MAX_VALUE;
			count = 0;
			
			for(j=0;j<N;j++)
			{
				value = sc.nextInt();
				if(value<=max)
				{
					count++;
					max=value;
				}
			}
			System.out.println(count);
		}

	}

}
