import java.util.Scanner;

public class Main{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int ans = sc.nextInt();
		int [] num = new int[count];
		for(int i = 0; i<count ; i++) {
			if(i == 0) {
				num[i] = sc.nextInt();
			} else {
				num[i] = num[i-1] + sc.nextInt();
			}
		}
		int a,b = 0;
		for(int i = 0; i<ans; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a == 1) {
				System.out.println(num[b-1]);
			} else {
			System.out.println(num[b-1] - num[a-2]);
			}
		}
	}
}