import java.util.Scanner;
public class WeightOfHillPattren1 {
  public static void main(String[] args) {
	  WeightOfHillPattren1 m=new WeightOfHillPattren1();
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println("output");
	int k=m.totalHillWeight(a,b,c);
	System.out.println(k);
  }

public int totalHillWeight(int input1, int input2, int input3) {
	int sum=0;
	int k=0;
	int t=input2;
	int rr=0;
	for(int i=0;i<input1;i++) {
		int m=0;
		for(int j=0;j<=k;j++) {
	     if(j<=i) {
	    	 m=m+t;
	     }else {
	    	 m=m+rr;
	     }
		}
		rr=t;
		t=t+input3;
		k=k+2;
		sum=sum+m;
		m=0;
	}
	return sum;
}
}