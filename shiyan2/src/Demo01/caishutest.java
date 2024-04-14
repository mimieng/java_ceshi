package Demo01;
import java.util.Random;
import java.util.Scanner;
public class caishutest {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int count=0 ;
    Random r=new Random();
    int number2=r.nextInt(100)+1;

    while(true){


        System.out.println(number2);
        System.out.println("请输入想猜的数字");
        int number1=sc.nextInt();
        count++;
        if(count==5){
            System.out.println("猜中了");
            break;
        }
        if(number1==number2){
        System.out.println("猜中了");
        break;
        }
        else if(number1<number2){
                System.out.println("猜小了");
            }
        else if(number1>number2){
            System.out.println("猜大了");
        }

    }
}
}