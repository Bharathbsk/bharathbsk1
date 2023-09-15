import java.util.*;
public class ReverseWordsAndCase {
  public static void main(String[] args) {
	  ReverseWordsAndCase w=new ReverseWordsAndCase();
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int n=sc.nextInt();
	String rev=w.reverseWordsAndCase(s,n);
    System.out.println(rev);

}

public String reverseWordsAndCase(String input1,int input2) {
	String rev="";
	if(input2==1) {
		String word[]=input1.split(" "); 
		for(int i=0;i<word.length;i++) {
			String rt="";
			if(word[i].charAt(word[i].length()-1)>='A'&&word[i].charAt(word[i].length()-1)<='Z'||
					word[i].charAt(word[i].length()-1)>='a'&&word[i].charAt(word[i].length()-1)<='z') {
				String wod=word[i].toLowerCase();
			for(int j=0;j<wod.length();j++) {
				char ch=wod.charAt(j);
				if(j==wod.length()-1) {
					rt=(char)(ch-32)+rt;
				}else {
					rt=ch+rt;
				}
			}
			}else {
				for(int j=0;j<word[i].length();j++) {
					rt=word[i].charAt(j)+rt;
				}
			}
			if(i<word.length-1)
			rev=rev+rt+" ";
			else
			rev=rev+rt;
		}
	   }
	if(input2==0) {
			String word[]=input1.split(" "); 
			for(int i=0;i<word.length;i++) {
				String rt="";
				for(int j=0;j<word[i].length();j++) {
					char ch=word[i].charAt(j);
						rt=ch+rt;
				}
				if(i<word.length-1)
					rev=rev+rt+" ";
					else
					rev=rev+rt;
			}
		   }
	return rev;
}
}
