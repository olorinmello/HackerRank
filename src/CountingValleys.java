import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int seaLevel = 0;
        int walleyCounter = 0;
        int mountainCounter = 0;
        int upCounter = 0;
        int downCounter = 0;
        boolean inTheWalley = false;
        boolean inTheMountain = false;
        char[] steps = s.toCharArray();
        for (int i = 0; i < steps.length; i++) {
            if (steps[i] == 'D') {
                downCounter++;
                seaLevel--;
                if (seaLevel < 0) {
                    inTheWalley = true;
                    inTheMountain = false;
                } else if (seaLevel == 0){
                    if (inTheMountain == true) {
                        mountainCounter++;
                    }
                    inTheWalley = false;
                    inTheMountain = false;
                } else if (seaLevel > 0){
                    inTheWalley = false;
                    inTheMountain = true;
                }
            } else if (steps[i] == 'U') {
                upCounter++;
                seaLevel++;
                if (seaLevel > 0) {
                    inTheMountain = true;
                    inTheWalley = false;
                } else if(seaLevel == 0){
                    if (inTheWalley == true) {
                        walleyCounter++;
                    }
                    inTheWalley = false;
                    inTheMountain = false;
                } else if(seaLevel < 0){
                    inTheWalley = true;
                    inTheMountain = false;
                }
            }
        }
        return walleyCounter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Burak\\Desktop\\testout.txt"));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String s = scanner.nextLine();

        int n = 10;
        String s = "DUDDDUDUUU";
        int result = countingValleys(n, s);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

//        scanner.close();
    }
}
