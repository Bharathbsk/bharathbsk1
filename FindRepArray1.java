import java.util.HashMap;
import java.util.Scanner;
public class FindRepArray1 {
	public static void main(String[] args) {
		FindRepArray1 m=new FindRepArray1();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ret=m.findRepArray(arr,n);
		System.out.println(ret);
	}

	public  int findRepArray(int[] input1, int input2) {
		int input3[]=new int[input1.length];
		int k=0;
		for(int i=input1.length-1;i>=0;i--) {
			input3[k]=input1[i];
			k++;
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<input2;i++) {
			if(input3[i]>0) {
				if(map.containsKey(input3[i])) {
					return input3[i];
				}
				map.put(input3[i], 1);
			}
		}
		if(map.isEmpty())
			return 0;
		return input3[0];
	}
    
}