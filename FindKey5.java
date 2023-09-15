import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class FindKey5 {
  public static void main(String[] args) {
	  FindKey5 m=new FindKey5();
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println("output");
	int k=m.findKey(a,b,c);
	System.out.println(k);
}

public int findKey(int input1, int input2, int input3) {
	List <Integer> l3=new LinkedList<Integer>();
	l3.add((input3/1000)%10);
	l3.add((input3/100)%10);
	l3.add((input3/10)%10);
	l3.add((input3)%10);
    int a=(input1/1000)%10;
    int b=(input2/100)%10;	
    int c=Collections.max(l3);
    int num=(a*b)-c;
	return num;
}
}