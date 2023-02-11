import java.util.Scanner;

public class Main{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int [][]num = new int[count][2];
		for(int i =0; i<count;i++) {
			num[i][0] = sc.nextInt();
			num[i][1] = sc.nextInt();
		}
		sc.close();
		for(int i =0;i<count;i++) {
			int rank = 1;
			for(int j = 0; j<count;j++) {
				if (i==j) continue;
				if(num[i][0] < num[j][0] && num[i][1] < num[j][1]) {
					rank++;
				}
			}
			System.out.print(rank+" ");
		}
		
	}
}