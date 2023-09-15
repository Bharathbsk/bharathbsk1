import java.util.Scanner;
public class WeightOfHillPattren {
  public static void main(String[] args) {
	  WeightOfHillPattren m=new WeightOfHillPattren();
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println("output");
	int k=m.weightOfHillPattren(a,b,c);
	System.out.println(k);
  }
//100% pass
  
public int weightOfHillPattren(int input1, int input2, int input3) {
	int s=1,h=0;
	int sum=0;
	for(int i=0;i<input1;i++) {
		sum=sum+(s*input2)+(h*(input2-input3));
		s++;
		h++;
		input2=input2+input3;
	}
	return sum;
}
}


