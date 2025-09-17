import java.util.Scanner;

public class LargestnsmallestInarray {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
     int   n=scanner.nextInt();
        System.out.println("enter the elements of array");
        int[] arr =new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = scanner.nextInt();
        }


        for (int i = 0; i <n; i++) {
            for (int j = 1; j <n-1 ; j++) {
                if (arr[i]>arr[j])

                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[i]=temp;
                }
            }



        }
        System.out.println("Largest number is "+arr[n-1] );
        System.out.println("smallest numbr is "+arr[0]);
        }
    }


