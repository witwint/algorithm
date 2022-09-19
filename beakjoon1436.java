import java.util.Scanner;

public class Main{
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int c = 0;
		int re = 0;
		for(int i = 0;c<n;i++) {
			if(Integer.toString(i).contains("666")){
				c++;
				if(c == n) {
				re = i;
				}
			}
		}
		System.out.println(re);
	}
}