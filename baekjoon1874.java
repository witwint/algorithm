import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.IOException;
import java.lang.StringBuffer;

public class Main{
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int []arr = new int[num];
		for(int i =0 ; i <num;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Stack<Integer> stack = new Stack<>();
		StringBuffer sb = new StringBuffer();
		int index = 1;
		boolean result = true;
		for(int i = 0; i<num; i++) {
			int tem = arr[i];
			if(index<=tem) {
				while (index<=tem) {
					stack.push(index++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			}
			else {
				int n = stack.pop();
				if(n>tem) {
					System.out.print("NO");
					result = false;
					break;
				} else {
					sb.append("-\n");
				}
			}
		}
		
		if(result) System.out.println(sb.toString());
		
	}
}