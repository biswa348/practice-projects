import java.util.Scanner;

public class reverseanumber {
   static  int n;
   static int num;
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

         while(n!=0){
             int digit=n%10;//bhagashesha or remainder
             num=num *10+digit;//daska ghara multiply
             n=n/10;//bhagaphala or qoutient



        }
        System.out.println(num);

    }
}
