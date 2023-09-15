import java.util.*;
public class HotelDoubleCross {
    public static void main(String[] args) {
    	HotelDoubleCross h=new HotelDoubleCross();
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int a1[]=new int[n];
    	int a2[]=new int[n];
    	int a3[]=new int[n];
    
    	for(int i=0;i<n;i++) {
    		a1[i]=sc.nextInt();
    	}
    	for(int i=0;i<n;i++) {
    		a2[i]=sc.nextInt();
    	}
    	for(int i=0;i<n;i++) {
    		a3[i]=sc.nextInt();
    	}
    	int ret=h.hotelDoubleCross(a1,a2,a3);
    	System.out.println(ret);
	}

	public int hotelDoubleCross(int[] input1, int[] input2, int[] input3) {
		int sum=0;
		int rt[]=new int[input1.length];
		for(int i=0;i<input1.length;i++) {
			rt[i]=input1[i]+input2[i]+input3[i];
		}
		int d=1;
		for(int i=0;i<rt.length;i++) {
			int k=(rt[i]%rt.length);
			if(k<=0) {
				k=rt.length+k-1;
			}else {
				k=k-1;
			}
			if(d==1) {
				sum=sum+input1[k];
				d++;
			}else if(d==2) {
				sum=sum+input2[k];
				d++;
			}else if(d==3) {
				sum=sum+input3[k];
				d++;
			}
		
			if(d==4)
				d=1;
		}
		return sum;
	}
	
	
}





//7
//10 33 5 40 120 98 1
//121 78 21 32 91 340 72
//65 320 72 84 32 843 40
