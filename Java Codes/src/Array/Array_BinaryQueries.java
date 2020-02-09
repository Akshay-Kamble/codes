package Array;
import java.util.Scanner;

public class Array_BinaryQueries {

	public static void main(String[] args) {
		int N,Q;
		int i,L,R;
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		Q = sc.nextInt();
		int arr[] = new int[N];
		for(i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		for(i=0;i<Q;i++){
			if(sc.nextInt()==0){
				// 0 L R
				L = sc.nextInt();
				R = sc.nextInt();
				R--;
				if(arr[R]==1)
					System.out.println("ODD");
				else
					System.out.println("EVEN");
				
			}else{
				// 1 K - flip
				L = sc.nextInt();
				L--;
				if(arr[L]==0)
					arr[L]=1;
				else
					arr[L]=0;
			}
		}
	}

}
