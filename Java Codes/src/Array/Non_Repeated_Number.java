package Array;

import java.util.HashMap;
import java.util.Scanner;

public class Non_Repeated_Number {

	public static void main(String[] args) {
		int N,i,value;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(i=0;i<N;i++)
		{
			value = sc.nextInt();
			if(hm.containsKey(value))
				hm.remove(value);
			else
				hm.put(value, 0);
		}
		
		System.out.println("Non Repeating Number : "+hm.keySet().iterator().next());

	}

}
