import java.util.Scanner;

public class Primecheck {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int n=scan.nextInt();


if(n<=1)
{
    System.out.println("not prime number");
}
    boolean isPrime=true ;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
                if(isPrime){
                    System.out.println("prime number ");
                }else {
                    System.out.println("not prime number");
                }




}}
