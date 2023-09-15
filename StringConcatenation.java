import java.util.*;
public class StringConcatenation {
  public static void main(String[] args) {
	  StringConcatenation m=new StringConcatenation();
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	System.out.println();
	String b=sc.next();
	String k=m.stringConcatenation(a,b);
	System.out.println(k);
}
//100% test case pass
public String stringConcatenation(String input1, String input2) {
	if(input1==null||input2==null||input1.isEmpty()||input2.isEmpty()) {
		return "null";
	}
	String ret="";
	Set<Character> cc=new TreeSet<>();
	for(int i=0;i<input1.length();i++) {
		char c1=input1.charAt(i);
		if(i<input1.length()) {
		if(c1!=' ') {
			cc.add(c1);	
		}
		}
	}
	for(int i=0;i<input2.length();i++) {
		char c2=input2.charAt(i);
		if(i<input2.length()){
			if(c2!=' ') {
				cc.add(c2);
			}
		}
	}
	for(Character c:cc) {
	  ret=c+ret;
	}
	return ret;
}
}
