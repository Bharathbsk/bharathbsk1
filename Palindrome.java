import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Palindrome p=new Palindrome();
	String a=sc.nextLine();
	String ret=p.reverseString(a);
	System.out.println(ret);
	}

	public String reverseString(String input1) {
		String word[]=input1.split(" ");
	    String ret="";
        for(int i=0;i<word.length;i++) {
        	String rev="";
        	for(int j=0;j<word[i].length();i++) {
        		char ch=word[i].charAt(j);
        		rev=ch+rev;
        	}
        		ret=ret+rev+" ";
        }
	     return ret;
	    }
}
