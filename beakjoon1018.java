import java.util.Scanner;

public class Main{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int col = sc.nextInt();
		int low = sc.nextInt();
		String a = sc.nextLine();
		String []bord = new String[col];
		for(int i = 0; i < col;i++) {
				bord[i] = sc.nextLine();
			
		}
		sc.close();
		
		int re = 64;
		for(int iplus = 0; iplus<=col-8;iplus++ ) {
			for(int jplus = 0; jplus<=low-8; jplus++) {
				
				int count1 = 64;
				char word1 = 'B';

		for(int i = iplus; i < iplus+8;i++) {
			if(word1 == 'B') {
				word1 = 'W';
			} else {
				word1 = 'B';
			}
			for(int j = jplus; j < jplus+8; j++) {
				if(bord[i].charAt(j) != word1) {
					count1--;
				}
				if(word1 == 'B') {
					word1 = 'W';
				} else {
					word1 = 'B';
				}
				
			}
		}
		if(count1 > 64-count1) count1 = 64-count1;
		if(re > count1) re = count1;
		}
	}
		System.out.print(re);
		}
		
		
	}