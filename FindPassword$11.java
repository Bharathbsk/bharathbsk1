import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FindPassword$11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FindPassword$11 m=new FindPassword$11();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();
		int ret=m.findPassword(a,b,c,d,n);
		System.out.println(ret);
	}
    public int findPassword(int input1, int input2, int input3, int input4, int input5) {
        List<Integer> ut=new ArrayList<>();
        List<Integer> st=new ArrayList<>();
        if(!isStable(input1))
        	ut.add(input1);
        else
        	st.add(input2);
        if(!isStable(input2))
        	ut.add(input2);
        else
        	st.add(input1);
        if(!isStable(input3))
        	ut.add(input3);
        else
        	st.add(input3);
        if(!isStable(input4))
        	ut.add(input4);
        else
        	st.add(input4);
        if(!isStable(input5))
        	ut.add(input5);
        else
        	st.add(input5);
        return Collections.max(st)+ Collections.min(ut);
    }
    static boolean isStable(int number) {
        HashMap<Integer, Integer> digitFrequency = new HashMap<>();
        while (number > 0) {
            int digit = number % 10;
            digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
            number /= 10;
        }
        int firstFrequency = -1;
        for (int frequency : digitFrequency.values()) {
            if (firstFrequency == -1) {
                firstFrequency = frequency;
            } else if (firstFrequency != frequency) {
                return false;
            }
        }

        return true;
    }
}