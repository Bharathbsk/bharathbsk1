import java.util.*;

public class FindPassword3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FindPassword3 m=new FindPassword3();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ret=m.findPassword(arr,n);//1036 type
		System.out.println(ret);
	}//100%

	public int findPassword(int[] input1, int input2) {
        List<Integer> li=new ArrayList<>();
        String k="";
        int fc=0;
        int m=0;
        int sc=0;
        int sum=0;
        int sum1=0;
        if(input1.length>1) {
           
        	for(int i=0;i<input1.length;i++) {
             int cou=0;
             int count=0;
              for(int j=0;j<input1.length;j++) {
                if(input1[i]==input1[j]) {
                  count++;
                }
                if(i!=j) {
                  if(input1[i]==input1[j]) {
                    cou++;
                  }
                }
                 }
              if(cou==0) {
                li.add(input1[i]);
              }
                if(count>sum) {
                  sc=fc;
                  fc=input1[i];
                  sum=count;
                }
                if(count>sum1 && count<sum) {
                  sc=input1[i];
                  sum1=count;
                }
              count=0;
           }
        }
        Collections.sort(li);
        m=li.get(0);
        k=k+sc+fc;
        int ret=Integer.parseInt(k);
        return ret;
	       }
      }
    
//10
//12 2 36 10 217 36 5 36 15 10     =21036
//16
//5 123 12 45 62 77 89 23 12 14 11 14 12 90 89 12   =58912