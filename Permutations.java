import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Permutations {
    


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();

        if(n == 1) {
            out.println(1);
            out.flush();
        } else if (n == 2 || n == 3){
            out.println("NO SOLUTION");
            out.flush();
        } else if (n ==4) {
            out.println("3 1 4 2");
            out.flush();
        } else {
            returnPermutation(n);

        }
        
    }

    public static void returnPermutation(int n) {

        PrintWriter out = new PrintWriter(System.out);
        // int[] arr = new int[n];

        // for(int i = 0; i < n; i++ ) {
        //     arr[i] = i+1;
        // }
        int i = 1;
        int index = 0;
        // filling in odd numbers 
        while( i <= n) {
            //arr[index] = i;
            out.print(i+" ");
            i = i+2;
            index++;
        }
        // filling in even numbers
        // i = n % 2 == 0 ? n :  n-1;
        i = 2;
        while(i <= n) {
            // arr[index] = i;
            out.print(i+" ");
            index++;
            i = i + 2;
        }
        out.flush();
        // return arr;
    }
}