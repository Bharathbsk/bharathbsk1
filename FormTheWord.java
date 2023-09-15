import java.util.*;
public class FormTheWord {
     public static void main(String[] args) {
    	 FormTheWord m=new FormTheWord();
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String k=m.formTheWord(s);
		System.out.println(k);
	}
     
	public String formTheWord(String input1) {
		String arr[]=input1.split(":");
		String r="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i].charAt(0)==arr[i].charAt(1)) {
				r=r+arr[i].charAt(0);
			}else {
				int k=(char)arr[i].charAt(0)-(char)arr[i].charAt(1);
				r=r+(char)(64+k);
			}
			}
		String ret=r.toUpperCase();
		
		return ret;
	}
}
