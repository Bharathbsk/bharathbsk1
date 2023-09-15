import java.util.HashMap;
import java.util.Scanner;

public class FindPassword$ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FindPassword$ m=new FindPassword$();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();
		int ret=m.findPassword(a,b,c,d,n);
		System.out.println(ret);
	}
    public int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int stableSum = 0;
        int unstableSum = 0;
        stableSum += isStable(input1) ? 1 : 0;
        stableSum += isStable(input2) ? 1: 0;
        stableSum += isStable(input3) ? 1: 0;
        stableSum += isStable(input4) ? 1: 0;
        stableSum += isStable(input5) ? 1: 0;

        unstableSum += !isStable(input1) ? 1: 0;
        unstableSum += !isStable(input2) ? 1: 0;
        unstableSum += !isStable(input3) ? 1: 0;
        unstableSum += !isStable(input4) ? 1: 0;
        unstableSum += !isStable(input5) ? 1: 0;

        return (unstableSum*10) + stableSum;
    }
    private static boolean isStable(int number) {
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