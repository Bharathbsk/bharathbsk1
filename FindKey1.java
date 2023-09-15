import java.util.*;
public class FindKey1 {
  public static void main(String[] args) {
	  FindKey1 m=new FindKey1();
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println("output");
	int k=m.findKey(a,b,c);
	System.out.println(k);
}

public int findKey(int input1, int input2, int input3) {  //Big-Sml
	int big=0;
	int sml=0;
	 int arr1[]=findBS(input1);
	 int arr2[]=findBS(input2);
	 int arr3[]=findBS(input3);
	 big=arr1[1]+arr2[1]+arr3[1];
	 sml=arr1[0]+arr2[0]+arr3[0];
	return (big)-(sml);
}

private int[] findBS(int input1) {
	int arr[]=new int[2];
   List<Integer> li=new ArrayList<>();
	while(input1>0) {
    	int r=input1%10;
    	li.add(r);
    	input1=input1/10;
    }
	Collections.sort(li);
	arr[0]=li.get(0);
	arr[1]=li.get(li.size()-1);
	return arr;
}
}