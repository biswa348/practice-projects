import java.util.Scanner;

public class Arraygcd {
    public static int gcd(int a,int b)
    {
        if (b==0)
        {
            return a;
        }
        return gcd(b,a%b);




    }

    public static void main(String[] args) {
        System.out.println("enter the array element number");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("enter tyeh arry elements");

             arr[i]=s.nextInt();
        }
        int result=arr[0];
        for (int i = 0; i <n ; i++) {

            result =gcd(result,arr[i]);

        }
        System.out.println("GCD of given nos "+result);
    }
}
