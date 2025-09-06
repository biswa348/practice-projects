import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
int original=num;
        String s=""+num;
   int  length =s.length();
    double sum=0;
    while(num>0){
      int  digit=num%10;
        sum+=Math.pow(digit,length);
        num=num/10;
    }
        System.out.println((original==sum?sum+" is Armstrong number":sum+" is not armstrong number"));
    }

}
