import java.util.*;
public class Find_Tvalue {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Find_Tvalue m=new Find_Tvalue();
	int n=sc.nextInt();
	int l=sc.nextInt();
	int k=sc.nextInt();
	int ret=m.find_tvalue(n,l,k);
	System.out.println(ret);
}

public int find_tvalue(int input1, int input2, int input3) {
	int ret=0;
	int t=0;
	if(input2%2==0 && prime(input2)) {
		t=input3*input3*(primeSum(input2));
	}else if(prime(input2)){
		t=input2*input2*(primeSum(input3));
	}
	if(prime(t))
		ret=input3+t;
	else
		ret=t-input3;
	return ret;
  }
  int primeSum(int input1) {
   int sum=0;
   int i=2;
	while(input1>0) {
		if(prime(i)) {
			sum=sum+i;
			i++;
			input1--;
		}else {
			i++;
		}
	}
	return sum;
   }
  boolean prime(int input1) {
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
