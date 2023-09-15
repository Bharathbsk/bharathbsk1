import java.util.*;
public class StringDecoder1 {
     public static void main(String[] args) {
    	 StringDecoder1 u=new StringDecoder1();
    	 Scanner sc=new Scanner(System.in);
    	 String input1=sc.next();
    	 String ret=u.stringDecoder(input1);
    	 System.out.println(ret);
	}

	public String stringDecoder(String input1) {
		String rt="";
		String word[]=input1.split("1"); 
		for(int i=0;i<word.length;i++) {
			int k=word[i].length();
			rt=rt+(char)(91-k);
		}
		return rt;
	}
}
