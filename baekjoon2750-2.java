import java.util.Scanner;

public class Main{
	public static void main(String []args) {
		Scanner sc  = new Scanner(System.in);
		int count  = sc.nextInt();
		int [] num = new int [count];
		for(int i = 0; i < count; i++) {
			num[i] = sc.nextInt();
		}
		for(int i = 0; i < count-1; i++) {
			for(int j = 1; j<count-i; j++) {
				if(num[j-1]>num[j]) {
					int tem = num[j-1];
					num[j-1] = num[j];
					num[j] = tem;
				}
			}
		}
		for(int i = 0; i < count; i++) {
			System.out.println(num[i]);
		}
	}
}