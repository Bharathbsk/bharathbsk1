import java.util.*;
import java.io.*;

public class MaxEvenSum {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ret=maxEvenSum(arr);
		System.out.println(ret);
	}

	private static int maxEvenSum(int[] arr) {
		int sum=0;
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
}
