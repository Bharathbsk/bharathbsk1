
public class Count_prime_digits {
   public static void main(String[] args) {
	   Count_prime_digits c=new Count_prime_digits();
	   System.out.println(c.count_prime_digits(465)+" hi");
}

public int count_prime_digits(int input1) {
	int count=0;
	  while(input1>0) {
		int r=input1%10;
		if(prime(r))
			count++;
		input1=input1/10;
	  }
	return count;
    }
   boolean prime(int input1) {
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
