import java.util.Scanner;

public class Pallindrome {

    private static long n;

    public static boolean isPallindrome(long n) {


        Scanner scan = new Scanner(System.in);
        n = scan.nextLong();


        long reverse = 0;

        long original = n;
        while (n > 0) {
            long digit =n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
     boolean result;
        result = (original == reverse ? true : false);
        return result;
    }


    public static void main(String[] args) {
       String result1=(isPallindrome(n)?"pallindrome":"not pallindrome");

        System.out.println(result1);
    }
}