import java.util.*;
public class  CreatePIN {
  public static void main(String[] args) {
	  CreatePIN m=new  CreatePIN();
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println("output");
	int k=m.createPIN(a,b,c);
	System.out.println(k);
}
  //100% pass
public int createPIN(int input1, int input2, int input3) {                
	int[] digitsFreq={0,0,0,0,0,0,0,0,0,0};
    int min = 9;
    int max = 0;
    int d;
    while(input1!=0)
    {
        d = input1 % 10;
        digitsFreq[d]++;
        input1 /= 10;
        if(d >= max)
        max = d;
        if(d<=min)
        min = d;
    }
    while(input2!=0)
    {
        d = input2 % 10;
        digitsFreq[d]++;
        input2 /= 10;
        if(d >= max)
        max = d;
        if(d<=min)
        min = d;
    }
    while(input3!=0)
    {
        d = input3 % 10;
        digitsFreq[d]++;
        input3 /= 10;
        if(d >= max)
        max = d;
        if(d<=min)
        min = d;
    }
    int minFreq=12;
    int maxFreq=0;
    int minFreqNo=0;
    int maxFreqNo=0;
    for(int i=9 ; i>=0 ;i--) {
        if(digitsFreq[i]>0 && digitsFreq[i]<= minFreq){
            minFreq = digitsFreq[i];
            minFreqNo = i;
        }
    }
    for(int i=0 ; i<10 ;i++)
    {
        if(digitsFreq[i] >= maxFreq)
        {
            maxFreq = digitsFreq[i];
            maxFreqNo = i;
        }
    }
    String r =maxFreqNo+""+minFreqNo+""+max+""+min;
    int res = Integer.parseInt(r);
    return res; 
}
}
