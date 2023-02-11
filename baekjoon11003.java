import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(st.nextToken());
		int window = Integer.parseInt(st.nextToken());
		int [] arr = new int[num];
		Deque<Node> mydeque = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		for(int i =0; i<num;i++) {
			int now =Integer.parseInt(st.nextToken());
			
			while(!mydeque.isEmpty() && mydeque.getLast().value >now) {
				mydeque.removeLast();
			}
			
			mydeque.addLast(new Node(now,i));
			
			if (mydeque.getFirst().index <= i - window) {
				mydeque.removeFirst();
			}
			bw.write(mydeque.getFirst().value + " ");
		}
        bw.flush();
        bw.close();
	}
	static class Node{
		public int value;
		public int index;
		
		Node(int value,int index){
			this.value = value;
			this.index = index;
		}
	}
}