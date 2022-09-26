import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int roof = count;
		int cut = sc.nextInt();
		int re = 0;
		int []num = new int[count];
		for(int i = 0; i<count; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 0; i<count-1; i++) {
			for(int j = 0; j<roof-1; j++) {
				if(num[j]>num[j+1]){
                    int a = num[j];
                    num[j] = num[j+1];
                    num[j+1] = a;
                }
			}
			roof--;
			
		}
		re = num[count-cut];
		System.out.println(re);
	}
}