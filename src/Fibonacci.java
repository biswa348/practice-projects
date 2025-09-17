import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fib1 = 0, fib2 = 1;
        int fib=0;
        System.out.print(fib1+" ");
        System.out.print(fib2+" ");
        for (int i = 0; i < n-2; i++) {

             fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
            System.out.print(fib+" ");

    }
}
    }