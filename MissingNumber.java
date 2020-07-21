import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n - 1 ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println( returnMissingNumber(arr,n));
    }

    public static int returnMissingNumber(int[] arr, int size) {
        Arrays.sort(arr);
        int missing = size ;

        for(int i = 0 ; i <= size-1; i++) {
            if(arr[i] != i+1) {
                missing = i+1;
            }
        }


        return missing;

    }
}