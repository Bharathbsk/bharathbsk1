import java.util.Scanner;
public class  FindAstringWeight{
  public static void main(String[] args) {
	  FindAstringWeight m=new  FindAstringWeight();
	Scanner sc=new Scanner(System.in);
	String b=sc.nextLine();
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int ret=m.findAstringWeight(a,b);
	System.out.println(ret);
  }

public int findAstringWeight(int[] input1, String input2) {                                   //100%pass
    String wo[]=input2.split(" ");
    int sum=1;
    for(int l=0;l<wo.length;l++) {
	int ret=0;
	String k=wo[l].toUpperCase();
	for(int i=1;i<=26;i++)
		for(int j=0;j<k.length();j++) {
			char ch=k.charAt(j);
			if((char)(64+i)==ch) {
				ret=ret+input1[i-1];
				if(j==0 &&input1[i-1]<0||j==k.length()-1&&input1[i-1]<0){
					ret=ret+i;
				}
			}
		}
	sum=sum*ret;
	ret=0;
    }
	return sum;
}


}
//26
//15 16 1 -2 -13 61 11 4 3 19 -4 17 -3 90 -65 67 12 0 13 2 3 43 21 -17 2 42
//26
//12 11 6 1 -1 23 12 1 28 -43 6 98 11 2 7 88 9 -4 -54 25 19 -12 -32 65 3 -9