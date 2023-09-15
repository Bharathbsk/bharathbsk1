import java.util.Scanner;
public class PositionBasedSum1 {
	public static void main(String[] args) {
		PositionBasedSum1 m=new PositionBasedSum1();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ret=m.PositionBasedSum(arr,n);
		System.out.println(ret);
	}

	public int PositionBasedSum(int[] input1,int input2) {
		int sum=0;
		int n[]=new int[input1.length];
		int rr=1;
		for(int i=0;i<input1.length;i++) {
			int k=(input1[i]/rr)%10;
			rr=rr*10;
			n[i]=k;
		}
		for(int i=0;i<n.length;i++) {
			int m=n[i]*n[i];
			sum=sum+m;
		}
		return sum;
	}
	
}