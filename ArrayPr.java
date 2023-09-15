import java.util.*;
public class ArrayPr {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int l=longSequence(arr);
		System.out.println(l);
     }

	private static int longSequence(int[][] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		     for(int j=0;j<arr[0].length;j++) {
		    	 
		     }
		}
		return sum;
	}	

} 