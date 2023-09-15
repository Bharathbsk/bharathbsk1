import java.util.*;
public class PlaceTheAlphabets {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   PlaceTheAlphabets p=new  PlaceTheAlphabets();
	   int n=sc.nextInt();
	   int input1[]=new int[n];
	   for(int i=0;i<n;i++) {
		   input1[i]=sc.nextInt();
	   }
	   char ret[]=p.placeTheAlphabets(input1);
	   for(int i=0;i<ret.length;i++) {
		   System.out.print(ret[i]+" ");
	   }
}

private char[] placeTheAlphabets(int[] input1) {
	List<Integer> li=new ArrayList<>();
	for(int i=0;i<input1.length;i++) {
		li.add(input1[i]);
	}
	Collections.sort(li);
	char ch[]=new char[input1.length];
	for(int i=0;i<input1.length;i++) {
		ch[i]=(char)(97+i);
	}
	char ret[]=new char[input1.length];
	for(int i=0;i<input1.length;i++) {
		for(int j=0;j<input1.length;j++) {
			if(input1[i]==li.get(j)) {
				ret[i]=ch[j];
			}
		}
	}
	return ret;
}
}
