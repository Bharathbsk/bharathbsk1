import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
public class FindPassword_3pin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FindPassword_3pin m=new FindPassword_3pin();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ret=m.findPassword(arr,n);//21036 type
		System.out.println(ret);
	}//100%

	
	public int findPassword(int[] input1, int input2) {
		  Map<Integer,Integer> n= new HashMap<>();
	        for(int i=0;i<input2;i++) {
	            if(n.get(input1[i]) == null)
	                n.put(input1[i],0);
	            n.put(input1[i],n.get(input1[i])+1);
	        }
	        TreeSet<Integer> v = new TreeSet<>(n.values());
	        int fNo = getMax(n,v.last(),true);
	        v.remove(v.last());
	        int sNo = getMax(n,v.last(),true);
	        int tNo = getMax(n,v.first(),false);
	        return Integer.parseInt(tNo+""+sNo+""+fNo);
	    }
	  public int getMax(Map<Integer,Integer> n, int occ, boolean isMax) {
	        int comp = isMax?Integer.MIN_VALUE:Integer.MAX_VALUE;
	        for(int key : n.keySet())
	            if(n.get(key) == occ) {
	                if(isMax) {
	                    if(key>comp)
	                    comp = key;
	                } else
	                    if(key<comp)
	                     comp = key;
	            }
	        return comp;
	}
}