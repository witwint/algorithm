import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] arr = new int [num];
		for(int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int [] ans = new int[num];
		Stack<Integer> myStack = new Stack<>();
		myStack.push(0);
		for(int i = 1; i<num;i++) {
			while (!myStack.isEmpty() && arr[myStack.peek()] < arr[i]) {
				ans[myStack.pop()] = arr[i];
			}
			myStack.push(i);
			
			

		}
		while(!myStack.isEmpty()) {
			ans[myStack.pop()] = -1;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i <num; i ++) {
			bw.write(ans[i]+" ");
		}
		bw.flush();
		
	}
}