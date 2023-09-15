import java.util.Scanner;
public class FinfPin {
  public static void main(String[] args) {
	  FinfPin m=new FinfPin();
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	System.out.println("output");
	int k=m.findKey(a,b,c,d);
	System.out.println(k);
}

public int findKey(int input1, int input2, int input3,int input4) {
	int a=9;
    while(input1>0) {
    	int r=input1%10;
    	if(a>r) {
    		a=r;
    	}
    	input1=input1/10;
    }
    int big=0;
    while(input2>10) {
    	int r=input2%10;
    	if(big<r) {
    		big=r;
    	}
    	input2=input2/10;
    }
    int b=9;
    while(input3>0) {
    	int r=input3%10;
    	if(b>r) {
    		b=r;
    	}
    	input3=input3/10;
    }
	return (a*big*b)-input4;
}
}
