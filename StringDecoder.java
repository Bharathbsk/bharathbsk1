import java.util.Scanner;
public class StringDecoder{
  public static void main(String[] args) {
	  StringDecoder m=new StringDecoder();
	 Scanner sc=new Scanner(System.in);
	 String a=sc.next();
	String k=m.stringDecoder(a);
	System.out.println(k);
  }
//100%pass
public String stringDecoder(String input1) {
	String wo[]=input1.split("0");
	String ret="";
	for(int i=0;i<wo.length;i++) {
		String rt="";
		int k=wo[i].length();
		for(int j=1;j<=26;j++) {
			if(k==j) {
			rt=""+(char)(64+j);
			}
		}
		ret=ret+rt;
	}
  return ret;
}
}



//11111111111111111111111111011111111111111111111111101111111111111111111111