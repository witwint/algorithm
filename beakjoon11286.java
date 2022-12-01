import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main{
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2)->{
			int first = Math.abs(o1);
			int second = Math.abs(o2);
			if(first == second) {
				return o1 >o2 ? 1 : -1;
			} else {
				return first - second;
			}
		});
		for(int i = 0; i<num;i++) {
			int next = Integer.parseInt(br.readLine());
			if(next == 0) {
				if(myQueue.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(myQueue.poll());
				}
			} else {
				myQueue.add(next);
			}
		}
	}
}