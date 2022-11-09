import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;

public class Main{
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		int []arr = new int [num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < num ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for(int k = 0; k<num; k++) {
			int find = arr[k];
			int i = 0;
			int j = num-1;
			while(i<j) {
				if(arr[i]+arr[j] == find) {
					if(i != k && j != k) {
						count++;
						break;
						
					} else if(i ==k) {
						i++;
					} else {
						j--;
					}
				
					
					
				} else if (arr[i]+arr[j]< find) {
					i++;
				} else {
					j--;
				}
			}
		}
		System.out.println(count);
		br.close();
	}
}