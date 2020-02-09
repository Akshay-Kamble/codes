package Array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_Max_of_SubArray {
	// maximum of subarray of size K
	public static void main(String[] args) {
		int N,K,max,i,j;
		FastReader fr = new FastReader();
		N = fr.nextInt();
		K = fr.nextInt();
		int arr[] = new int[N];
		for(i=0;i<N;i++)
		{
			arr[i] = fr.nextInt();
		}
		for(i=0;i<=N-K;i++)
		{
			max = arr[i];
			
			for(j=1;j<K;j++)
			{
				if(arr[i+j]>max)
					max = arr[i+j];
			}
			System.out.print(max+" ");
		}

	}
	
	static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;
		FastReader()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		int nextInt()
		{
			return Integer.parseInt(next());
		}
		
		String next()
		{
			while(st==null || !st.hasMoreElements())
			{
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
	}

}
