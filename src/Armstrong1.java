import java.util.Scanner;

public class Armstrong1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number");
        int num=scan.nextInt();
        int original=num;

        int digits=0; int temp=num;
        while(temp>0)
        {
            digits++;
            temp/=10;
        }
        int sum=0;
        temp=num;
        while (temp>0){
            int digit=temp%10;
              int power=1;
            for (int i = 0; i <digits ; i++) {

                power *= digit;

            }
           sum=sum+power;
            temp=temp/10;
        }
if (original==sum) {
    System.out.println(num + " armstrong number");
}
else{
    System.out.println(num+" not armstrong");

    }



    }
}
