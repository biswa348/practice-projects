import java.util.Scanner;

public class FibonacciRec {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            fib(i);

        }
    }
    static int fib(int n){
        if(n==0){return 0;}
        if (n==1){return 1;}
       return fib(n-1)+fib(n-2);

    }
}

