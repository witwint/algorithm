import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int max = sc.nextInt();
        
        int []num = new int[count];
        int sum = 0;
        for(int i = 0; i < count; i++){
            num[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < count-2; i++){
            for(int j = i+1; j < count-1; j++){
                for(int k = j+1; k < count; k++){
                    if(max - (num[i]+num[j]+num[k]) >= 0 && max - (num[i]+num[j]+num[k]) < max - sum){
                        sum = num[i]+num[j]+num[k];
                    }
                }
            }
        }
        System.out.println(sum);
    }
}