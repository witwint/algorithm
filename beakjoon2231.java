import java.util.Scanner;

public class Main{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int re = 0;
		for(int i =num; i > 0; i--) {
			String temp = Integer.toString(i);
			int[] digits = new int[temp.length()];
			int headsum = 0;
			for (int j = 0; j < temp.length(); j++) {
				digits[j] = temp.charAt(j) - '0';
				headsum += digits[j];
			}
			if(num == i+headsum) {
				re = i;
			}
		}
		System.out.println(re);
	}
}