package Array;
import java.util.HashMap;
import java.util.Scanner;

public class Array_Two_Sum {
	// pair of number having sum = K
	public static void main(String[] args) {
		
		int N,K,i,value,count=0;
		
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		N = sc.nextInt();
		K = sc.nextInt();
		
		for(i=0;i<N;i++)
		{
			value = sc.nextInt();
			int key = K - value;
			if(hmap.containsKey(key))
			{
				count++;
				System.out.println(key + " - "+value);
			}
			hmap.put(value, 1);
		}
		System.out.println(count);
	}

}
