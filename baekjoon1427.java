import java.util.Scanner;

public class Main{
	public static void main(String []args ) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		int [] a = new int [str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			a[i] = Integer.parseInt(str.substring(i,i+1));
		}
		
		
		for(int i = 0; i < str.length(); i++) {
			int max = -1;
			int id = 0;
			for(int j = i; j < str.length(); j++) {
				if (a[j] > max) {
					max = a[j];
					id = j;
				}
			}
			int tem = a[i];
			a[i] = max;
			a[id] = tem;
			
		}
		for(int i = 0; i < str.length(); i++) {
			System.out.print(a[i]);
		}
	}
}