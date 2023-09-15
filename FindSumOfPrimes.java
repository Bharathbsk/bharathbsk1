import java.util.*;
public class FindSumOfPrimes {
	public static void main(String[] args) {
		FindSumOfPrimes m=new FindSumOfPrimes();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ret=m.findSumOfPrimes(arr,n);
		System.out.println(ret);
	}

	public  int findSumOfPrimes(int[] input1, int input2) {
	int sum=0;
	List<Integer> li=new ArrayList<>();
	for(int i=0;i<input1.length;i++) {
			boolean k=prime(input1[i]);
			if(k==true) {
				li.add(input1[i]);
			}
	}
	Collections.sort(li);
	for(int i=1;i<li.size();i++) {
		sum=sum+li.get(i);
	}
	if(sum==0) {
		Arrays.sort(input1);
		for(int i=1;i<input1.length;i++) {
			sum=sum+input1[i];
		}
	}
		return sum;
	}
	private boolean prime(int input1) {
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

////
//15
//4 12 26 102 193 72 71 73 107 212 15 108 223 53 81
////
////another
//11
//10 41 18 50 43 31 29 25 59 96 67