import java.util.*;
public class FindStringVowelFirstAndLast {
    public static void main(String[] args) {
    	FindStringVowelFirstAndLast f=new FindStringVowelFirstAndLast();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String word[]=new String[n];
		for(int i=0;i<n;i++) {
			word[i]=sc.next();
		}
		String ret=f.findStringVowelFirstAndLast(n,word);
		System.out.println(ret);
	}

	public String findStringVowelFirstAndLast(int input1, String[] input2) {
		String ret="";
		for(int i=0;i<input2.length;i++) {
		    String k=input2[i].toLowerCase();
		    int len=input2[i].length()-1;
		    if((k.charAt(0)=='a'||k.charAt(0)=='e'||k.charAt(0)=='i'
		    ||k.charAt(0)=='o'||k.charAt(0)=='u')&&(k.charAt(len)=='a'
		 ||k.charAt(len)=='e'||k.charAt(len)=='i'||k.charAt(len)=='o'
		 ||k.charAt(len)=='u')){
		                         ret=ret+k;   	
		    }
		}
	    if(ret.isEmpty()||ret==null) {
	    	return "no matches found";
	    }
	    return ret;
	}
}
