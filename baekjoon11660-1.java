import java.util.Scanner;

public class Main{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = sc.nextInt();
		int [][] num = new int [N][N];
		num[0][0] = 0;
		for(int i = 0; i< N ;i++) {
			for(int j = 0; j<N;j++) {
				if(i==0 && j==0) {
					num[i][j] = sc.nextInt();
				} else if(i==0&&j!=0){
					num[i][j] = num[N-1][j-1] +sc.nextInt();
					
				} else {
					num[i][j] = num[i-1][j] + sc.nextInt();
				}
			}
		}
		int [][] ansnum = new int [ans][4];
		for(int i = 0; i<ans; i++) {
			for(int j = 0; j<4; j++) {
				ansnum[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<ans; i++) {
			System.out.println(num[ansnum[i][2]-1][ansnum[i][3]-1] - num[ansnum[i][0]-1][ansnum[i][1]-1]);
		}
	}
}