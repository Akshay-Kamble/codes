package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*HackerEarth - Monk and Rotation

Input :
	T - Testcases
	N K - Aray Size and K right rotations 

Sample Input :
	1
	5 2
	1 2 3 4 5
Sample Output :
	4 5 1 2 3
*/ 

class Array_Right_Rotation {
	public static void main(String args[]) throws Exception {

		FastReader sc = new FastReader();
		int T,N,K;
		int i;
		int arr[];
		T =sc.nextInt();
		for(int testcase=0;testcase<T;testcase++)
		{
			N = sc.nextInt();
			K = sc.nextInt();
			K = K%N;
			arr = new int[N];
			
			for(i=0;i<N;i++)
			{
				arr[i] = sc.nextInt();
				if(i>=(N-K)) {
					System.out.print(arr[i]+" ");
				}
			}
			
			for(i=0;i<(N-K);i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
		}
		
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
