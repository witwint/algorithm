import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int len = Integer.parseInt(st.nextToken());
		int winlen = Integer.parseInt(st.nextToken());
		char []arr = new char[len];
		st =new StringTokenizer(br.readLine());
		String a = st.nextToken();
		for(int i = 0; i<len;i++) {
			arr[i] = a.charAt(i);
		}
		st = new StringTokenizer(br.readLine());
		int []charMinCount = new int[4];
		for(int i =0; i < 4; i ++) {
			charMinCount[i] = Integer.parseInt(st.nextToken());
		}
		int i = 0;
		int j = winlen-1;
		int count = 0;
		int []charCount = new int[4];
		for(int k = 0; k<=winlen-1;k++) {
			if(arr[i+k] == 'A') {
				charCount[0]++;
			} else if(arr[i+k] == 'C') {
				charCount[1]++;
			} else if(arr[i+k] == 'G') {
				charCount[2]++;
			} else {
				charCount[3]++;
			}
			
		}
		if (charMinCount[0] <= charCount[0] && charMinCount[1] <= charCount[1] && charMinCount[2] <= charCount[2] && charMinCount[3] <= charCount[3]) {
			count++;
		}
		j++;
		i++;
		while(j<len) {
			if(arr[j] == 'A') {
				charCount[0]++;
			} else if(arr[j] == 'C') {
				charCount[1]++;
			} else if(arr[j] == 'G') {
				charCount[2]++;
			} else {
				charCount[3]++;
			}
			
			if(arr[i-1] == 'A') {
				charCount[0]--;
			} else if(arr[i-1] == 'C') {
				charCount[1]--;
			} else if(arr[i-1] == 'G') {
				charCount[2]--;
			} else {
				charCount[3]--;
			}
			
			if (charMinCount[0] <= charCount[0] && charMinCount[1] <= charCount[1] && charMinCount[2] <= charCount[2] && charMinCount[3] <= charCount[3]) {
				count++;
			}
			
			j++;
			i++;
			
			
			

		}
		System.out.println(count);
		br.close();
	}
}