import java.util.*;
public class SumOfNonPrime {
	public static void main(String[] args) {
		SumOfNonPrime m=new SumOfNonPrime();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ret=m.sumOfNonPrime(arr,n);
		System.out.println(ret);
	}

	public int sumOfNonPrime(int[] input1, int input2) {
		int count=0,sum=0,k=0;
		List <Integer> li=new ArrayList<Integer>();
		li.add(input1[0]);
		li.add(input1[1]);
		for(int i=0;i<input2;i++){
		count=0;
		for(int j=1;j<=i;j++){
		if(i%j==0){
		count++;
		}
		}
		if(count>2){
		li.add(input1[i]);
		}
		}
		for(int i:li){
		sum+=i;
		}
		return sum;
	}
}
