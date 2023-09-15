import java.util.*;
public class SumOfDigitInCyclicOrder {
   public static void main(String[] args) {
	SumOfDigitInCyclicOrder m=new SumOfDigitInCyclicOrder();
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ret=m.sumOfDigitInCyclicOrder(n);
	System.out.println(ret);
}

public int sumOfDigitInCyclicOrder(int input1) {
	String s=""+input1;
	int ans=0;
	for(int i=0;i<s.length();i++) {
		int sum=0;
		for(int j=i;j<s.length();j++) {
			sum=sum+Integer.parseInt(""+s.charAt(j));
		}
		ans=ans+sum;
	}
	return ans;
}
}


//final int rr=input1;
//int count=0;
//int n=input1;
//int ret=0;
//while(n>0) {
//	count++;
//	n=n/10;
//}
//int m=rr;
//int k=0;
//for(int i=1;i<=count;i++) {
//	int sum=0;
//	while(m>k) {
//		int r=m%10;
//		sum=sum+r;
//		m=m/10;
//	}
//	k=i;
//	ret=ret+sum;
//	sum=0;
//	m=rr;
//}