import java.util.Scanner;

public class Main{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int arr [] = new int[count];
		for(int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 1; i < count; i++) {
			int targetid = i;
			int targetval = arr[i];
			for(int j = 0; j <= i; j++) {
				if(arr[i]<arr[j]) {
					for(int k = targetid; k > j; k--) {
						arr[k] = arr[k-1];
					}
					arr[j] = targetval;
					
				}
			}
		}
		
		int arrsum[] = new int [count];
		arrsum[0] = arr[0];
		int time = arr[0];
		for(int i = 1; i<count; i++) {
			arrsum[i] = arrsum[i-1] + arr[i];
			time += arrsum[i];
		}
		System.out.print(time);
		
	}

}