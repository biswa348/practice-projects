import java.util.Scanner;

public class Gecd {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        System.out.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        int i=0;
        if (b == 0) {
            return a;

        }

        return gcd(b,a%b);

    }
}


