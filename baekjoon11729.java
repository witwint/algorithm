import java.util.Scanner;

public class Main{
    static StringBuilder sb = new StringBuilder();
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = (int)Math.pow(2,num)-1;
        System.out.println(count);
        Hanoi(num,1,2,3);
        System.out.println(sb);
    }
    public static void Hanoi(int num, int start, int to, int end){
        if(num == 1){
        sb.append(start+" "+end+"\n");
            return;
        }
        
        Hanoi(num-1,start,end,to);
        sb.append(start+" "+end+"\n");
        Hanoi(num-1,to,start,end);
    }
}