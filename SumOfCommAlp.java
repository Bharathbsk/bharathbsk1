import java.util.*;
public class SumOfCommAlp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SumOfCommAlp ss=new SumOfCommAlp();
		char arr[]= {'A','B','C'};
		char brr[]= {'B','C'};
		
		int k=ss.SumOfCommonAlpha(arr,brr);
		System.out.println(k);
	}
			public int SumOfCommonAlpha(char[] input1, char[] input2){
				char ch[]=new char[input1.length+input2.length];
				int k=0;
				for(int i=0,j=0;i<input1.length||j<input2.length;i++,j++) {
					if(i<input1.length) {
						ch[k]=input1[i];
						k++;
					}
					if(j<input2.length) {
						ch[k]=input2[j];
						k++;
					}
				}
			        int sum=0;
			        int count=0;
			        for(int i=0; i<ch.length; i++){
			        for(int j=0; j<ch.length; j++){
			        	if(i!=j) {
			        		if(ch[i]==ch[j]) {
			        			count++;
			        		}
			        	}
			            }
			        if(count==0) {
			        	sum=sum+ch[i];
			        }
			        count=0;
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
