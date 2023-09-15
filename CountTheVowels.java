import java.util.*;
public class CountTheVowels {
  public static void main(String[] args) {
	  CountTheVowels m=new  CountTheVowels();
	 Scanner sc=new Scanner(System.in);
	 String a=sc.next();
	String k=countTheVowels(a);
	System.out.println(k);
  }

public static String countTheVowels(String input1) {
	String re="";
	String cc="";
	String m=input1.toUpperCase();
     Set<String> li=new TreeSet<>();
	if(m.contains("A")&&m.contains("E")&& m.contains("I")&&m.contains("O")&& m.contains("U")) {
		int count=0;
		for(int i=0;i<m.length();i++) {
			char ch=m.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				count++;
				li.add(ch+"");
			}
		}
		if(count==li.size()) {
			for(int i=0;i<m.length();i++) {
				char ch=m.charAt(i);
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				}else {
					re=re+ch;
				}
			}
			cc=re.length()+"";
		}else {
			for(int i=0;i<input1.length();i++) {
				re=m.charAt(i)+re;
			}
			  cc="ERROR";	
		}	
	}
	else 
	{
	for(int i=0;i<input1.length();i++) {
	re=m.charAt(i)+re;
	}
	  cc="ERROR";
	}
	return re+":"+cc;
}

}
