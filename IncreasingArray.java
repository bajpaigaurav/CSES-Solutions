import java.util.Scanner;

public class IncreasingArray {
    


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        long[] arr = new long[n];

        for(int i = 0; i < n ; i++) {
            arr[i] = in.nextInt();
        }

        if(n == 1) {
            System.out.println(0);
        } else {
            System.out.println(numberOfPasses(arr, n));
        }
        
        
    }

    public static long numberOfPasses(long[] arr, int n) {
        long passes = 0;

        for(int i = 0 ; i < n - 1 ; i++) {
            if(arr[i + 1] < arr[i]) {
                passes += arr[i] - arr[i+1];
                arr[i+1] = arr[i] - arr[i+1] + arr[i+1];
            }
        }

        return passes;
    }
}
