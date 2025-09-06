import java.util.Scanner;

class EvennOdd{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if( n % 2==0)
        {
            System.out.println("even number");

        }
        else {
            System.out.println("odd number");

        }
    }
}