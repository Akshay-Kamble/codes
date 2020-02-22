package Array;
import java.util.Scanner;

/*
Sample Input
1
5 4
2 7 3 4 9
*/
class Array_ArrayUpdate {
    public static void main(String args[] ) throws Exception {
       int i,j,T,N,K,min;
       Scanner sc = new Scanner(System.in);
       
       T= sc.nextInt();
       for(i=0;i<T;i++)
       {
           N = sc.nextInt();
           K = sc.nextInt();
           int arr [] = new int[N];
           min = Integer.MAX_VALUE;
           for(j=0;j<N;j++){
               arr[j]=sc.nextInt();
               if(arr[j]<min)
                min  = arr[j];
           }
           if(K>min)
           System.out.println(K-min);
           else
        	   System.out.println("0");
       }

    }
}

