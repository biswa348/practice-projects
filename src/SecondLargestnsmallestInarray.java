import java.util.Arrays;

public class SecondLargestnsmallestInarray {
    public static void main(String[] args) {

        int arr[] = {1, 67, 98, 30, 30, 34};
        Arrays.sort(arr);
        int largest = arr[5];

        int secondLargest = 0;
        for (int i = 4; i <5 ; i++) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }


        }
        System.out.println("secondLargestis "+secondLargest);
    }

    }

