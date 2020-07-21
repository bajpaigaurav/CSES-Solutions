import java.util.Scanner;

public class Repetitions {
    

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(maxRepetitions(str));
    }

    public static int maxRepetitions( String str) {
        int max = 1;
        int count = 1;
        for(int i = 0 ; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else {
                count = 1;
            }
            if(max < count) {
                max = count;
            }
            
        }


        return max;
    }
}