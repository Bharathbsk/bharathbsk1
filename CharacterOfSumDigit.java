import java.util.*;
public class CharacterOfSumDigit {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	CharacterOfSumDigit m=new CharacterOfSumDigit();
	String n=sc.next();
    int l=sc.nextInt();
    String k=m.findCharsOrDigitSum(n,l);
    System.out.println(k);
   }
 //90% pass  6p 1f
public String findCharsOrDigitSum(String input1, int input2) {                    
	String ret="";
	int sum=0;
	if(input1==null&&input2==1) {
		return "NULL";
	}
	if(input2==0) {
		int count=0;
	    for(int i=0;i<input1.length();i++) {
	       char ch=input1.charAt(i);
	       if(ch>='0'&& ch<='9') {
	    	   String k=ch+"";
	    	   sum=sum+Integer.parseInt(k);
	    	   count++;
	       }
	    }
	    if(count==0) {
	    	return "ZERO";
	    }
	    return sum+"";
	}else if(input2==1) {
		for(int i=0;i<input1.length();i++) {
			char ch=input1.charAt(i);
			if(ch>='a' && ch<='z'||ch>='A'&&ch<='Z') {
				ret=ret+ch;
			}
		}
		if(ret.isEmpty()||ret==null) {
			return "ZERO";
		}
	}
	return ret;
}

}



//
//for(int i=0;i<input1.length();i++) {
//	  char ch=input1.charAt(i);
//	  if(ch>='0'||ch<='9') {
//		  String cc=""+ch;
//		  sum=sum+Integer.parseInt(cc);
//	  }else if(ch>='a' && ch<='z'||ch>='A'&&ch<='Z') {
//		  ret=ret+ch;
//	  }
//}
//	
//}
