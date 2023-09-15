import java.util.*;
public class GetMagicValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int arr[]=new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=sc.nextInt();
		}
		long ret=getMagicValue(arr);
		System.out.println(ret);
	}
	static long getMagicValue(int[] a) {
	    long sg=0;
		long sb=0;
       int brr[]=new int[a.length];
       for(int i=0;i<a.length;i++) {
    	   brr[i]=a[i];
       }
       Arrays.sort(brr);
       for(int i=0;i<brr.length;i++) {
    	   if(a[i]==brr[i]) {
    		   sg=sg+a[i];
    	   }else {
    		   sb=sb+a[i];
    	   }
       }		
		return sg-sb;
    }
}