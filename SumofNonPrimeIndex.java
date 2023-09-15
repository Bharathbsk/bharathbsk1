import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SumofNonPrimeIndex {
	public static void main(String[] args) {
		SumofNonPrimeIndex m=new SumofNonPrimeIndex();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ret=m.sumOfNonPrimeIndexValues(arr,n);
		System.out.println(ret);
	}

public int sumOfNonPrimeIndexValues(int[] input1, int input2) {
	    int sum=0;
		for(int i=0;i<input2;i++){
			if(prime(i)) {
				
			}else {
				sum=sum+input1[i];
			}
		}
		return sum;
	}
	private boolean prime(int input1) {
		if(input1>1) {
	    int count=0;
	    for(int i=2;i<=input1/2;i++) {
	    	if(input1%i==0) {
	    		count++;
	    		break;
	    	}
	    }
	    if(count==0) {
	    	return true;
	    }
		return false;
		}else 
			return false;
	}
	
}
