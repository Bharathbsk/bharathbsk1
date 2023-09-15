import java.util.Scanner;
public class FindOrderWordsCount {
     public static void main(String[] args) {
    	 FindOrderWordsCount u=new FindOrderWordsCount();
    	 Scanner sc=new Scanner(System.in);
    	 String input1=sc.nextLine();
    	 int ret=u.findOrderWordsCount(input1);
    	 System.out.println(ret);
	}

	public int findOrderWordsCount(String input1) {
		int count=0;
		String word[]=input1.split(" ");
		for(int i=0;i<word.length;i++) {
			int sum=0;
            int big=word[i].charAt(0);
		     for(int j=1;j<word[i].length();j++) {
		    	 if(big<=word[i].charAt(j)) {
		    		 big=word[i].charAt(j);
		    	 }else {
		    		sum=sum+1;
		    		break;
		    	 }
		     }
		    if(sum==0) {
		    	count=count+1;
		    }
		}
		return count;
	}
}