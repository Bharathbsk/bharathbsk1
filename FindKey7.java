import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class FindKey7 {
  public static void main(String[] args) {
	  FindKey7 m=new FindKey7();
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	//int d=sc.nextInt();
	System.out.println("output");
	int k=m.findKey(a,b,c);
	System.out.println(k);
}

public int findKey(int input1, int input2, int input3) {
	List <Integer> l1=new LinkedList<Integer>();
	List <Integer> l2=new LinkedList<Integer>();
	List <Integer> l3=new LinkedList<Integer>();
	l1.add((input1/1000)%10);
	l1.add((input1/100)%10);
	l1.add((input1/10)%10);
	l1.add(input1%10);
	l2.add((input2/1000)%10);
	l2.add((input2/100)%10);
	l2.add((input2/10)%10);
	l2.add(input2%10);
	l3.add((input3/1000)%10);
	l3.add((input3/100)%10);
	l3.add((input3/10)%10);
	l3.add(input3%10);
	int sum=((Collections.min(l1)-Collections.max(l1))+((Collections.min(l2)-Collections.max(l2))+
			(Collections.min(l3)-Collections.max(l3))));		
	return sum;
}

}
