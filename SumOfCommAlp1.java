import java.util.HashSet;
import java.util.Scanner;
public class SumOfCommAlp1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SumOfCommAlp1 ss=new SumOfCommAlp1();
		char arr[]= {'g','q','r'};
		char brr[]= {'r','t','u'};
		
		int k=ss.SumOfCommonAlpha(arr,brr);
		System.out.println(k);
	}
	//100% working
	public int SumOfCommonAlpha(char[] input1, char[] input2){             
        HashSet<Character> set = new HashSet<Character>();
        int sum=0;
        for(int i=0; i<input1.length; i++){
        for(int j=0; j<input2.length; j++){
            if(input1[i]==input2[j]) {
            	 sum=sum+input1[i];
          }
            }
        }
        if(sum%9==0){
            return 9;
        }
        int num=0;
        while(sum!=0 || num>9 ){
            num=num+sum%10;
            sum=sum/10;
            if(sum==0 && num>9 ){
                sum=num;
                num=0;
            }
        }

        return num;
    }
}
