import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Prime m=new Prime();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> li=new ArrayList<>();
		for(int i=0;i<n;i++) {
			li.add(sc.nextInt());
		}
		long ret=calculateSumOfPrimes(li);
		System.out.println(ret);
	}

	public static long calculateSumOfPrimes(List <Integer> inputArray) {
		long sum=0;
	     for(int i=0;i<inputArray.size();i++) {
	    	 if(prime(inputArray.get(i))) {
	    		 sum=sum+inputArray.get(i);
	    	 }
	     }
	     return  sum;
	   }
	    private static boolean prime(int input1) {
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
	}
}

//7
//619 514 857 518 825 940 585