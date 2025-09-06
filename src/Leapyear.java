import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        System.out.println("enter a year");
        Scanner scan=new Scanner(System.in);
      long year=scan.nextLong();
      String result=((year%4==0||year%400==0&&year%100!=0)
              ?year+" is leap year":year+" not a leap year");
        System.out.println(result);
    }
}
