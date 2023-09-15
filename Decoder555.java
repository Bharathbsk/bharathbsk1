import java.util.*;
public class Decoder555 {
     public static void main(String[] args) {
    	 Decoder555 m=new Decoder555();
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 int arr[]=new int[n];
    	 for(int i=0;i<n;i++) {
    		 arr[i]=sc.nextInt();
    	 }
    	 int ret=m.The555Decoder(arr,n);
    	 System.out.println(ret);
	}

     //100%pass
    public int The555Decoder(int[] input1, int input2) {                 
	   int ans=0;
	   for (int i=0;i<input1.length; i++) {
			if(input1[i]>99&&input1[i]<999) {
				input1[i]=subfive(input1[i]);
				input1[i]=digitsum(input1[i]);
				 ans+=input1[i];
			}
			else 
			input1[i]=0;
			}
			return (ans);
			}
    public static int subfive (int n) { 
       StringBuffer sb=new StringBuffer(); 
         while(n>0){
			int rem=n%10;
			sb.append(Math.abs(rem-5));
			n/=10;
		 } 
      sb.reverse();
	  String s=sb.toString(); 
	return Integer.parseInt(s);
	}
	public static int digitsum(int n) {
		int sum=0; 
		while(n>0) { 
			sum=0; 
				while(n>0) { 
				int rem=n%10;
		   	      sum+=rem; 
			      n/=10;
				}
				if(sum>9)
				n=sum;
		}
   return sum;
	}
}
