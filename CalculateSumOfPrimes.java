import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class CalculateSumOfPrimes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Long> li=new ArrayList<>();
		for(int i=0;i<n;i++) {
			li.add(sc.nextLong());
		}
		List<Long> ret=calculateSumOfPrimes(li);
		System.out.println(ret);
	}

	public static List<Long> calculateSumOfPrimes(List<Long> models ) {
	    List<Long> lk=new ArrayList<>();
	    long sum=0;
	    long k=0;
	    long r=0;
	    long m=0;
	    for(int i=0;i<models.size();i++) {
	    	sum=sum+models.get(i);
	    	if(models.get(i)==0) {
	    		r++;
	    	}
	    	if(models.get(i)<6) {
	    		m=m+models.get(i);
	    	}
	    	if(models.get(i)!=2&&models.get(i)!=6) {
	    		k=k+models.get(i);
	    	}
	    }
	    lk.add(sum);
	    lk.add(k);
	    lk.add(r);
	    lk.add(m);
	    
		return lk;
	}
}

