import java.util.Scanner;
public class TotalOccurrence {
  public static void main(String[] args) {
	  TotalOccurrence m=new TotalOccurrence();
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("output");
	int k=m.findTotalOccurrence(a,b);
	System.out.println(k);
}

public int findTotalOccurrence(int input1, int input2){
	String s=String.valueOf(input1);
    int count=0;
    for(int i=0;i<=input2;i++)
    {
        String k=String.valueOf(i);
        for(int j=0;j<k.length();j++)
        {
            if(String.valueOf(k.charAt(j)).equals(s))
            {
                count++;
            }
        }
    }
    return count;
   }
}
