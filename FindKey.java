import java.util.*;
public class FindKey {
  public static void main(String[] args) {
	  FindKey m=new FindKey();
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println("output");
	int k=m.findKey(a,b,c);
	System.out.println(k);
}

public int findKey(int input1, int input2, int input3) {
	int a=0;
    while(input1>0) {
    	int r=input1%10;
    	a=r;
    	input1=input1/10;
    }
    int b=0;
    while(input2>10) {
    	int r=input2%10;
    	b=r;
    	input2=input2/10;
    }
    int big=0;
    while(input3>0) {
    	int r=input3%10;
    	if(big<r) {
    		big=r;
    	}
    	input3=input3/10;
    }
	return (a*b)-big;
}
}
