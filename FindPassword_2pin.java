import java.util.*;
public class FindPassword_2pin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FindPassword_2pin m=new FindPassword_2pin();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ret=m.findPassword(arr,n);//1036 type
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
	        return Integer.parseInt(sNo+""+fNo);
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
//10
//12 2 36 10 217 36 5 36 15 10     =21036
//16
//5 123 12 45 62 77 89 23 12 14 11 14 12 90 89 12   =58912