import java.util.Scanner;

public class LCM {
public static int gcd (int a ,int b){
    if( b==0){
        return a;
    }
    else{
        return gcd(b,a%b);
    }
}

    public static void main(String[] args) {
        System.out.println("enter the nos");
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
     int a=s.nextInt();
    int lcm=a*b/gcd(a,b);
        System.out.println("lcm of " +a+"& "+b+"is "+lcm);
    }
}
