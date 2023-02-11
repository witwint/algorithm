import java.util.Scanner;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
	public static void main(String []args)throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(bf.readLine());
		int []num = new int[count];	
		for(int i = 0; i<count; i++) {
			num[i] = Integer.parseInt(bf.readLine());
		}
		sc.close();
		int max =0;
		for(int i = 0; i<count; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		int []index = new int[max+1];
		int []rearr = new int[count];
		for(int i = 0; i<count; i++) {
			index[num[i]]++;
		}
		for(int i = 1; i<max+1;i++) {
			index[i] +=index[i-1];
		}
		for(int i = 0; i<count; i++) {
			rearr[--index[num[i]]] = num[i];
		}
		StringBuilder sb =  new StringBuilder();
	       for(int i = 0; i<count; i++){
	       	sb.append(rearr[i]+"\n");
	           
	       }
	   System.out.print(sb);
	}
}