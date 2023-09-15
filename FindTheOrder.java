import java.util.*;
public class FindTheOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FindTheOrder m=new FindTheOrder();
         String a=sc.next();
         String b=sc.next();
         String k=m.findTheOrder(a,b);
         System.out.println(k);
         

	}

	public String findTheOrder(String input1, String input2) {
		String a="";
	    int c=0;
	    int count=0;
	    for(int i=0;i<input1.length();i++) {
	    	if(i<input1.length()-1) {
	    	if(input1.charAt(i)<input1.charAt(i+1)&&(c==0||c>0)) {
	    		a="Increasing";
	    		c++;
	    	}else if(input1.charAt(i)>input1.charAt(i+1)&&(c==0||c<0)) {
	    		a="Decreasing";
	    		c--;
	    	}else {
	    		return "Invalid";
	    	}
	    	}
	    	if(input1.charAt(i)!=input2.charAt(i)) {
	    		count++;
	    	}
	    }
	    	return a+":"+count;
	   
	}
}
