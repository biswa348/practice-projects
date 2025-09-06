import java.util.Scanner;

public class ThreeLarge {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
       String bigger=a>b?a +" is greater":(b>c?b+" is greater":c +" is greater");
        System.out.println(bigger);
    }
}
