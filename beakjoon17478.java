import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("�����Է�");
        int num = sc.nextInt();
        sc.close();
        System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
        answer(num,num);
    }
    public static void answer(int n,int num){
        int count = num - n;
        String hypen = "";
        if (n == 0){
        for(int i = 0; i < count*4; i++ ){
            hypen += "_";
        }
            System.out.println(hypen+"\"����Լ��� ������?\"");
            System.out.println(hypen+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
            System.out.println(hypen+"��� �亯�Ͽ���.");
            return;
        }
        for(int i = 0; i < count*4; i++ ){
            hypen += "_";
        }
        System.out.println(hypen+"\"����Լ��� ������?\"");
        System.out.println(hypen+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
        System.out.println(hypen+"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
        System.out.println(hypen+"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
        answer(n-1,num);
        System.out.println(hypen+"��� �亯�Ͽ���.");
        
        
    }
}