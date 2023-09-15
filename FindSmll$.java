import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class FindSmll$ {
  public static void main(String[] args) {
	  FindSmll$ m=new FindSmll$();
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println("output");
	int k=m.findKey(a,b,c);
	System.out.println(k);
}

public int findKey(int input1, int input2, int input3) {
	List <Integer> l1=new LinkedList<Integer>();
	List <Integer> l2=new LinkedList<Integer>();
	List <Integer> l3=new LinkedList<Integer>();
	List <Integer> l4=new LinkedList<Integer>();

	l1.add((input1/1000)%10);
	l1.add((input2/1000)%10);
	l1.add((input3/1000)%10);
	l2.add((input1/100)%10);
	l2.add((input2/100)%10);
	l2.add((input3/100)%10);
	l3.add((input1/10)%10);
	l3.add((input2/10)%10);
	l3.add((input3/10)%10);
	l4.add(input1%10);
	l4.add(input2%10);
	l4.add(input3%10);
	String pin=Integer.toString(Collections.min(l1))+
			Integer.toString(Collections.min(l2))+
			Integer.toString(Collections.min(l3))+
			Integer.toString(Collections.min(l4));
	return Integer.parseInt(pin);
}

}
