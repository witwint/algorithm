import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int [][] num = new int [a+1][a+1];
        int [][] sum = new int [a+1][a+1];
        for (int i = 1; i < a+1; i ++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j < a+1; j ++){
                num[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i < a+1; i ++){
            for(int j = 1; j < a+1; j++){
                sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + num[i][j];
            }
        }
        
        for(int i = 0; i < b; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int re = sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1-1] + sum[x1-1][y1-1];
            System.out.println(re);
        }
        
    }
}