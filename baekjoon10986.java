import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int [] num = new int [a];
		long [] sum = new long [a];
		long ans = 0;
		long [] c = new long [b];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		sum[0] = num[0];
		for(int i = 1; i < a; i++) {
			sum[i] = sum[i-1] + num[i];
		}
		for(int i = 0; i < a; i++) {
			int remainder = (int)(sum[i]%b);
			if(remainder ==0) ans++;
			c[remainder]++;
		}
		
		for(int i = 0;i<b;i++) {
			if(c[i]> 1) {
				ans = ans + (c[i]*(c[i]-1)/2);
			}
		}
		
		System.out.println(ans);
	}
}