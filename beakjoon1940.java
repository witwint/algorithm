import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int sum = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int []arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int count = 0;
		int i = 0;
		int j = num-1;
		while(i<j) {
			if(arr[i]+arr[j]>sum) {
				j--;
			}
			else if(arr[i]+arr[j] == sum) {
				count++;
				i++;
				j--;
			}
			else {
				i++;
			}
		}
		System.out.println(count);
		br.close();
		
	}
}